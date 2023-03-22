<!-- 
	1페이지 지시자 태그 
	- 페이지에 대한 설정을 하는 지시자 태그이다.
	현재 페이지에 스크립틀릿 태그를 작성하는 문법은 자바라는 의미이며,
	resonse header에 응답을 위한 설정을 하는 것도 할 수 있다.
	content-type 헤더에 마임(MINE)타입과 인코딩방식을 지정했다.
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  2. jsp 주석 태그 -->
	<%-- jsp 주석입니다. --%>
	
	<!-- 3.선언 태그 -->
	<%!
		private String name;
		private int age;
	%>
	
	<!-- 4. scriptlet 태그 -->
	<%
		// 간단한 자바 코드를 작성할 수 있다.
		/*자바의 여러 줄 주석을
			사용할 수도 있다.*/
		name = "홍길동";
		age = 20;
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
		for(int i = 0; i < name.length(); i++){
			System.out.println(name.charAt(i));
		}
	%>
	
	<!-- 5. expression 태그
			out.print(name);
			out.print(age);
			 -->
	name : <%= name %><br>
	age : <%= age %><br>
</body>
</html>