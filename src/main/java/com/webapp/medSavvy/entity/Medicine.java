package com.webapp.medSavvy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "med_id")
	private long ID;

	@Column(name = "medname")
	private String medname;

	@Column(name = "medbrand")
	private String medbrand;

	@Column(name = "medtype")
	private String medtype;

	@Column(name = "meddosageform")
	private String meddosageform;

	@Column(name = "medinvqty")
	private String medinvqty;

	@Column(name = "medunitprice")
	private Double meduprice;

// default constructor
	public Medicine() {
	}

public Medicine(long iD, String medname, String medbrand, String medtype, String meddosageform, String medinvqty,
		Double meduprice) {
	super();
	ID = iD;
	this.medname = medname;
	this.medbrand = medbrand;
	this.medtype = medtype;
	this.meddosageform = meddosageform;
	this.medinvqty = medinvqty;
	this.meduprice = meduprice;
}

public long getID() {
	return ID;
}

public void setID(long iD) {
	ID = iD;
}

public String getMedname() {
	return medname;
}

public void setMedname(String medname) {
	this.medname = medname;
}

public String getMedbrand() {
	return medbrand;
}

public void setMedbrand(String medbrand) {
	this.medbrand = medbrand;
}

public String getMedtype() {
	return medtype;
}

public void setMedtype(String medtype) {
	this.medtype = medtype;
}

public String getMeddosageform() {
	return meddosageform;
}

public void setMeddosageform(String meddosageform) {
	this.meddosageform = meddosageform;
}

public String getMedinvqty() {
	return medinvqty;
}

public void setMedinvqty(String medinvqty) {
	this.medinvqty = medinvqty;
}

public Double getMeduprice() {
	return meduprice;
}

public void setMeduprice(Double meduprice) {
	this.meduprice = meduprice;
}

	

}
