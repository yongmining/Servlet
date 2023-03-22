<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">jsp action tag</h1>
	
	<h3><a href="Views/action/testAction.jsp">jsp action tag 테스트</a></h3>
	
	<h2>EL test</h2>
	<h3><a href="test1">request.getAttribute() 테스트</a></h3>
	<h3><a href="test2">request에 저장된 객체 출력 테스트</a></h3>
	<h3><a href="Views/el/testEl3.jsp?name=galaxy&price=95&no=5&no=6&option=삼성">parameter로 값</a></h3>
	<h3><a href="test4">requsetScope와 SessionScope 테스트</a></h3>
	
	<h2>JSTL test</h2>
	<h3><a href="Views/jstl/testJstlCore.jsp">Core library test</a></h3>
	
	
</body>
</html>