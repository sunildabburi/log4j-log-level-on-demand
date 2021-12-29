package com.dabburi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dabburi.config.CustomLogger;
import com.dabburi.config.CustomLoggerFactory;

@RestController
@RequestMapping("/test")
public class LogTestController {

    private static final CustomLogger LOGGER = CustomLoggerFactory.getLogger(LogTestController.class);

    @GetMapping
    public String greet() {
        LOGGER.debug("Debug log");
        LOGGER.trace("Trace log");
        return "Hello!";
    }
}
