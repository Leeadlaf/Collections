/*
 * File: HomeScreen.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.0 12/11/2013 lwa - using shared preferences to store the current username
 * Vers: 1.0.5 12/03/2013 lwa - cleaned up code, fixed buttons
 * Vers: 1.0.1 12/03/2013 lwa - modified code, more buttons working
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;

// Clean up and comment code (ongoing)
// add Code to log off the user
// Fix indents??
// 

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
//import android.view.Menu;

public class HomeScreen extends Activity implements View.OnClickListener {

	// Define shared preferences
	SharedPreferences namePreferences;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);
		
		// Get the app's shared preferences
		namePreferences = PreferenceManager.getDefaultSharedPreferences(this);
		
		// pulling the saved user name out of preferences
		String savedUserName = namePreferences.getString("userName", "");
		
		//Tying name to text field
		TextView userName = (TextView) findViewById(R.id.userName);
        
        // Receiving the Data from previous screen - NO LONGER NEEDED WITH SHARED PREFERENCES.  do not delete        
        //Intent i = getIntent();
        //String name = i.getStringExtra("name");
        
        // Displaying Received data in text field
        userName.setText(savedUserName);
		
		//Defining buttons
		Button viewCollectionsButton = (Button) findViewById (R.id.viewCollectionsButton);
		Button addItemButton = (Button) findViewById (R.id.addItemButton);		
		Button networkingButton = (Button) findViewById (R.id.networkingButton);
		Button logOutButton = (Button) findViewById (R.id.logOutButton);

		//Listen for button press
		//viewCollectionsButton.setOnClickListener(new View.OnClickListener() {
		viewCollectionsButton.setOnClickListener(this);
		addItemButton.setOnClickListener(this);
		networkingButton.setOnClickListener(this);
		logOutButton.setOnClickListener(this);}
		
	    //display.setText("Entered name is : "+R.id.userName);
	
	    //If a button is clicked
		@Override
		public void onClick(View v) {
			switch(v.getId()) {
	           case R.id.viewCollectionsButton:
	        	   Intent collectionsScreen = new Intent (getApplicationContext(), ViewYourCollectionList.class);
	   			
	        	   //starting new activity - view collections
	        	   startActivity(collectionsScreen);
	           break;
	           case R.id.addItemButton:
	        	   Intent addItemScreen = new Intent (getApplicationContext(), ViewYourCollectionList.class); // TBD - Fix Class
	   			
	        	   //starting new activity - add item
	        	   startActivity(addItemScreen);
	           break;
	           case R.id.networkingButton:
	        	   Intent networkingScreen = new Intent (getApplicationContext(), ViewYourCollectionList.class); // TBD - Fix Class
	   			
	        	   //starting new activity - networking menu
	        	   startActivity(networkingScreen);
	           break;
	           case R.id.logOutButton:
	        	   Intent logOut = new Intent (getApplicationContext(), Login.class);
	   			
	        	   //TBD - Add Code to log off the user!
	        	   
	        	   //starting new activity - logging off user
	        	   startActivity(logOut);
	           break;
			}
		}
	}




	/*Method List : for UML diagram*/
	//doAddScreen();
	//doViewYourCollectionList();
	//doNetworkingScreen();
	//doLogOut();