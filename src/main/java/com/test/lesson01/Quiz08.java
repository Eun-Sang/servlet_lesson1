package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz08")
public class Quiz08 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String search = request.getParameter("search");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
	
		
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String line = iter.next();
//			if (line.contains(search)) {
//				out.print(line + "<br>");
//			}
			
			// 첫번째
//			int index = line.indexOf("search");
//			if (index > -1) {
//				StringBuffer sb = new StringBuffer();
//				sb.append(line);
//				sb.insert(index, "<b>"); // <b> 태그 추가
//				sb.insert(index + search.length() + 3, "</b>"); // <b>맛집|</맛집>
//				
//				out.print(sb + "<br>");
//			}
			
			// 두번째
//			if (line.contains(search)) {
//				String[] words = line.split(search);
//				out.print(words[0] + "<b>" + search + "</b>" + words[1] + "<br>");
//			}
			
			// 세번째
			if (line.contains(search)) {
				line = line.replace(search, "<b>" + search + "</b>");//replace의 형태를 신경써야함
				out.print(line + "<br>");
			}
		}
		out.print("</body></html>");
	}
}
