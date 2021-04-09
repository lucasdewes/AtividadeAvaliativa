package edu.ifmt.PF;

import java.util.Locale;

//semana da aula 18, slide pediu pra retirar, ver aquivos pedroSe18 import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class PFApplication {

	public static void main(String[] args) {
		SpringApplication.run(PFApplication.class, args);
	}
 @Bean
 public FixedLocaleResolver localResolver() {
	return new FixedLocaleResolver(new Locale("pt", "BR"));
	 
	 
 }/*
 public ServletRegistrationBean h2servletRegistration() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*");
	    return registration;
	}*/
}
