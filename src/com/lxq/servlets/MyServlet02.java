package com.lxq.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet02 implements Servlet {

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		//根据参数获得对应的值
		System.out.println(config.getServletName());
		System.out.println(config.getInitParameter("card_no"));
		System.out.println(config.getInitParameter("card_pass"));
		//如果没有该参数名，则参数值返回null
		System.out.println(config.getInitParameter("ABC"));

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("这是MyServlet01");
		System.out.println("这是servlet体");
	}

}
