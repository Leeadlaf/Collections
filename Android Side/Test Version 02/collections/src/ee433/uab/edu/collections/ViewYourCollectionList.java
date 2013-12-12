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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
//import android.widget.Toast;
//import android.util.Log;

public class ViewYourCollectionList extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_collection_list_screen);

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

        //Create List Items
         for(int index=0;index<testArrayOfCollections.size();index=index+2){  
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);
                                    
            // Create TextView
            TextView product = new TextView(this);
            product.setText(testArrayOfCollections.get(index));
            ll.addView(product);
             
            //TBD - number of Items in a collection - Technical debt?
            // Create TextView
            //TextView price = new TextView(this);
            //price.setText(" # of Items: "+index+"     ");
            //ll.addView(price);
             
            // Create Button
            final Button btn = new Button(this);
                // Give button an ID
                btn.setId(index+2);
                btn.setText("View");
                // set the layoutParams on the buttons
                btn.setLayoutParams(params);
                homeButton.setOnClickListener(this);
                othersCollectionsButtons.setOnClickListener(this);
                
                //variable to pass along what collection index number was chosen to the next screen
                final int number = index;
                final String collectionName = testArrayOfCollections.get(index);
                                
                // Set click listener for button
                btn.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
              	
                    	//If Button inside Listview is clicked
                    	Intent collectionScreen = new Intent (getApplicationContext(), ViewCollection.class); //TBD fix link
     		       	    
                    	//passing along what collection index number was chosen to the next screen
                    	collectionScreen.putExtra("collectionClicked", number);
                    	
                    	//passing along what collection name to the next screen
                    	collectionScreen.putExtra("collectionNameClicked", collectionName);
                    	                    	
         	            //starting new activity - view Home Screen
         	            startActivity(collectionScreen);
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
     	case R.id.othersCollectionsButtons:
     		Intent othersCollections = new Intent (getApplicationContext(), ViewOtherCollectionList.class);
		
     		//starting new activity - view Home Screen
     		startActivity(othersCollections);
 	   break; }
		// TODO Auto-generated method stub
		
	}
}