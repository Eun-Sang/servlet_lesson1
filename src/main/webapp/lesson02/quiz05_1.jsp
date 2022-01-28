<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>변환하기</title>
</head>
<body>
	<h1>길이 변환 결과</h1>
	<%
	
	int input = Integer.parseInt(request.getParameter("input"));
	String[] unitArr = request.getParameterValues("unit"); // 여러 파라미터 받아올 때
	
	%>
	<h3><%=input %>cm</h3>
	<h2>
		<%
		for (String unit : unitArr) {
			if (unit.equals("in")) {
				out.print(input * 0.393701 + "<br>");
			} else if (unit.equals("m")) {
				out.print(input * 0.0109361 + "<br>");
			} else if (unit.equals("yd")) {
				out.print(input * 0.0328084 + "<br>");
			} else if (unit.equals("ft")) {
				out.print(input * 0.01 + "<br>");
			}
		}
		%>
	</h2>
</body>
</html>