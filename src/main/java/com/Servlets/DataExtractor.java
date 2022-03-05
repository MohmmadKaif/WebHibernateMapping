package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BackEndOperations.DataPersister;

@WebServlet("/extract")
public class DataExtractor extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
    	   DataPersister DP=new DataPersister();
    	   PrintWriter out = res.getWriter();
    	   
    	   String com_id= req.getParameter("comid");
    	   String com_name= req.getParameter("comname");
    	   String cand_id= req.getParameter("candid");
    	   String cand_name= req.getParameter("candname");
    	   
    	   DP.PersistData(com_id, com_name, cand_id, cand_name);
    	   out.println("Operation Sucessfull");   
    }
	
	
}
