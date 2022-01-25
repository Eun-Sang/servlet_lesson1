package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz09")
public class Quiz09 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
		out.print("<strong>" + name +"</strong>" + "님의 지원이 완료되었습니다.");
		out.print("<br><strong><h3>" + "지원 내용" + "</h3><br>");
		out.print(introduce);
		out.print("</body></html>");
		

		
	}
}
