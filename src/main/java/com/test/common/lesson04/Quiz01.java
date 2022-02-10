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

@WebServlet("/lesson04/quiz01")
public class Quiz01 extends HttpServlet{

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		//1.
		MysqlService mysql = MysqlService.getInstance();
		mysql.connection();
		
		//2.
		String selectQuery = "select * from `real_estate`";
		
		//3.
		PrintWriter out = response.getWriter();
		try {
			ResultSet resultset = mysql.select(selectQuery);
			while (resultset.next()) {
				out.println();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//4.
		mysql.disconnection();
	}	
}
