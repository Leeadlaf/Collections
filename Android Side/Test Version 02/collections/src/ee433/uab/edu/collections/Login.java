/*
 * File: Login.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.2 12/06.2013 lwa - declaring text input - passing username to home screen
 * Vers: 1.1.1 12/06/2013 jtb - added initial code for doLoginCheck and populateUserInfoHolder method
 * Vers: 1.1.0 12/03/2013 lwa - modified code, both buttons working
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

// Clean up and comment code (ongoing)
// ADD login mechanics: Check user name / password against Database?
// Fix indents??
// 

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import ee433.uab.edu.collections.R.id;
//import android.view.View.OnClickListener;
//import android.view.Menu;

public class Login extends Activity implements View.OnClickListener {

	// Initializing variables
	EditText userName;
	EditText userPassword;
	
	//public String username;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
	
		//Defining text
		userName = (EditText) findViewById(R.id.userName);
		userPassword = (EditText) findViewById(R.id.userPassword);
		
		//Defining buttons
		Button newUserButton = (Button) findViewById (R.id.newUserButton);
		Button loginButton = (Button) findViewById (R.id.loginButton);
		
		//Listen for button press
		newUserButton.setOnClickListener(this);
		loginButton.setOnClickListener(this);}	
			
		//If a button is clicked
		@Override
		public void onClick(View v) {
			switch(v.getId()) {
				case R.id.newUserButton:
					Intent newUserScreen = new Intent (getApplicationContext(), CreateNewUser.class);
		   			
		       	   //starting new activity - create new user screen
		       	   startActivity(newUserScreen);
		       	break;
		        case R.id.loginButton:
		       	   Intent homeScreen = new Intent (getApplicationContext(), HomeScreen.class);
		       	   
		       	   
		       	   //String pass = userPassword.getText().toString();
		       	   homeScreen.putExtra("name", userName.getText().toString());
		       	   
//		       	   String userID = userName.getText().toString() ;
//		       	   homeScreen.putExtra(userID, userName.getText().toString());
		       	   //homeScreen.putExtra("password", userPassword.getText().toString());
		       	   //homeScreen.p
		       	   //TBD - Check to see if the user / password is in the database!
		   			
		       	   //starting new activity - login screen
		       	   startActivity(homeScreen);
		        break;
			}
		}

//---Code commented out to make overall program functional (so i can test the rest of the code - LWA)---
//	
//		/**
//    	 * Method for login verification 
//     	*
//     	* @param entry String
//     	* @return response Boolean (or return UserInfo object containing info from DB?)
//     	*/
//     	public void doLoginCheck(String entry) {
//     		query = this.entry;
//     		vc = new VerificationClient ();					//object that communicates with DB
//     		Boolean response = vc.isValidID(query);			//method that requires DB communication 
//     		return response;
//      	}


	   /**
   	 	* Method for stuffing user information into the UserInfoHolder object 
     	*
    	* @param userID String
	   	* @return UserInfoHolder
     	*/
//     	public UserInfoHolder populateUserInfo(String userID){
//     			userID=this.userID;
//     			UserInfoHolder userData = new UserInfoHolder(userID);
//     			userData.setNumberOfCollections(userID);
//     			userData.setCollectionList(userID);
//     			userData.setOwner(userID);
//     			return userData;
//		}
				//return UserInfo}









	}