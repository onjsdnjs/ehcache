package com.ehcache.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

/**
 * Created by hongjong-wan on 2017. 9. 11..
 */
@Component
public class CacheManagerCheck implements CommandLineRunner{

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheManagerCheck.class);

    private final CacheManager cacheManager;

    public CacheManagerCheck(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Using cache manager: {}", this.cacheManager.getClass().getName());
    }
}
