package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/Servlet1")
public class Filter1 implements Filter {


    public Filter1() {
      
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.println("<h2>PreProcessing~Filter1</h2>");
		chain.doFilter(request, response);
		out.println("<h2>PostProcessing~Filter1</h2>");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
