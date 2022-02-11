package com.test.common.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/site_insert")
public class Quiz02favorites_insert extends HttpServlet{

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		//
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection();
		
		String insertQuery = "insert into `Favorites` (`site`, `address`)"
				+ "values (\"인스타\", \"https://www.instagram.com\"),"
				+ "		(\"다음\", \"https://www.daum.net\"),"
				+ "		(\"네이버\", \"https://www.naver.com\"),"
				+ "		(\"구글\", \"https://www.google.com\"),"
				+ "		(\"마론달\", \"https://www.marondal.com\")";
		try {
			mysql.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 연결해제
		
		mysql.disconnection();
		
		// redirect
		
		response.sendRedirect("/lesson04/quiz02_1.jsp");
		
		
	}
}
