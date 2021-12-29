package com.dabburi.config;

/**
 * Factory to provide instance of {@link CustomLogger}
 *
 * @author Sunil Dabburi
 */
public final class CustomLoggerFactory {

    private CustomLoggerFactory() {
    }

    public static CustomLogger getLogger(Class<?> source) {
        return new CustomLogger(source);
    }
}
