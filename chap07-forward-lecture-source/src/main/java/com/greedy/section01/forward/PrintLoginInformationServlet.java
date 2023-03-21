package com.greedy.section01.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class PrintLoginInformationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("print servlet 호출");
	
		String userId = (String)request.getAttribute("userId");
		System.out.println("forward된 userId : " + userId);
		
		StringBuilder responseText = new StringBuilder();
		responseText.append("<!doctype html>\n")
					.append("<html>")
					.append("<head>\n")
					.append("</head>\n")
					.append("<body>\n")
					.append("<h3 align=\"center\">")
					.append(userId)
					.append("님 환영합니다.</h3>\n")
					.append("</body>\n")
					.append("</html>");
	
	response.setContentType("text/html; charset=UTF-8");
	
	PrintWriter out = response.getWriter();
	out.print(responseText.toString());
	out.flush();
	out.close();
	
	}

}
