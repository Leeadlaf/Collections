/*
 * File: viewCollectionsActivity.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.1 12/03/2013 lwa - fixed 'home' button
 * Vers: 1.0.0 12/03/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

// Clean up and comment code (ongoing)
// view collections - Dynamic Information (fragments?)
// 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewCollectionsActivity extends Activity implements View.OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.collections_list);
		
		//Defining buttons
		Button goHomeButton = (Button) findViewById (R.id.goHomeButton);
				
		//Listen for button press
		goHomeButton.setOnClickListener(this);}
					
		//If a button is clicked
		@Override
		public void onClick(View v) {
			switch(v.getId()) {
				case R.id.goHomeButton:
					Intent homeScreen = new Intent (getApplicationContext(), HomeScreenActivity.class);
				   			
		       	   //starting new activity - go Home
		       	   startActivity(homeScreen);
		       	break;
			}
		}
	}