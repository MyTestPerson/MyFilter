package com.myfilter.security;


import com.myfilter.filter.CustomFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // I connect my CustomFilter where I will catch POST parameters
    @Autowired
    CustomFilter customFilter;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http

                // I add a filter where I will catch POST parameters
                .addFilterBefore(customFilter, AnonymousAuthenticationFilter.class)
                .authorizeRequests()
                .mvcMatchers("/").permitAll()

                // I indicate that the POST method will be used
                .mvcMatchers(HttpMethod.PUT,"/login").permitAll()

                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username") // default is username
                .passwordParameter("password") // default is password
                .loginProcessingUrl("/login")
                .failureUrl("/login?error") // default is /login?error
                .defaultSuccessUrl("/");

    }


}