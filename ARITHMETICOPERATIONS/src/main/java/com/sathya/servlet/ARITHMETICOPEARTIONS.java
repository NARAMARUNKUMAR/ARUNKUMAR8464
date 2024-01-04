package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ARITHMETICOPEARTIONS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//send the client data and get the data
		int firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
		int secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
		
		int result=0;
		String operator;
		operator= request.getParameter("arithmetic");
		switch(operator)
		{
			case "add":
				result=firstNumber + secondNumber;
				break;
			case "sub":
				result=firstNumber - secondNumber;
				break;
			case "mul":
				result=firstNumber * secondNumber;
				break;
			case "div":
				result=firstNumber / secondNumber;
				break;
			case "mod":
				result=firstNumber % secondNumber;
				break;
		}
		
		//render the data to webbrowser
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		RequestDispatcher dispatcher=request.getRequestDispatcher("numbers.html");
		dispatcher.include(request, response);
		writer.println("Result is..."+result);
	}
}