package com.datasoldier.smartcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SmartcontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartcontrolApplication.class, args);
	}

}
