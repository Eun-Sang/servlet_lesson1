package com.test.common.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Lesson04Ex01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		// 1. DB 접속 연결
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection(); // DB 연결
		
		// insert query
		String insertQuery = "insert into `used_goods` (`sellerId`, `title`, `descreption`, `price`)"
				+ "values (5, '고양이 간식 팝니다.', '고양이가 입맛이 까다로워서 잘 안 먹어요', 20000)";
		try {
			mysql.update(insertQuery);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		// 2. select query
		String selectQuery = "select * from `used_goods`";
		
		// 3. 결과 출력
		try {
			PrintWriter out = response.getWriter();
			ResultSet resultSet = mysql.select(selectQuery);
			while (resultSet.next()) { // 결과 행이 있는동안 수행
				out.println(resultSet.getInt("id"));
				out.println(resultSet.getString("title"));
				out.println(resultSet.getString("descreption"));
				out.println(resultSet.getInt("price"));
			}
		} catch (SQLException e) {
		
			
		}
		
		// 4. DB 연결 해제
		mysql.disconnection();
	}
}
