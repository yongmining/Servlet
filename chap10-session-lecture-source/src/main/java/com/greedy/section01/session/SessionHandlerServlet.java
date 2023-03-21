package com.greedy.section01.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      request.setCharacterEncoding("UTF-8");
      
      String firstName = request.getParameter("firstName");
      String lastName = request.getParameter("lastName");
      
      System.out.println("firstName :" + firstName );
      System.out.println("lastName :" + lastName);
      
      HttpSession session = request.getSession();
      System.out.println("session id :" + session.getId());
      
      session.setMaxInactiveInterval(60 * 10);		//10분 기본값 1800
      
      session.setAttribute("firstName", firstName);
      session.setAttribute("lastName", lastName);
      
      response.sendRedirect("redirect");
}
}