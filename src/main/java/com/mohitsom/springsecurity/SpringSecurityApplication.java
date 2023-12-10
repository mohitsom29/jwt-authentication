package com.mohitsom.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new PasswordEncoder(){
			@Override
			public String encode(CharSequence rawPassword) {
				return null;
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return false;
			}
		};
	}
}
