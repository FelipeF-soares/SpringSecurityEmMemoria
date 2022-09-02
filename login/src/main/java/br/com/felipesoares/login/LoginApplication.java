package br.com.felipesoares.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LoginApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(LoginApplication.class, args);
	}

}
