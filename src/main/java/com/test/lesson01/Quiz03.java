package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/Quiz03")//프로젝트 선택 후 ctrl+h 하면 검색가능
public class Quiz03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		Date current = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>뉴스</title></head><body>");
		out.print("<h1>[단독] 고양이가 야옹해</h1><br>");
		out.print("기사 입력 시간: " + sdf.format(current) +"<hr>끝");
		out.print("</body></html>");
		
	}

}
