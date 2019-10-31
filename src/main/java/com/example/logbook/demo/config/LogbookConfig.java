package com.example.logbook.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.servlet.LogbookFilter;

@Configuration
public class LogbookConfig {

    @Bean
    public LogbookFilter logbookFilter(){
        return new LogbookFilter();
    }
}
