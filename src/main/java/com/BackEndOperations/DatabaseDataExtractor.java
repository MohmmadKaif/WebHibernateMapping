package com.BackEndOperations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entities.Company;

public class DatabaseDataExtractor {
    private ArrayList<Company> comlist; 
	private SessionFactory SF;
	private Session session ;  
    private Query q;
	private ConnectionProvider cp;
	
	public ArrayList<Company> getEnlistedCompanies(){
    	cp=new ConnectionProvider();
		SF=cp.ProvideConnection();
    	session=SF.openSession();
        
    	String query="from Company";
        q=session.createQuery(query);
        comlist=(ArrayList)q.list();
        System.out.println("HERE..........................");
       
        session.close();
        return comlist;
     }
	
}
