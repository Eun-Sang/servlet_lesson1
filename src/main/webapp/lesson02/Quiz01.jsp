<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>
	<%
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0;
	for (int i = 0; i < scores.length; i++) {
		sum += scores[i];
	}
	
	double avg = sum / (double)scores.length;
	
	//3)
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	int score = 0;
	for (int i = 0; i < scoreList.size(); i++) {
		if (scoreList.get(i).equals("O")) {
			score += 100/ scoreList.size();
		}
	}
	
	
	//4)

	String birthDay = "20010820";
	String yearStr = birthDay.substring(0, 4);
	//out.print(yearStr);
	int age = 2022 - Integer.parseInt(yearStr) + 1;
	
	%>
<h1>평균 점수는 <%= avg%> 입니다.</h1>
<!-- <h1>채점 결과는 <%= score %>점 입니다.</h1> -->

<h1><%=birthDay %> 의 나이는 <%=age %> 세 입니다.</h1> 
</body>
</html>