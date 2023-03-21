package com.greedy.section01.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		System.out.println("redirect firstName : " + firstName);
		System.out.println("redirect lastName : " + lastName);
		
		/* 쿠키 사용 방법
		 * 1. request에서 쿠키 목록을 배열로 꺼내온다.
		 * 2. 쿠키의 getName와 getValue를 이용해 쿠키에 담긴 값을 사용한다.
		 * */
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++) {
			System.out.println("[cookie] " + cookies[i].getName()
					+ " : " + cookies[i].getValue());
			
		}
	}
}
