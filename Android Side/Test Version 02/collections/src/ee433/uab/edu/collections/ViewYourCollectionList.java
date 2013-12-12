/*
 * File: ViewYourCollectionList.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/04/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//Clean up and comment code (ongoing)
//Should have a master class for viewing this and viewing others collections, technical debt?
//
 
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
//import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
//import android.widget.Toast;
 
public class ViewYourCollectionList extends Activity implements View.OnClickListener {
 
	
	// Initializing variables
//	View userName;
//	EditText userName;	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_collection_list_screen);
        
//		//Defining text
//		userName = findViewById(R.id.userName);
//		userName = (EditText) findViewById(R.id.userName);        
        
        //Defining buttons
      	Button homeButton = (Button) findViewById (R.id.homeButton);
        Button othersCollectionsButtons = (Button) findViewById (R.id.othersCollectionsButtons);
        
        final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);
         
        // create the layout params that will be used to define how your
        // button will be displayed
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
        LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        //TBD - Call method to create list of the users collections
        
        //Test case:
        ArrayList<String> testArrayOfCollections = new ArrayList<String>();
        testArrayOfCollections.add("Stamps");
        testArrayOfCollections.add("Max Wolfe");        
        testArrayOfCollections.add("Cars");
        testArrayOfCollections.add("Lee Adlaf");
        
        //int size = testArrayOfCollections.size();
        //testArrayOfCollections.get(1);
        
        
        
        //Create four items
        // TBD - should poll / pull users collection information from the database
        
        
        
        for(int indexx=0;indexx<testArrayOfCollections.size();indexx++)
        	
        //for(int j=0;j<=4;j++)
        {  
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);
             
            
            
            // Create TextView
            TextView product = new TextView(this);
            //product.setText(" Collection "+j+"    ");
            //String collectionItem = testArrayOfCollections.get(1);
            product.setText(testArrayOfCollections.get(indexx));
            //product.setText(collectionItem);
            ll.addView(product);
             
            // Create TextView
            TextView price = new TextView(this);
            price.setText(" # of Items: "+indexx+"     ");
            ll.addView(price);
             
            // Create Button
            final Button btn = new Button(this);
                // Give button an ID
                btn.setId(indexx+1);
                btn.setText("View");
                // set the layoutParams on the button
                btn.setLayoutParams(params);
                homeButton.setOnClickListener(this);
                othersCollectionsButtons.setOnClickListener(this);
                
             final int index = indexx;
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
                    	
                    	
                    	//If Button inside Listview is clicked - TBD - How to pass information to the view collection screen?
                    	Intent collectionScreen = new Intent (getApplicationContext(), ViewCollection.class); //TBD fix link
         	   			
         	            //starting new activity - view Home Screen
         	            startActivity(collectionScreen);
                    	
//Using Toast                  	
//                    	Log.i("TAG", "index :" + index);
//                         
//                        Toast.makeText(getApplicationContext(),
//                                "Clicked Button Index :" + index,
//                                Toast.LENGTH_LONG).show();
                         
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

//     		userName = findViewById(R.id.userName);
//     		homeScreen.putExtra("name", userName.getText().toString());     
//     		homeScreen.putExtra("name", userName.toString());     		
//     		homeScreen.putExtra("name", userName.getText().toString());
//     		homeScreen.putExtra(userName.toString());
//     		homeScreen.putExtra(userName, name);     		
     		
     		//starting new activity - view Home Screen
     		startActivity(homeScreen);
 	   break; 
     	case R.id.othersCollectionsButtons:
     		Intent othersCollections = new Intent (getApplicationContext(), ViewOtherCollectionList.class);
		
     		//starting new activity - view Home Screen
     		startActivity(othersCollections);
 	   break; }
		// TODO Auto-generated method stub
		
	}
}