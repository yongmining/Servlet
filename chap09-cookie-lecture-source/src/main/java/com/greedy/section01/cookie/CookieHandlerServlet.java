package com.greedy.section01.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		
		/* 쿠키 사용 
		 * 1. 쿠키를 생성한다.
		 * 2. 해당 쿠키의 만료시간을 설정한다.
		 * 3. 응답 헤더에 쿠키를 담는다.
		 * 4. 응답한다.
		 * 
		 * 쿠키의 사용은 간단하지만 일부 제약이 있다.
		 * 쿠키의 이름은 ascii 문자만을 사용해야 하며, 한 번 설정한 이름은 변경할 수 없다.
		 * 또한 공백문자와 일부 특수문자 ([ ] ( ) = , " \ ? @ : ;)를 사용할 수 없다. 
		 * */
		Cookie firstNameCookie = new Cookie("firstName", firstName);
		Cookie lastNameCookie = new Cookie("lastName", lastName);
		
		firstNameCookie.setMaxAge(60 * 60 * 24);
		lastNameCookie.setMaxAge(60 * 60 * 24);
		
		response.addCookie(firstNameCookie);
		response.addCookie(lastNameCookie);
		
		response.sendRedirect("redirect");
	}

}
