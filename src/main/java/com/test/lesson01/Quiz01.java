package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class Quiz01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		//request -> 가공(서블릿) -> response
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 MM월 dd일");
		out.println(sdf.format(now));
		
	}
	

}
