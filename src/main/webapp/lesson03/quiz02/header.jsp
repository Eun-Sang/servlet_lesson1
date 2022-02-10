<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header class="d-flex align-items-center">
<%--로고 영역 --%>
	<div class="logo">
	<h3><a herf="./template.jsp" class=" text-success font-weight-bold ml-2">Melong</a></h3>
	</div>
	<%--검색 영역 --%>
	<div class="search">
	<form method="get" action="./template2.jsp">
		<div class="input-group">
			<input type="text" class="form-control col-9 ml-3" name="search">
				<div class="input-group-append">
				<input type="submit" class="btn btn-info" value="검색">
				</div>
			</div>
		</form>
	</div>
</header>