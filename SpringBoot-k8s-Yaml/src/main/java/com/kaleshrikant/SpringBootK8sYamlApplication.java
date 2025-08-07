package com.kaleshrikant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootK8sYamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootK8sYamlApplication.class, args);
	}

	@GetMapping("/message")
	public String displayMessage() {
		return  "Congratulation you have successfully deployed your application to Kubernetes ..!";
	}

}
