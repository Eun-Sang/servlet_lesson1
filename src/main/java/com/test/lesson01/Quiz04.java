package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/Quiz04")
public class Quiz04 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>리스트</title></head><body>");
		for (int i = 1; i <=30; i++) {//scope 범위
			out.print("<li>" + i + "번째 리스트</li>");
		}
		out.print("</ul></body></html>");
		
		
	}

}
