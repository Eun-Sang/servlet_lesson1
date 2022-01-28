<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<% 
	Integer head = Integer.valueOf(request.getParameter("head"));
	int tail = Integer.parseInt(request.getParameter("tail"));
	String symbol = request.getParameter("symbol");
	
	double sum;
	
/*	if (symbol.equals("+")) {
		sum = head + tail;
	} else if (symbol.equals("-")) {
		sum = head - tail;
	} else if (symbol.equals("/")) {
		sum = head / tail;
	} else if (symbol.equals("*")) {
		sum = head * tail;
	} 
*/

	// 출력용 변수
	String operater = null;

	switch (symbol) {
	case "plus":
		sum = head + tail;
		operater = "+";
		break;
	
	case "minus": 
		sum = head - tail;
		operater = "-";
		break;
	case "divide": 
		sum = head / tail;
		operater = "/";
		break;
	case "multiple": 
		sum = head * tail;
		operater = "*";
		break;
	}

	
	%>
	<div class="container">
	<h1>계산 결과</h1>
	<span class="display-3">
	<% 
		out.print(head + " " + operater + " " + tail + " = ");
	%>
	
	</span>
</body>
</html>