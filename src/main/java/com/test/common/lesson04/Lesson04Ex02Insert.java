package com.test.common.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/user_insert")
public class Lesson04Ex02Insert extends HttpServlet{

	@Override
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
		// request params 
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		// DB 연결
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection(); // db 연결
		
		// insert query 수행
		String insertQuery = "insert into `new_user` (`name`, `yyyymmdd`,`email`,`introduce`)"
		 + "values ('" + name + "', '" + yyyymmdd + "', '" + email + "', '" + introduce + "')";
		try {
			mysql.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 해제
		mysql.disconnection();
		
		//리다이렉트 redirect
		response.sendRedirect("/lesson04/ex02_1.jsp");
	}
}
