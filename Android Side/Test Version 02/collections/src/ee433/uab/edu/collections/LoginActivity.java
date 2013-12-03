/*
 * File: LoginActivity.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.0 12/03/2013 lwa - modified code, both buttons working
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//TBD - Clean up code
//    - ADD login mechanics: Check user name / password against Database?
//    - 

import ee433.uab.edu.collections.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
	
		Button newUserButton = (Button) findViewById (R.id.newUserButton);
		Button loginButton = (Button) findViewById (R.id.loginButton);
		
		//Listen for button press
		//newUserButton.setOnClickListener(new View.OnClickListener() {
		newUserButton.setOnClickListener(this);
		loginButton.setOnClickListener(this);}	
			
			
			@Override
			public void onClick(View v) {
				switch(v.getId()) {
		           case R.id.newUserButton:
		        	   Intent nextScreen = new Intent (getApplicationContext(), NewUserActivity.class);
		   			
		        	   //starting new activity
		        	   startActivity(nextScreen);
		           break;
		           case R.id.loginButton:
		        	   Intent loginScreen = new Intent (getApplicationContext(), HomeScreenActivity.class);
		   			
		        	   //starting new activity
		        	   startActivity(loginScreen);
		           break;
				}
			}
			
			
//			//@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent nextScreen = new Intent (getApplicationContext(), NewUserActivity.class);
//				
//				//starting new activity
//				startActivity(nextScreen);
//			}
	//	});
		

	
	
		
	
	
	
	
	}

	
	
	
	
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

//}
