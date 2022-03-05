



package com.BackEndOperations;




import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entities.Candidate;
import com.Entities.Company;

public class DataPersister {
	
 	public void PersistData(  String com_id, String com_name , String cand_id , String cand_name){
		    System.out.println("TILL HERE UPTO DATE.........");
 
 		DataSetter setter=new DataSetter();
 		 ConnectionProvider cp=new ConnectionProvider();
 		 SessionFactory SF;
 		 Session session;
 		 Transaction tx;
		 Company com=null;
 		 Candidate cand=null;
   		 boolean flag=false;
         
         
 		  
         SF=cp.ProvideConnection(); 
         session=SF.openSession();
   		 tx=session.beginTransaction();
         
   		 //Getting the Company object from database...if it does not exist we will get null...
   		 com=(Company)session.get(Company.class, com_id);
   		 
   		 
 		   if(com!=null) {
 			/*Here we are not creating the object of com because we already have one with us from above statement..*/
 			cand=setter.setCandidateData(cand_id, cand_name, com);
 			setter.setComapnyDataForExisting(com, cand);
  		    session.saveOrUpdate(com);//Saving the company object...Always save the Object of Entity with @OneToMany first.... 
  		    }
 		else{
 		   //First Creating the object of company i.e entity having OneToMany annotation...
 			com=setter.setCompanyData(com_id, com_name);
 		   cand=setter.setCandidateData(cand_id, cand_name, com);
 		   List<Candidate>candidates=new ArrayList<>();  
 		   candidates.add(cand);
 		   com.setCandidates(candidates);
 		   session.saveOrUpdate(com);//Saving the object of company....
 		}
 		  session.saveOrUpdate(cand);//In the end we will save the object of Entity with ManyToOne annotation and this is what we are doing here.. 
 		  tx.commit(); //Here we are commtting our transaction....	 
     	  session.close();//closing the session..
     	  SF.close();//closing the Session factory...
		 
 		 
 		 
 	
 	}

}
