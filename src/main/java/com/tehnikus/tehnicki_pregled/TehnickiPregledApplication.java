package com.tehnikus.tehnicki_pregled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"com.tehnikus.tehnicki_pregled.mapper"})
public class TehnickiPregledApplication {

	public static void main(String[] args) {
		SpringApplication.run(TehnickiPregledApplication.class, args);
	}

}
