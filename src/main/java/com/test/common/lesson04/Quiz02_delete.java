package com.test.common.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

//@WebServlet("quiz02_delete")
public class Quiz02_delete extends HttpServlet{

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 리퀘스트 파리미터 아이디 꺼내기
		int id = Integer.parseInt(request.getParameter("id"));
		
		// DB 연결
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection();
		
		// delete Query 수행
		String deleteQuery = "delete from 'Favorites' where `id`=" + id;
		try {
			mysql.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB연결 해제
		mysql.disconnection();
		
		// redirect
		response.sendRedirect("/lesson04/quiz02_1.jsp");
	}
}
