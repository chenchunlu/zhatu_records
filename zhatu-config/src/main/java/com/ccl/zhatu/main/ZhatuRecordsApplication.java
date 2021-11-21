package com.ccl.zhatu.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Primary;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScans(value={@ComponentScan(value= "com.ccl.zhatu")})
@MapperScan("com.ccl.zhatu.*.mapper")
@EnableCaching
@EnableScheduling
public class ZhatuRecordsApplication {


	public static void main(String[] args) {
		SpringApplication.run(ZhatuRecordsApplication.class, args);
	}
	@Primary
	@Bean
	public TaskExecutor primaryTaskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		return executor;
	}
}
