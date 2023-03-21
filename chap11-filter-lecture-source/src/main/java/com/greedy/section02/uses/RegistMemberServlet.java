package com.greedy.section02.uses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		System.out.println("userId : " + userId);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("비밀번호가 pass01인지 확인 : " + passwordEncoder.matches("pass01", password));
		System.out.println("비밀번호가 pass02인지 확인 : " + passwordEncoder.matches("pass02", password));
	}

}
