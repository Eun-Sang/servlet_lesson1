<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Method form 태그</title>
</head>
<body>
	<form method="post" action="/lesson02/ex03_1.jsp">
		1. 별명은 무엇입니까?
		<input type="text" name="nickname">
		<br>
		<br>
		2. 취미는 무엇입니까?
		<input type="text" name="hobby">
		<br>
		<br>
		3. 강아지 or 고양이?
		<label>강아지 <input type="radio" name="animal" value="dog"></label>
		<label>고양이 <input type="radio" name="animal" value="cat"></label>
		<br>
		<br>
		4. 다음 중 선호하는 것을 모두 고르세요
		<br>
		<label>민트초코<input type="checkbox" name="food" value="민트초코"></label>
		<label>뻔데기<input type="checkbox" name="food" value="뻔데기"></label>
		<label>하와이안피자<input type="checkbox" name="food" value="하와이안피자"></label>
		<br>
		<br>
		5. 좋아하는 과일을 선택하세요
		<br>
		<select name="fruit">
			<option>딸기</option>
			<option>자몽</option>
			<option>망고</option>
			<option>샤인머스캣</option>
			<option>복숭아</option>
		</select>
		<br>
		<br>
		<button type="submit">제출</button>
	</form>
</body>
</html>