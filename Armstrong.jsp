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
int num = Integer.parseInt(request.getParameter("num"));
int n = num;
int rem,no = 0;
while(n!=0)
{
rem = n%10;
no = no+rem*rem*rem;
n = n/10;
}
if(no == num)
{
out.println("\nArmstrong Number");
}
else
{
out.println("Not Armstrong");
}%>
</body>
</html>