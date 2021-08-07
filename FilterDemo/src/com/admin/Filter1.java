package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;


public class Filter1 implements Filter {

	
	@Override
	public void destroy() {
		System.out.println("Destoyed method call");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Init Method Call");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.println("<h2>PreProcessing</h2>");
		chain.doFilter(request, response); //FilterChain Interface
		out.println("<h2>PostProcessing</h2>");
	}


}
