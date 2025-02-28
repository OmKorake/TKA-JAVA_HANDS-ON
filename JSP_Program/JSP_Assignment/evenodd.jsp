<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="#">
		<h1 style="background-color: green">Odd Numbers</h1>
		
		<%
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				out.print("<br>" + i + "</br>");

			}
		}
		%>

		<h1 style="background-color: green">Even Numbers</h1>
		
		<%
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				out.print("<br>" + i + "</br>");

			}
		}
		%>


	</form>

</body>
</html>