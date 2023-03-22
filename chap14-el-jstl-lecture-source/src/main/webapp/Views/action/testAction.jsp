<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%-- <%@ include file="common.jsp" %> --%>
   <jsp:include page="common.jsp"/>
   <h1>여기서부터 본문 내용입니다.</h1>
   
   <%
      request.setAttribute("name", "홍길동");
      // request.getRequestDispatcher("testForward.jsp").forward(request, response);
   %>
   <jsp:forward page="testForWard.jsp"/>
</body>
</html>