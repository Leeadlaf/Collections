/*
 * File: CreateNewUser.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.5 12/12/2013 lwa - auto-login
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//TBD - Check database for existing user
//TBD - Check validity of inputs
//TBD - Email client

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;


public class CreateNewUser extends Activity implements View.OnClickListener {

	// Initializing variables
	EditText userName;
	SharedPreferences namePreferences;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_user_screen);
		
		// Get the app's shared preferences
		namePreferences = PreferenceManager.getDefaultSharedPreferences(this);
				
		//Defining text
		userName = (EditText) findViewById(R.id.desiredUserName);
		
		//Defining buttons
		Button createNewUserButton = (Button) findViewById (R.id.createNewUserButton);
						
		//Listen for button press
		createNewUserButton.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		//saving username into shared preferences
	    SharedPreferences.Editor nameEditor = namePreferences.edit();
	    nameEditor.putString("userName", userName.getText().toString());
	    nameEditor.commit();
					
		switch(v.getId()) {
			case R.id.createNewUserButton:
				Intent homeScreen = new Intent (getApplicationContext(), HomeScreen.class);
	   			
	       	   //starting new activity - create new user screen
	       	   startActivity(homeScreen);
	       	break;
		}
	}
}