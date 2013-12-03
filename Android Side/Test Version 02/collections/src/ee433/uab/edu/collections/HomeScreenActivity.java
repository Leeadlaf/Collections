/*
 * File: HomeScreenActivity.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.0 12/03/2013 lwa - modified code, more buttons working
 * Vers: 1.0.0 11/26/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;

//TBD - Multiple button implementation must be fixed
//    - Clean up code
//    - 

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
//import android.view.Menu;
import android.content.Intent;

public class HomeScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);
	//}

	Button viewCollectionsButton = (Button) findViewById (R.id.viewCollectionsButton);
		
	
	//Listen for button press
	viewCollectionsButton.setOnClickListener(new View.OnClickListener() {
		
		//@Override
		public void onClick(View v) {
			switch(v.getId()) {
	           case R.id.viewCollectionsButton:
	        	   Intent nextScreen = new Intent (getApplicationContext(), viewCollectionsActivity.class);
	   			
	        	   //starting new activity
	        	   startActivity(nextScreen);
	           break;
//	           case R.id.button2:
//	           // do stuff;
//	           break;
			}
		}
			
//			// TODO Auto-generated method stub
//			//if v == viewCollectionsButton
//					
//			Intent nextScreen = new Intent (getApplicationContext(), viewCollectionsActivity.class);
//			
//			//starting new activity
//			startActivity(nextScreen);
//		}
	});
	
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.home_screen, menu);
//		return true;
//	}

}
}
