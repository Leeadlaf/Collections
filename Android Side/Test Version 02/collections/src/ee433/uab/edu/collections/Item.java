/**
 * Name: 	Item.java
 * Desc:	A collectible Item that part of a Collection. Class belong to Collection$ 
 * 			Android application
 * Date:	11/18/2013
 * Vers:	1.0.1 12/07/2013 jtb - added editable var that restricts the ability to set values without permission.
 * Vers:	1.0.0 11/18/2013 kjs -original coding
 */

package ee433.uab.edu.collections;


// Q: editable variable- default constructors :True or False	
// A: 				{date issue addressed: 12/dd/13	}
// Q: check set methods: does program need to use method to get editable value?	
// A: 				{date issue addressed: 12/dd/13	}
// Q: need to test editable variable by testing the set methods
// A: 				{date issue addressed: 12/dd/13	} 


public class Item {

	private String name;
	private String description;
	private String dateAdded;
	private String condition;
	private Boolean sharedView;
	private double price;
	//private Image itemPicture;
	private Boolean editable;			//if this is true, then set methods can be accessed.
										// (Does not apply to setEditable method, obviously)
										//** should ifs in set methods use this.getEditable?	
//---Code commented out to make overall program functional (so i can test the rest of the code - LWA)---
//
//	//Creates a default item. 
//	public Item(){
//		this.name = "<blank>";
//		this.description= "<blank>";
//		this.dateAdded = "mm/dd/yyy";
//		this.condition = "<blank>";
//		this.sharedview = True;
//	 	this.price = 0.0;
//
//	 	this.editable = True; 			//want to be able to set things
//	}
//	//Creates Item object with input parameters. DateAdded is not an input parameter.
//	public Item(String name, String description, String condition, Boolean sharedview, double price){
//		this.name= name;
//		this.description = description;
//		this.condition = condition;
//		this.sharedview = sharedview;
//	 	this.price = price;
//	 	
//	 	this.editable = False; 			// already set item values? -- 
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		if(this.getEditable()==True){
//		//if(editable==True){
//			this.name = name;
//		}
//		
//	}
//	
//	public String getDescription() {
//		return description;
//	}
//	
//	public void setDescription(String description) {
//		if(this.getEditable()==True){
//		//if(editable==True){
//			this.description = description;
//		}
//		
//	}
//	
//	public String getDateAdded() {
//		return dateAdded;
//	}
//	
//	public void setDateAdded(String dateAdded) {
//		if(this.getEditable()==True){
//		//if(editable==True){
//			this.dateAdded = dateAdded;
//		}
//		
//	}
//	
//	public String getCondition() {
//		return condition;
//	}
//	
//	public void setCondition(String condition) {
//		if(this.getEditable()==True){
//		//if(editable==True){
//			this.condition = condition;
//		}
//	}
//	
//	public Boolean getSharedView() {
//		return sharedView;
//	}
//	
//	public void setSharedView(Boolean sharedView) {
//		if(this.getEditable()==True){
//		//if(editable==True){
//			this.sharedView = sharedView;
//		}
//	}
//	
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		if(this.getEditable()==True){
//		//if(editable==True){
//			this.price = price;
//		}
//		
//	}
//
//
//
//
//	public Boolean getEditable() {
//		return editable;
//	}
//	public void setEditable(Boolean editable) {
//		this.editable = editable;
//	}
}
