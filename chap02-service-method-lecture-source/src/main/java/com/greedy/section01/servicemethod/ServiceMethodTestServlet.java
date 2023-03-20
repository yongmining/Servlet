package com.greedy.section01.servicemethod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
	
//	@Override
//	public void service(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		
//		String httpMethod = request.getMethod();
//		
//		System.out.println("httpMethod : " + httpMethod);
//		
//		if("GET".equals(httpMethod)) {
//			System.out.println("GET 방식의 요청이 들어옴...");
//			doGet(request, response);
//		} else if("POST".equals(httpMethod)) {
//			System.out.println("POST 방식의 요청이 들어옴...");
//			doPost(request, response);
//		}
//	}
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("GET 방식 요청 허용됨...");
	}
}
