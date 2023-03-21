package com.greedy.section01.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/first/*")
public class FirstFilter implements Filter{

	public FirstFilter() {
		System.out.println("FirstFilter 인스턴스 생성!");
	}
	
	public void init(FilterConfig config) {
		System.out.println("filter init 호출");
	}
	
	public void destroy() {
		System.out.println("filter destroy 호출");
	}
	
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("filter doFilter 호출");
		
		chain.doFilter(request, response);
		
		System.out.println("서블릿 요청 처리 완료!");
	}

}

