<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_getCookie.jsp</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
	
		for(Cookie c : cookies){
			out.print("<h2>"+c.getName()+" : "+ c.getValue()+"</h2>");
		}
		
	%>
</body>
</html>