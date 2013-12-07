/**
 * Name:	Collection.java
 * Desc:	Collection containing Item objects for Collection$ 
 * 			Android application.
 * Vers:	1.0.1 jtb-
 * Vers:	1.0.0 original coding - kjs
 */

package com.example.collections;

import java.util.ArrayList;

public class Collection {

	private String user;
	private String category;
	private ArrayList<Item> items;
	private Boolean viewable;

	public Collection() {
		// Constructor creates empty ArrayList of Item objects
		items = new ArrayList<Item>(); 
	}
	public Collection(String user, String category){
		// Constructor creates empty ArrayList with user and category of collection
		this.user = user;
		this.category = category;
	}
	
	public void addItem(Item item){
		//Adds items to Collection
		items.add(item);
	}
	public void removeItem(int index){
		//Removes item from Collection using index
		items.remove(index);
	}
	
	public void editItem(){
		//Pulls object, changes parameters, and replaces in same index location
	}
	
	public Boolean isViewable(){
		//Return TRUE if viewable, FALSE if not
		return viewable;
	}
		
	public void setViewable(Boolean state){
		//If TRUE, set to be viewed by other users
		//If FALSE, set to be invisible to other users.
	}
}
