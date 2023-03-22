package com.greedy.el.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greedy.el.model.dto.MemberDTO;

@WebServlet("/test4")
public class TestFoureServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberDTO requestMember = 
				new MemberDTO("김진호", 20, "010-1234-5678", "kjh@greedy.com");
		MemberDTO sessionMember = 
				new MemberDTO("유승제", 19, "010-5678-9012", "ysj@greedy.com");
		
		request.setAttribute("member", requestMember);
		request.getSession().setAttribute("member", sessionMember);
		
		request.getRequestDispatcher("Views/el/testEl4.jsp").forward(request, response);
	}


}
