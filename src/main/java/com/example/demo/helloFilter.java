package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class helloFilter extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(helloFilter.class);


    @Override
    protected void initFilterBean() throws ServletException {
        logger.info("Init!!!!");
        super.initFilterBean();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        logger.info("doFilter!!!!!!!!");
        filterChain.doFilter(request, response);
    }
}
