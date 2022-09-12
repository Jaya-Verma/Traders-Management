package com.jv.TraderUC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TraderUcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraderUcApplication.class, args);
	}

}
