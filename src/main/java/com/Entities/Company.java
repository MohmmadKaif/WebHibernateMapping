package com.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Company {
@Id
private String com_id;
private String com_name;
@OneToMany(mappedBy="company")
private List<Candidate> candidates;

public String getCom_id() {
	return com_id;
}
public void setCom_id(String com_id) {
	this.com_id = com_id;
}
public String getCom_name() {
	return com_name;
}
public void setCom_name(String com_name) {
	this.com_name = com_name;
}
public List<Candidate> getCandidates() {
	return candidates;
}
public void setCandidates(List<Candidate> candidates) {
	this.candidates = candidates;
}

}
