package com.YeeShin.YeeShinProductManagementSystem.SecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Config {

	public SecurityFilterChain securityFilterChaing(HttpSecurity http) throws Exception{
		return http.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("/admin").authenticated()
				.and()
				.formLogin().loginPage(null).loginProcessingUrl(null).defaultSuccessUrl(null)
				.and().build();
				
	}
}
