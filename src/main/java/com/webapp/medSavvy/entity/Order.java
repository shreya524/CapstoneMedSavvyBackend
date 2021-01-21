package com.webapp.medSavvy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_id")
	private long ID;

	@Column(name = "ordmedname")
	private String ordmedname;

	@Column(name = "ordstatus")
	private String ordstatus;

	@Column(name = "ordunitprice")
	private Double ordunitprice;

	@Column(name = "ordqty")
	private int ordqty;

	@Column(name = "ordtotalprice")
	private Double ordtotalprice;
	
	public Order() {
		
	}

	public Order(long iD, String ordmedname, String ordstatus, Double ordunitprice, int ordqty, Double ordtotalprice) {
		super();
		ID = iD;
		this.ordmedname = ordmedname;
		this.ordstatus = ordstatus;
		this.ordunitprice = ordunitprice;
		this.ordqty = ordqty;
		this.ordtotalprice = ordtotalprice;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getOrdmedname() {
		return ordmedname;
	}

	public void setOrdmedname(String ordmedname) {
		this.ordmedname = ordmedname;
	}

	public String getOrdstatus() {
		return ordstatus;
	}

	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
	}

	public Double getOrdunitprice() {
		return ordunitprice;
	}

	public void setOrdunitprice(Double ordunitprice) {
		this.ordunitprice = ordunitprice;
	}

	public int getOrdqty() {
		return ordqty;
	}

	public void setOrdqty(int ordqty) {
		this.ordqty = ordqty;
	}

	public Double getOrdtotalprice() {
		return ordtotalprice;
	}

	public void setOrdtotalprice(Double ordtotalprice) {
		this.ordtotalprice = ordtotalprice;
	}
	
	

}
