package com.kaleshrikant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootK8sExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sExampleApplication.class, args);
	}

	@GetMapping("/message")
	public String displayMessage() {
		return  "Congratulation you have successfully deployed your application to Kubernetes ..!";
	}
}
