package com.flipCart.model;



public class Order {
	
	private int id;
	private String city;
	private String itemname;
	private String status;
	
	
	public Order(int id, String city, String itemname, String status) {
		super();
		this.id = id;
		this.city = city;
		this.itemname = itemname;
		this.status = status;
	}
	
	


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getItemname() {
		return itemname;
	}




	public void setItemname(String itemname) {
		this.itemname = itemname;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	@Override
	public String toString() {
		return "Order [id=" + id + ", city=" + city + ", itemname=" + itemname + ", status=" + status + "]";
	}
	
	
	
	
	

}
