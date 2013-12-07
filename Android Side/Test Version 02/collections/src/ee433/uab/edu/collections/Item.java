/**
 * Name: 	Item.java
 * Desc:	A collectible Item that part of a Collection. Class belong to Collection$ 
 * 			Android application
 * Date:	11/18/2013
 * Vers:	1.0.0 original - kjs
 */

package com.example.collections;

public class Item {

	private String name;
	private String description;
	private String dateAdded;
	private String condition;
	private Boolean sharedView;
	private double price;
	//private Image ItemPicture;


	public Item(){
		//Create default items. 
	}
	
	public Item(String Name, String Description, String Condition, Boolean SharedView, double Price){
		//Creates Item object with input parameters. DateAdded is not an input parameter.
		
		//Set properties of Item object using parameters.
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDateAdded() {
		return dateAdded;
	}
	
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public Boolean getSharedView() {
		return sharedView;
	}
	
	public void setSharedView(Boolean sharedView) {
		this.sharedView = sharedView;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
