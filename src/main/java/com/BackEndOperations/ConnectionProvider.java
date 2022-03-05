package com.BackEndOperations;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Candidate;
import com.Entities.Company;

public class ConnectionProvider {
    private Configuration con;
    private SessionFactory SF;
	
	/*This method is responsible for providing Session Factory object...*/
    public SessionFactory ProvideConnection() {
		con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Company.class).addAnnotatedClass(Candidate.class);
		SF=con.buildSessionFactory();
	    return SF;
	}
      

}
