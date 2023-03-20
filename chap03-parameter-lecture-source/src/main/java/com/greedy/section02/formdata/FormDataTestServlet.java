package com.greedy.section02.formdata;

import java.io.UnsupportedEncodingException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws UnsupportedEncodingException {
		
		/* 인코딩 초기값은 null로 설정되어 있음
		 * 톰캣의 인코딩 초기값인 ISO-8859-1 인코딩 방식으로 해석한다.
		 * */
		System.out.println(request.getCharacterEncoding());
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		System.out.println("이름 : " + name);
		
	}
}
