package br.com.example.curso.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CursoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
		
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(CursoApplication.class);
	}
}
