<!-- 
   errorPage : 현재 페이지에서 Exception 발생 시 속성값에 설정한 jsp경로로 exception을 포워딩한다.
   isErrorPage : 현재 페이지를 Exception을 처리할 페이지인 경우 true로 설정, 기본값은 false
   import : java.lang 패키지 이외의 클래스를 현 jsp 파일에서 사용할 때 import 속성에 정의하면
          import 선언부를 작성하는 것 과 같다.
          
   지시자 태그의 종류
   page 지시자 태그 : 현 jsp 페이지에 대한 설정을 하는 지시자 태그
   include 지시자 태그 : 다른 jsp 파일을 포함시키기 위해 사용하는 지시자 태그
   taglib 지시자 태그 : JSTL 라이브러리를 이용하기 위해 선언하는 지시자 태그
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
      Date date = new Date();
      System.out.println(date);
      
      String str = null;
      char ch = str.charAt(0);
   %>
</body>
</html>