<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color=red>
<%! int i,n;
String s1;
%>
<%
s1=request.getParameter("num");
n=s1.length();
i=0;
do{
char ch=s1.charAt(i);
switch(ch)
{
case '0':out.println("Zero");
break;
case '1':out.println("One");
break;
case '2':out.println("Two");
break;
case '3':out.println("Three");
break;
case '4':out.println("Four");
break;
case '5':out.println("Five");
break;
case '6':out.println("six");
break;
case '7':out.println("Seven");
break;
case '8':out.println("Eight");
break;
case '9':out.println("Nine");
break;
}
i++;
}while(i<n);
%>
</font>
</body>
</html>