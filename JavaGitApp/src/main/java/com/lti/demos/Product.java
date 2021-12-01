package com.lti.demos;

public class Product {
	
	private int prdId=0;
	private String prdName="";
	
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + "]";
	}
	public Product() {
		super();
	}
	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	} 
	
}

