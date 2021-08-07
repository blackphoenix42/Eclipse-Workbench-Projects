package com.admin;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LifeCycle")
public class LifeCycle implements Servlet {

    public LifeCycle() {
      
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method Called");
	}

	public void destroy() {
		System.out.println("Destroy method Called");
	}

	public ServletConfig getServletConfig() {
		
		return null;
	}

	public String getServletInfo() {
		
		return null; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service Method");
	}

}
