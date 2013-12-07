/**
 * Name:	Collection.java
 * Desc:	Collection containing Item objects for Collection$ 
 * 			Android application.
 * Vers:	1.0.1 12/07/2013 jtb - additions to Arraylist
 * Vers:	1.0.0  kjs - original coding 
 */

package com.example.collections;

import java.util.ArrayList;


// Q: need to fomat based on class diagram 	
// A: 				{date issue addressed: 12/dd/13	}
public class Collection {

	private String user;
	private String name;					//added
	private String category;
	private int numberOfItems;				//added
	private ArrayList<Item> itemCollection;
	private Boolean viewable;				



	public Collection() {
		// Constructor creates empty ArrayList of Item objects
		itemCollection = new ArrayList<Item>(); 
	}



	public Collection(String user, String category){
		// Constructor creates empty ArrayList with user and category of collection
		this.user = user;
		this.category = category;
	}
	
	public void addItem(Item item){
		//Adds itemCollection to Collection
		itemCollection.add(item);
	}
	public void removeItem(int index){
		//Removes item from Collection using index
		itemCollection.remove(index);
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
		this.viewable = state;
	}
}
