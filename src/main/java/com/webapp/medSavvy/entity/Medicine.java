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

	@Column(name = "medinvqty", columnDefinition = "int default 10")
	private int medinvqty;

	@Column(name = "medunitprice", precision = 10, scale = 2)
	private Double medunitprice;

// default constructor
	public Medicine() {
	}

	public Medicine(long iD, String medname, String medbrand, String medtype, String meddosageform, int medinvqty,
			Double medunitprice) {
		super();
		ID = iD;
		this.medname = medname;
		this.medbrand = medbrand;
		this.medtype = medtype;
		this.meddosageform = meddosageform;
		this.medinvqty = medinvqty;
		this.medunitprice = medunitprice;
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

	public int getMedinvqty() {
		return medinvqty;
	}

	public void setMedinvqty(int medinvqty) {
		this.medinvqty = medinvqty;
	}

	public Double getMedunitprice() {
		return medunitprice;
	}

	public void setMedunitprice(Double medunitprice) {
		this.medunitprice = medunitprice;
	}

}
