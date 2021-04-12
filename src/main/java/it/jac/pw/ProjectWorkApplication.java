package it.jac.pw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "it.jac.pw")
public class ProjectWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectWorkApplication.class, args);
	}

}
