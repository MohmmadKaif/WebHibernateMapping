package com.BackEndOperations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entities.Candidate;
import com.Entities.Company;

public class DatabaseDataExtractor {
    private List<Company> comlist; 
	private SessionFactory SF;
	private Session session ;  
    private Query q;
	private ConnectionProvider cp;
	
	@SuppressWarnings("unchecked")
	public List<Company> getEnlistedCompanies(){
    	cp=new ConnectionProvider();
		SF=cp.ProvideConnection();
    	session=SF.openSession();
        
    	String query="from Company";
        q=session.createQuery(query);
        comlist=q.list();
        System.out.println("HERE..........................");
       
        session.close();
        SF.close();
        return comlist;
     }
	
	
	@SuppressWarnings("unchecked")
	public List<Candidate> getAllExperiences(String com_id){
		List<Candidate> candidates=null;
		cp=new ConnectionProvider();
		SF=cp.ProvideConnection();
		session=SF.openSession();
		
		String query=" from Candidate c where c.company='"+com_id+"'";
		q=session.createQuery(query);
		candidates=q.list();
		return candidates;
	}
	
}
