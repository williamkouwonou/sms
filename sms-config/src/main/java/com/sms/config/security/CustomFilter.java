/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.config.security;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.filter.GenericFilterBean;

/**
 *
 * @author kouwonou
 */
public class CustomFilter extends GenericFilterBean {

    @Override
    public void doFilter( ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
       
         HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession httpSession =request.getSession();
        
        chain.doFilter(request, response);
    }
}
