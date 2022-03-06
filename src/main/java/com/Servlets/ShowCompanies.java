package com.Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BackEndOperations.DatabaseDataExtractor;
import com.Entities.Company;

@WebServlet("/showCom")
public class ShowCompanies extends HttpServlet{

	public void doGet( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
	
    DatabaseDataExtractor DDE=new DatabaseDataExtractor();
	List<Company> companies=DDE.getEnlistedCompanies(); 
	 for( Company com:  companies ) {
		 System.out.println( com.getCom_id()+"  "+com.getCom_name()  );
     }
	
	
	
	 req.setAttribute("LC", companies);
	
	RequestDispatcher rd= req.getRequestDispatcher("ShowComp.jsp");
	rd.forward(req, res);
                                      	
	}
	
	
}
