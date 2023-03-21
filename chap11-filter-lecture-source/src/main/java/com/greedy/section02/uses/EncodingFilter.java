package com.greedy.section02.uses;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodingFilter implements Filter {
	
	private String encodingType;
	
	public void init(FilterConfig config) {
		this.encodingType = config.getInitParameter("encoding-type");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String method = ((HttpServletRequest)request).getMethod();
		if("POST".equals(method)) {
			request.setCharacterEncoding(encodingType);
			System.out.println("변경된 인코딩 : " + request.getCharacterEncoding());
		}
		
		chain.doFilter(request, response);
	}

}
