package com.abdurrkhalid.cicdgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdGitHubActionsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the Spring Boot Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdGitHubActionsApplication.class, args);
	}

}
