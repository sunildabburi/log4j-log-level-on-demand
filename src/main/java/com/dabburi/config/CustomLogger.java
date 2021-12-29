package com.dabburi.config;

/**
 * Implementation of {@link AbstractCustomLogger}
 *
 * @author Sunil Dabburi
 */
public class CustomLogger extends AbstractCustomLogger {

    public CustomLogger(Class<?> source) {
        super(source);
    }

    // info log level
    public void info(String msg) {
        log(INFO_LOG_LEVEL, msg);
    }

    public void info(String format, Object arg) {
        log(INFO_LOG_LEVEL, format, arg);
    }

    public void info(String format, Object arg1, Object arg2) {
        log(INFO_LOG_LEVEL, format, arg1, arg2);
    }

    public void info(String format, Object... arguments) {
        log(INFO_LOG_LEVEL, format, arguments);
    }

    public void info(String msg, Throwable t) {
        log(INFO_LOG_LEVEL, msg, t);
    }

    // warn log level
    public void warn(String msg) {
        log(WARN_LOG_LEVEL, msg);
    }

    public void warn(String format, Object arg) {
        log(WARN_LOG_LEVEL, format, arg);
    }

    public void warn(String format, Object arg1, Object arg2) {
        log(WARN_LOG_LEVEL, format, arg1, arg2);
    }

    public void warn(String format, Object... arguments) {
        log(WARN_LOG_LEVEL, format, arguments);
    }

    public void warn(String msg, Throwable t) {
        log(WARN_LOG_LEVEL, msg, t);
    }

    // error log level
    public void error(String msg) {
        log(ERROR_LOG_LEVEL, msg);
    }

    public void error(String format, Object arg) {
        log(ERROR_LOG_LEVEL, format, arg);
    }

    public void error(String format, Object arg1, Object arg2) {
        log(ERROR_LOG_LEVEL, format, arg1, arg2);
    }

    public void error(String format, Object... arguments) {
        log(ERROR_LOG_LEVEL, format, arguments);
    }

    public void error(String msg, Throwable t) {
        log(ERROR_LOG_LEVEL, msg, t);
    }

    // debug log level
    public void debug(String msg) {
        log(DEBUG_LOG_LEVEL, msg);
    }

    public void debug(String format, Object arg) {
        log(DEBUG_LOG_LEVEL, format, arg);
    }

    public void debug(String format, Object arg1, Object arg2) {
        log(DEBUG_LOG_LEVEL, format, arg1, arg2);
    }

    public void debug(String format, Object... arguments) {
        log(DEBUG_LOG_LEVEL, format, arguments);
    }

    public void debug(String msg, Throwable t) {
        log(DEBUG_LOG_LEVEL, msg, t);
    }

    // trace log level
    public void trace(String msg) {
        log(TRACE_LOG_LEVEL, msg);
    }

    public void trace(String format, Object arg) {
        log(TRACE_LOG_LEVEL, format, arg);
    }

    public void trace(String format, Object arg1, Object arg2) {
        log(TRACE_LOG_LEVEL, format, arg1, arg2);
    }

    public void trace(String format, Object... arguments) {
        log(TRACE_LOG_LEVEL, format, arguments);
    }

    public void trace(String msg, Throwable t) {
        log(TRACE_LOG_LEVEL, msg, t);
    }

}
