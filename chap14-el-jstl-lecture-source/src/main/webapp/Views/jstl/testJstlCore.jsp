<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">JSTL Core Library Tag Test</h1>
	
	<h2>c:set 태그 : 변수 선언 (atter 추가)</h2>
	<c:set var="num1" value="100" scope="session"/>
	<c:set var="num2" value="200" scope="session"/>
	
	<%-- <% int sum = num1 + num2; %> --%>
	<c:set var="sum" value="${ num1 + num2 }"/>
	num1 + num2= ${ sum }<br>
	
	<% int num3 = 10, num4 = 20; %>
	num3 + num4 = ${ num3 + num4 }<br>
	<c:set var="sum2" value="<%= num3 + num4 %>"/>
	num3 + num4 = ${ sum2 }<br>
	
	<h2>c:set 태그 : 배열 또는 컬렉션으로 사용할 문자 선언</h2>
	<c:set var="colors">
		red, yellow, green, orange, blue, magenta
	</c:set>
	colors 배열 확인 : ${ colors }<br>
	<script>
		window.onload = function() {
			const colors = '${ colors }'.split(', ');
			console.table(colors);
		}
	</script>
	
	<h2>c:remove 태그 : attr 제거</h2>
	num1 : ${ num1 }<br>
	num2 : ${ num2 }<br>
	
	<c:remove var="num1" scope="session"/>
	<c:remove var="num2" scope="session"/>
	
	num1 : ${ num1 }<br>
	num2 : ${ num2 }<br>
	
	<h2>c:out 태그 : 값 출력</h2>
	<c:out value="core 라이브러리의 <out> 태그는 값을 화면에 출력하는 태그이다"/><br>
	<c:out value="<h2>데이터 출력</h2>" escapeXml="false"/><br>
	<c:out value="<h2>데이터 출력</h2>" escapeXml="true"/><br>
	<c:out value="<h2>데이터 출력</h2>"/><br>
	
	<c:out value="<script>alert ('hello?')</script>"/>
	
	<h3>c:out 태그의 default 속성</h3>
	<c:out value="${ param.name }" default="아무개념"/>
	
	<h2>c:if 태그 : 조건문</h2>
	<c:set var="value1" value="9" scope="page"/>
	<c:set var="value2" value="3" scope="page"/>
	value1의 값은 <c:out value="${ value1 }"/>이고,
	value2의 값은 <c:out value="${ value2 }"/>입니다.
	
	<%-- <c:if test="${ Integer.parseInt(value1) >= Integer.parseInt(value2) }">
		<h3>value1이 큽니다.</h3>
	</c:if>
	<c:if test="${ Integer.parseInt(value1) < Integer.parseInt(value2) }">
		<h3>value2가 큽니다.</h3>
	</c:if> --%>
	
	<%-- <c:if test="${ value1 + 0 >= value2 + 0 }">
		<h3>value1이 큽니다.</h3>
	</c:if>
	<c:if test="${ value1 + 0 < value2 + 0 }">
		<h3>value2가 큽니다.</h3>
	</c:if> --%>
	
	<h2>c:choose, c:when, c:otherwise</h2>
	<c:set var="no" value="${ param.no }"/>
	
	param.no의 값은 <c:out value="${ param.no } 입니다."/>
	
	<c:choose>
		<c:when test="${ no == 1 }"><h3>안녕하세요</h3></c:when>
		<c:when test="${ no eq 2 }"><h3>반갑습니다</h3></c:when>
		<c:otherwise><h3>환영합니다</h3></c:otherwise>
	</c:choose>
	
	<h2>c:forEach</h2>
	<c:forEach begin="1" end="10">
		반복 실행<br>
	</c:forEach>
	<br>
	<c:forEach var="size" begin="1" end="7" step="1">
		<font size="${ size }">글자크기 ${ size }</font><br>
	</c:forEach>
	
	
	<c:forEach var="color" items="${ colors }" varStatus="st">
		<font color="${ color }">
			${ st.count } : 글자색 : ${ color }
		</font>
		<br>
	</c:forEach>
	
	<h2>c:forTokens</h2>
		<ul>
         <c:forTokens var="color" items="yellow blue pink red green" delims=" ">
            <li>${ color }</li>
         </c:forTokens>
      	</ul>

	
	
	
	<h3>여러 개 토큰을 이용해 분리</h3>
	<c:forTokens var="color" items="yellow-blue*pink/red green" delims="-*/ ">
		${ color }<br>
	</c:forTokens>
	
	<h3>c:url 태그 : 링크 설정 정보 지정하는 태그</h3>
	<c:url var="fmtlink" value="testJstlCoreResult.jsp">
		<c:param name="num" value="77"/>
	</c:url>
	<a href="${ fmtlink }">결과 화면 연결</a>
</body>
</html>