package com.greedy.section01.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showErrorPage")
public class ExceptionHandlerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("에러 포워딩 확인");
		Enumeration<String> attrNames = request.getAttributeNames();
		while(attrNames.hasMoreElements()) {
			System.out.println(attrNames.nextElement());
		}
		
		System.out.println(request.getAttribute("javax.servlet.forward.request_uri"));
		System.out.println(request.getAttribute("javax.servlet.error.status_code"));
		System.out.println(request.getAttribute("javax.servlet.error.message"));
		
		Integer statusCode =
				(Integer) request.getAttribute("javax.servlet.error.status_code");
		String message =
				(String) request.getAttribute("javax.servlet.error.message");
		
		StringBuilder errorPage = new StringBuilder();
		errorPage.append("<!doctype html>\n")
					.append("<html>\n")
					.append("<head>\n")
					.append("</head>\n")
					.append("<body>\n")
					.append("<h1 align=\"center\">")
					.append(statusCode)
					.append(" - ")
					.append(message)
					.append("</h1>\n")
					.append("</body>\n")
					.append("</html>\n");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(errorPage.toString());
		out.flush();
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
