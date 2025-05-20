<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
java.util.Date d=new java.util.Date();
int hr=d.getHours();
if(hr<12)
{
 out.println("Good Morning:"+name);
} 
if(hr>12 && hr<16)
{
 out.println("Good Afternoon:"+name);
}
if(hr>16)
{
 out.println("Good Evening:"+name);
}
%>
</body>
</html>