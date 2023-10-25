package com.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServerEurekaclient1Application {

	public static void main(String[] args)
	{
	System.out.println("EurekaClient-1");
		SpringApplication.run(MicroServerEurekaclient1Application.class, args);
	}

}
