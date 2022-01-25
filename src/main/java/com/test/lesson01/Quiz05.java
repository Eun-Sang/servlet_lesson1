package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/Quiz05")
public class Quiz05 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		Integer number = Integer.valueOf(request.getParameter("number"));
	
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body><ul>");
		
		for(int i = 1; i <= 9; i++) {
			//<li></li>
			out.print("<li>" + number + "X" + i + " = " + (number * i) + "</li>");
		}
		out.print("</ul></body></html>");
	}

}
