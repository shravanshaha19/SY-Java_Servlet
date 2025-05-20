<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" %>
<%
 String email=request.getParameter("t1");
 if(email.contains("@") && email.contains("."))
 {
 out.println("Given Email Id is Valid");
 }
 else {
 out.println("Given Email id is not Valid");
 }
 %>
</body>
</html>