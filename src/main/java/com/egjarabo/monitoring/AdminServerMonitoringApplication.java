package com.egjarabo.monitoring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer // Added to monitor microservices.
public class AdminServerMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerMonitoringApplication.class, args);
	}

}
