package com.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Candidate {
@Id
private String cand_id;
private String cand_name;
@ManyToOne
private Company company;
public String getCand_id() {
	return cand_id;
}
public void setCand_id(String cand_id) {
	this.cand_id = cand_id;
}
public String getCand_name() {
	return cand_name;
}
public void setCand_name(String cand_name) {
	this.cand_name = cand_name;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}

}
