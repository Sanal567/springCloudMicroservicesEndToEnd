package com.sanal.serviceregistration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello ===================");

	}

}
