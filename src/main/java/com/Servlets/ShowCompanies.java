package com.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BackEndOperations.DatabaseDataExtractor;
import com.Entities.Candidate;
import com.Entities.Company;

@WebServlet("/showCom")
public class ShowCompanies extends HttpServlet{

	public void doGet( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
	
    DatabaseDataExtractor DDE=new DatabaseDataExtractor();
	List<Candidate> candidates=DDE.getAllExperiences("com1000"); 
	 for( Candidate cand:  candidates ) {
		 System.out.println( cand.getCand_id()+"  "+cand.getCand_name()  );
     }
	
	
	
	 req.setAttribute("AC", candidates);
	
	RequestDispatcher rd= req.getRequestDispatcher("ShowComp.jsp");
	rd.forward(req, res);
                                      	
	}
	
	
}
