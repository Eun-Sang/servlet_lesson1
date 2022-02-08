<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채널 안내</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
  <style>
  #wrap {margin:auto; width: 1200px; height: 1000px;}
  header {height: 10%;}
  nav {height: 10%;}
  li {list-style-type: none;  float:left; width: 16%; text-align:center; line-height: 50px;}
  .content {height: 70%;}
  footer {height: 10%;}
  </style>
</head>
<body>
	<div id="wrap" class="bg-danger">
		<header class="bg-secondary"></header>
		<nav id="menu" class="bg-info">
		<ul>
		<li>전체</li>
		<li>지상파</li>
		<li>드라마</li>
		<li>예능</li>
		<li>영화</li>
		<li>스포츠</li>
		</ul>
		</nav>
		<div class="content bg-primary">
		</div>
		<footer class="bg-success"></footer>
	
	</div>
</body>
</html>