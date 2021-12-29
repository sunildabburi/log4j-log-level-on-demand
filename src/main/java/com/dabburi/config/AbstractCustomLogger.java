package com.dabburi.config;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger that enables certain log levels based on X-LOG-LEVEL key
 *
 * @author Sunil Dabburi
 */
public abstract class AbstractCustomLogger {

    public static final String INFO_LOG_LEVEL = "info";
    public static final String WARN_LOG_LEVEL = "warn";
    public static final String ERROR_LOG_LEVEL = "error";
    public static final String DEBUG_LOG_LEVEL = "debug";
    public static final String TRACE_LOG_LEVEL = "trace";
    public static final String X_LOG_LEVEL_SET = "X-LOG-LEVEL-SET";
    public static final String X_LOG_LEVEL = "X-LOG-LEVEL";
    private final Logger logger;

    protected AbstractCustomLogger(Class<?> source) {
        logger = LoggerFactory.getLogger(source);
    }

    void log(String level, String msg) {
        setWcLogLevel();
        switch (level) {
            case INFO_LOG_LEVEL:
                logger.info(msg);
                break;
            case WARN_LOG_LEVEL:
                logger.warn(msg);
                break;
            case ERROR_LOG_LEVEL:
                logger.error(msg);
                break;
            case DEBUG_LOG_LEVEL:
                logger.debug(msg);
                break;
            case TRACE_LOG_LEVEL:
                logger.trace(msg);
                break;
            default:
        }
        removeWcLogLevel();
    }

    void log(String level, String msg, Object var1) {
        setWcLogLevel();
        switch (level) {
            case INFO_LOG_LEVEL:
                logger.info(msg, var1);
                break;
            case WARN_LOG_LEVEL:
                logger.warn(msg, var1);
                break;
            case ERROR_LOG_LEVEL:
                logger.error(msg, var1);
                break;
            case DEBUG_LOG_LEVEL:
                logger.debug(msg, var1);
                break;
            case TRACE_LOG_LEVEL:
                logger.trace(msg, var1);
                break;
            default:
        }
        removeWcLogLevel();
    }

    void log(String level, String msg, Object... var1) {
        setWcLogLevel();
        switch (level) {
            case INFO_LOG_LEVEL:
                logger.info(msg, var1);
                break;
            case WARN_LOG_LEVEL:
                logger.warn(msg, var1);
                break;
            case ERROR_LOG_LEVEL:
                logger.error(msg, var1);
                break;
            case DEBUG_LOG_LEVEL:
                logger.debug(msg, var1);
                break;
            case TRACE_LOG_LEVEL:
                logger.trace(msg, var1);
                break;
            default:
        }
        removeWcLogLevel();
    }

    void log(String level, String msg, Throwable var1) {
        setWcLogLevel();
        switch (level) {
            case INFO_LOG_LEVEL:
                logger.info(msg, var1);
                break;
            case WARN_LOG_LEVEL:
                logger.warn(msg, var1);
                break;
            case ERROR_LOG_LEVEL:
                logger.error(msg, var1);
                break;
            case DEBUG_LOG_LEVEL:
                logger.debug(msg, var1);
                break;
            case TRACE_LOG_LEVEL:
                logger.trace(msg, var1);
                break;
            default:
        }
        removeWcLogLevel();
    }

    private void setWcLogLevel() {
        if (ThreadContext.containsKey(X_LOG_LEVEL_SET)) {
            ThreadContext.put(X_LOG_LEVEL, ThreadContext.get(X_LOG_LEVEL_SET));
        }
    }

    private void removeWcLogLevel() {
        ThreadContext.remove(X_LOG_LEVEL);
    }
}
