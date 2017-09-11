package com.ehcache.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching // 캐시 기능을 사용하겠다
public class ServerwizardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerwizardApplication.class, args);
	}
}
