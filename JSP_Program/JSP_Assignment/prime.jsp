<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prime Numbers</title>
</head>
<body>

	<h1>Prime Numbers</h1>

	<%
	int a = 10;
	int b = 2;
	while (b < a) {
		if (a % b == 0) {

			out.println("<br>" + a + "is not a prime number!");
			break;
		} 
		else {

			b++;
		}
	}
	if (a == b)

		out.println("<br>" + a + "is a prime number!");
	%>


</body>
</html>