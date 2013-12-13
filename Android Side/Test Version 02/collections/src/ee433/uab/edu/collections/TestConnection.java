/*
 * File: TestConnection.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/13/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;

//TBD - Fix Add Item Link (build add item)
//TBD - Fix Networking Link (build networking)
//TBD - Add code to 'really' log off the user

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

public class TestConnection extends Activity {

	// Define shared preferences
	//SharedPreferences namePreferences;
	
	String result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_screen);
		
		
		
		
		//Tying name to text field
		TextView connectionResult = (TextView) findViewById(R.id.connectionResult);
    
        // Displaying Received data in text field
        connectionResult.setText(result);
		
		
		
		
		
	}
}
		// Get the app's shared preferences
		//namePreferences = PreferenceManager.getDefaultSharedPreferences(this);
		
		// pulling the saved user name out of preferences
		//String savedUserName = namePreferences.getString("userName", "");
		
		//Tying name to text field
		//TextView userName = (TextView) findViewById(R.id.userName);
    
        // Displaying Received data in text field
        //userName.setText(savedUserName);
		
		