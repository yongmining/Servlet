package com.greedy.section02.sessionlistner;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session")
public class SessionListenerTestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("session listener 확인용 서블릿");
		
		HttpSession session = request.getSession();
	
		System.out.println("발급받은 session id :" + session.getId());
		
		session.setAttribute("username", "honggildong");
		session.setAttribute("age", 20);
		session.setAttribute("gender", "M");
		
		session.setAttribute("user", new UserDTO("honggildong","20"));
		
		session.setAttribute("username", "hong");
		
		session.removeAttribute("gender");
		
		session.invalidate();
	}

	

}
