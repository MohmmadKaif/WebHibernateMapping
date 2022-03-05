package com.BackEndOperations;

import java.util.ArrayList;

import com.Entities.Candidate;
import com.Entities.Company;

public class DataSetter {
	
	
	public Company setCompanyData( String com_id, String comp_name) {
		Company com=new Company();
		com.setCom_id(com_id);
        com.setCom_name(comp_name);
        return com;
	}
	
	
	public void setComapnyDataForExisting( Company com,Candidate cand ) {
		com.getCandidates().add(cand);
		
	}
   
	public Candidate setCandidateData( String cand_id , String cand_nmae ,Company com ) {
		Candidate cand=null;
		cand=new Candidate();
		cand.setCand_id(cand_id);
        cand.setCand_name(cand_nmae); 
		cand.setCompany(com);
        return cand;
	}
	
	
}
