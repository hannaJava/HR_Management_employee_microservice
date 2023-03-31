package com.example.teamProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class HRManagementEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HRManagementEmployeeApplication.class, args);
	}
	@Bean
	@LoadBalanced
	//to access remote microservice(department-microservice) and get needed object(Department object)
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
