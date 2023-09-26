package me.core.projecta.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public TokenValidationFilter tokenValidationFilter() {
        return new TokenValidationFilter();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.addFilterBefore(tokenValidationFilter(), UsernamePasswordAuthenticationFilter.class);
        http.authorizeRequests().antMatchers("/api/**").permitAll();
        http.authorizeRequests().anyRequest().authenticated();
        return http.build();
    }
}

