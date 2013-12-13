/*
 * File: Login.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.5 12/11/2013 lwa - using shared preferences to store the current username, cleanup
 * Vers: 1.1.2 12/06/2013 lwa - declaring text input - passing username to home screen
 * Vers: 1.1.1 12/06/2013 jtb - added initial code for doLoginCheck and populateUserInfoHolder method
 * Vers: 1.1.0 12/03/2013 lwa - modified code, both buttons working
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//TBD - Check to see if the user / password is in the database!
//TBD - check validity of user input

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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
	SharedPreferences namePreferences;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
	
		// Get the app's shared preferences
		namePreferences = PreferenceManager.getDefaultSharedPreferences(this);
		
		//Defining text
		userName = (EditText) findViewById(R.id.connectionResult);
		userPassword = (EditText) findViewById(R.id.userPassword);
		
		//Defining buttons
		Button newUserButton = (Button) findViewById (R.id.newUserButton);
		Button loginButton = (Button) findViewById (R.id.loginButton);
		Button networkTestButton = (Button) findViewById (R.id.networkTestButton);		
		Button networkTeam2TestButton = (Button) findViewById (R.id.networkTeam2TestButton);		
		
		//Listen for button press
		newUserButton.setOnClickListener(this);
		loginButton.setOnClickListener(this);	
	    networkTeam2TestButton.setOnClickListener(this);		    
        networkTestButton.setOnClickListener(this);}		
	
			
		//If a button is clicked
		@Override
		public void onClick(View v) {
			
			//saving username into shared preferences
		    SharedPreferences.Editor nameEditor = namePreferences.edit();
		    nameEditor.putString("userName", userName.getText().toString());
		    nameEditor.commit();
						
			switch(v.getId()) {
				case R.id.newUserButton:
					Intent newUserScreen = new Intent (getApplicationContext(), CreateNewUser.class);
		   			
		       	   //starting new activity - create new user screen
		       	   startActivity(newUserScreen);
		       	break;
		        case R.id.loginButton:
		       	   Intent homeScreen = new Intent (getApplicationContext(), HomeScreen.class);

		       	   //TBD - Check to see if the user / password is in the database!
		   			
		       	   //starting new activity - login screen
		       	   startActivity(homeScreen);
		        break;
		        case R.id.networkTeam2TestButton:
			       	   Intent testTeam2Connection = new Intent (getApplicationContext(), TestConnection2.class);

			       	   //TBD - Check to see if the user / password is in the database!
			   			
			       	   //starting new activity - login screen
			       	   startActivity(testTeam2Connection);
			    break;
		        case R.id.networkTestButton:
			       	   Intent testConnection = new Intent (getApplicationContext(), TestConnection.class);

			       	   //TBD - Check to see if the user / password is in the database!
			   			
			       	   //starting new activity - login screen
			       	   startActivity(testConnection);
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