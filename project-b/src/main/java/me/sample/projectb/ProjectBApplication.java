package me.sample.projectb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"me.core"})
public class ProjectBApplication {
	public static void main(String[] args) {

		SpringApplication.run(ProjectBApplication.class, args);
	}
}
