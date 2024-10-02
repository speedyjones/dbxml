package com.dbxml.dbxml.config;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class RateLimiterConfig {

    @Bean
    public Bucket bucket() {
        // Define a bucket with a limit of 10 requests per minute
        return Bucket4j.builder()
                .addLimit(Bandwidth.simple(10, Duration.ofSeconds(1))) // Limit of 10 requests per minute
                .build();
    }

}
