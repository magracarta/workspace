package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add2")
public class Add2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String [] num_ = request.getParameterValues("num");
		
		int result= 0;
		
		for(int i =0; i< num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			result += num;
		}
		
		out.print(result);
		
	
	}


	

}
