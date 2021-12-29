package com.dabburi.filter;

import static com.dabburi.config.AbstractCustomLogger.DEBUG_LOG_LEVEL;
import static com.dabburi.config.AbstractCustomLogger.ERROR_LOG_LEVEL;
import static com.dabburi.config.AbstractCustomLogger.INFO_LOG_LEVEL;
import static com.dabburi.config.AbstractCustomLogger.TRACE_LOG_LEVEL;
import static com.dabburi.config.AbstractCustomLogger.WARN_LOG_LEVEL;
import static com.dabburi.config.AbstractCustomLogger.X_LOG_LEVEL;
import static com.dabburi.config.AbstractCustomLogger.X_LOG_LEVEL_SET;
import java.io.IOException;
import java.util.Set;
import javax.annotation.Priority;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Filter that marks logger for dynamic log level change by setting X-LOG-LEVEL-SET key in Logger ThreadContext
 * only when X-LOG-LEVEL header is passed
 *
 * @author Sunil Dabburi
 */
@Priority(value = Integer.MIN_VALUE)
@Component
public class LogFilter extends OncePerRequestFilter {

    private static final Set<String> acceptableLogLevels = Set.of(
            INFO_LOG_LEVEL, WARN_LOG_LEVEL, ERROR_LOG_LEVEL, DEBUG_LOG_LEVEL, TRACE_LOG_LEVEL
    );

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String logLevel = request.getHeader(X_LOG_LEVEL);
        if (logLevel != null && acceptableLogLevels.contains(logLevel.toLowerCase())) {
            ThreadContext.put(X_LOG_LEVEL_SET, logLevel);
        }
        filterChain.doFilter(request, response);
    }
}
