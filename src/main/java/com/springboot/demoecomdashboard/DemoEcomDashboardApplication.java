package com.springboot.demoecomdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot.demoecomdashboard.repository")
@EntityScan(basePackages = "com.springboot.demoecomdashboard.entity")
// Note this entity scan annotation
public class DemoEcomDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEcomDashboardApplication.class, args);
	}

}
