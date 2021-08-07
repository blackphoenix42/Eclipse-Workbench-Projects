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
public class MyFIlter implements Filter {

	static int count = 0;
    public MyFIlter() {
    }


	public void destroy() {
		System.out.println("Destroy Method");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		long before = System.currentTimeMillis();
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		out.print("<h3>Total Response Time"+(after-before)+"milliseconds</h3>");
		out.print("<br><h4>Total Visits:"+(++count)+"</h4>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Init Method");
	}

}
