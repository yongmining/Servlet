package com.greedy.section01.querystring;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("name");
		System.out.println("이름 : " + name);
		
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("나이 : " + age);
		
		java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
		System.out.println("생일 : " + birthday);
		
//		String birthday = request.getParameter("birthday");
//		String[] sarr = birthday.split("-");
//		int[] iarr = new int[3];
		
//		for(int i = 0; i < sarr.length; i++) {
//			iarr[i] = Integer.parseInt(sarr[i]);
//		}
//		
//		int year = iarr[0];
//		int month = iarr[1];
//		int date = iarr[2];
//		
//		Calendar calender = new GeogorianCalendar(year, month - 1, date);
//		
//		java.sql.Date birth = new java.sql.Date(calender.getTimeInMillis());

		
		String gender = request.getParameter("gender");
		System.out.println("성별 : " + gender);
		
		String national = request.getParameter("national");
		System.out.println("국적 : " + national);
		
		String[] hobby = request.getParameterValues("hobby");
		for(String h : hobby) {
			System.out.println(h);
		}
		
		System.out.println("=====================================");
		
		Map<String, String[]> requestMap = request.getParameterMap();
		Set<String> keySet = requestMap.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			String key = keyIter.next();
			String[] value = requestMap.get(key);
			
			System.out.println("key : " + key);
			for(int i = 0; i < value.length; i++) {
				System.out.println("value[" + i + "] : " + value[i]);
			}
		}
		
		System.out.println("======================================");
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements() ) {
			System.out.println(names.nextElement());
		}
	}
}
