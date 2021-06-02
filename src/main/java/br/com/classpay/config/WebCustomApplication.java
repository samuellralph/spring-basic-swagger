package br.com.webcustom.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "br.com.webcustom")
@SpringBootApplication
public class WebCustomApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCustomApplication.class, args);
	}

}
