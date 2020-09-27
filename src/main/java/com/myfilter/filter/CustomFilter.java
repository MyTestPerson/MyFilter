package com.myfilter.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class CustomFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        // I get the parameter
        String email = httpServletRequest.getParameter("email");
        String header = httpServletRequest.getHeader("email" + " == Заголовок");

        // Display to the console
        System.out.println(email);
        System.out.println(header);

        chain.doFilter(request, response);
    }
}
