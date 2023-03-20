package com.greedy.section01.xml;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet extends HttpServlet {
	
	private int initCount = 1;
	private int doGetCount = 1;
	private int destroyCount = 1;
	
	
	
	/* 기본 생성자 */
	public LifeCycleTestServlet() {
		System.out.println("LifeCycleTestServlet 인스턴스 생성됨...");
	}
	
	/* 서블릿 요청이 최초인 경우 한 번 동작하는 메소드 */
	@Override
	public void init(ServletConfig config) {
		System.out.println("xml 매핑 init() 메소드 호출됨..." + initCount ++);
	}
	
	/* GET 방식의 요청이 오면 올 때마다 동작하는 메소드*/
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse reponse) {
		System.out.println("xml 매핑 doGet() 메소드 호출됨..." + doGetCount++);
	}
	
	/*  서블릿 컨테이너가 종료될 때 호출되는 메소드 */
	@Override
	public void destroy() {
		System.out.println("xml 매핑 destroy() 메소드 호출됨..." + destroyCount++);
	}

}
