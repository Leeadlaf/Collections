/*
 * File: LoginActivity.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.0 12/03/2013 lwa - modified code, both buttons working
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//TBD - Clean up and comment code (ongoing)
//    - ADD login mechanics: Check user name / password against Database?
//    - Fix indents
//    - 

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
//import ee433.uab.edu.collections.R.id;
//import android.view.View.OnClickListener;
//import android.view.Menu;

public class LoginActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
	
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
					Intent newUserScreen = new Intent (getApplicationContext(), NewUserActivity.class);
		   			
		       	   //starting new activity - create new user screen
		       	   startActivity(newUserScreen);
		       	break;
		        case R.id.loginButton:
		       	   Intent loginScreen = new Intent (getApplicationContext(), HomeScreenActivity.class);
		   			
		       	   //starting new activity - login screen
		       	   startActivity(loginScreen);
		        break;
			}
		}
	}