/*
 * File: ViewOtherCollectionList.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/06/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

//Clean up and comment code (ongoing)
//
//

public class ViewOtherCollectionList extends Activity implements View.OnClickListener {
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_collection_list_screen);
        
        //Defining buttons
      	Button homeButton = (Button) findViewById (R.id.homeButton);
        Button yourCollectionsButtons = (Button) findViewById (R.id.yourCollectionsButtons);
        
        final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);
         
        // create the layout params that will be used to define how your
        // button will be displayed
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
         
        //Create four items
        // TBD - should poll / pull users collection information from the database
        for(int j=0;j<=4;j++)
        {  
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);
             
            // Create TextView
            TextView product = new TextView(this);
            product.setText(" Collection "+j+"    ");
            ll.addView(product);
             
            // Create TextView
            TextView price = new TextView(this);
            price.setText(" # of Items: "+j+"     ");
            ll.addView(price);
             
            // Create Button
            final Button btn = new Button(this);
                // Give button an ID
                btn.setId(j+1);
                btn.setText("View");
                // set the layoutParams on the button
                btn.setLayoutParams(params);
                homeButton.setOnClickListener(this);
                yourCollectionsButtons.setOnClickListener(this);
                
             final int index = j;
                // Set click listener for button
                btn.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
//            		    switch(v.getId()) {
//         	            	case R.id.homeButton:
//         	            		Intent homeScreen = new Intent (getApplicationContext(), HomeScreen.class);
//         	   			
//         	            		//starting new activity - view Home Screen
//         	            		startActivity(homeScreen);
//         	        	   break; }
                        Log.i("TAG", "index :" + index);
                         
                        Toast.makeText(getApplicationContext(),
                                "Clicked Button Index :" + index,
                                Toast.LENGTH_LONG).show();
                         
                    }
                });
                 
               //Add button to LinearLayout
                ll.addView(btn);
               //Add button to LinearLayout defined in XML
                lm.addView(ll); 
        }
    }

	@Override
	public void onClick(View v) {
	    switch(v.getId()) {
     	case R.id.homeButton:
     		Intent homeScreen = new Intent (getApplicationContext(), HomeScreen.class);
		
     		//starting new activity - view Home Screen
     		startActivity(homeScreen);
 	   break; 
     	case R.id.yourCollectionsButtons:
     		Intent yourCollections = new Intent (getApplicationContext(), ViewYourCollectionList.class);
		
     		//starting new activity - view Home Screen
     		startActivity(yourCollections);
 	   break; }
		// TODO Auto-generated method stub
		
	}
}