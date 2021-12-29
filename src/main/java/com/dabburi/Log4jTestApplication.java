package com.dabburi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jTestApplication {

    // we are not using args in general but they may be required in the future. This
    // isn't necessarily an issue as the applications are started typically through a gated process
    @SuppressWarnings("squid:S4823")
    public static void main(String[] args) {
        SpringApplication.run(Log4jTestApplication.class, args);
    }
}