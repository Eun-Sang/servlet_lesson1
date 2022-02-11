<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 추가</title>
</head>
<body>
	<%--
	flow
	
	1) 유저 추가: input form -> servlet(insert query) -> user list(select query)
	2) 유저 삭제: user list에서 삭제 클릭 -> servlet(delete query) -> user list  
	--%>
	
	<form method="post" action="/lesson04/user_insert">
		<p>
			<b>이름:</b>
			<input type="text" name="name">
		</p>
		<p>
			<b>생년월일:</b>
			<input type="text" name="yyyymmdd">
		</p>
		<p>
			<b>이메일:</b>
			<input type="text" name="email">
		</p>
		<p>
			<b>자기소개:</b>
			<br>
			<textarea rows="5" cols="50" name="introduce"></textarea>
		</p>
		<p>
		<input type="submit" value="추가">
		</p>
	</form>
</body>
</html>