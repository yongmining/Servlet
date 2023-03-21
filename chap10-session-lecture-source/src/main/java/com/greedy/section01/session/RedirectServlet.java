package com.greedy.section01.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		System.out.println("redirect 후 session id : " + session.getId());
		
		String firstName = (String)session.getAttribute("firstName");
		String lastName = (String)session.getAttribute("lastName");
		
		System.out.println("session firstName : " + firstName);
		System.out.println("session lastName : " + lastName);
		
		session.removeAttribute("firstName");
		
		session.invalidate();
	}
}
