package com.sathya.formex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FullNameEx1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        //client sends the request data
				String firstname=request.getParameter("first name");
				String middlename=request.getParameter("middle name");
				String lastname=request.getParameter("last name");
				
				//Processing the data 
				String fullname;
				fullname=firstname+middlename+lastname;
				
				//render the response the browser
				response.setContentType("text/plain");
				PrintWriter writer=response.getWriter();
				writer.println("YOUR FULL NAME..."+fullname);

	}
	
	
	}


