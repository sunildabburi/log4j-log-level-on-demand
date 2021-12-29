# log4j-log-level-on-demand

Enable log level dynamically for a specific HTTP call without enabling for all users

This is a sample spring boot project that illustrates the use of dynamic log level setting through Log4J library.

In order to initiate a log level change for a specific HTTP call, you would have to pass `X-LOG-LEVEL` header with
either `debug` or `trace` as values and those respective log levels will be enabled just for that call.

### Example:

Start the current application by running `Log4jTestApplication` class and the application will be accessible on `8080`
port.

#### Debug log

```
curl --location --request GET 'localhost:8080/test' --header 'X-LOG-LEVEL: debug'
```

Output:

```
2021-12-29 13:29:29.484              DEBUG 91705 TraceId:                     --- [nio-8080-exec-3] com.dabburi.rest.LogTestController       : Debug log
```

#### Trace log

```
curl --location --request GET 'localhost:8080/test' --header 'X-LOG-LEVEL: trace'
```

Output:

```
2021-12-29 13:29:35.133              DEBUG 91705 TraceId:                     --- [nio-8080-exec-4] com.dabburi.rest.LogTestController       : Debug log
2021-12-29 13:29:35.133              TRACE 91705 TraceId:                     --- [nio-8080-exec-4] com.dabburi.rest.LogTestController       : Trace log
```