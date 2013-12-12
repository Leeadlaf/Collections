/*
 * File: ViewCollection.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.1.0 12/11/2013 lwa - passing information to the screen from the view collections list screen
 * Vers: 1.0.0 12/06/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//TBD - populate with 'real' database information
 
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
 
public class ViewCollection extends Activity implements View.OnClickListener {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_collection_screen);

        //Getting the index number and the name of the collection being displayed:
        Intent i = getIntent();
        String collectionName = i.getStringExtra("collectionNameClicked");
        int collectionNumber = i.getIntExtra("collectionClicked", 0);
        
        //Button name
        TextView collectionNumberTest = (TextView) findViewById(R.id.collectionName);

        //Displaying the name of the collection
        collectionNumberTest.setText(collectionName);
        
        //Defining buttons
      	Button homeButton = (Button) findViewById (R.id.homeButton);
        //Button othersCollectionsButtons = (Button) findViewById (R.id.othersCollectionsButtons);
        
        final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);
         
        // create the layout params that will be used to define how buttons will be displayed
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
        LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        //TBD - Call method to create list of the correct collections items
        //Test case:
        final ArrayList<String> testArrayOfItems = new ArrayList<String>();        
        //Stamps Collection:
        if (collectionNumber == 0){
        	testArrayOfItems.add("Inverted Jenny");      	
        	testArrayOfItems.add("Stamps");      
        	testArrayOfItems.add("1918");      
        	testArrayOfItems.add("Fair");      
        	testArrayOfItems.add("is a United States postage stamp first issued on May 10, 1918 in which the image of the Curtiss JN-4 airplane in the center of the design appears upside-down.");      
        	testArrayOfItems.add("Yes");      
        	testArrayOfItems.add("Jackson");      
        	testArrayOfItems.add("Stamps");      
        	testArrayOfItems.add("1922");      
        	testArrayOfItems.add("Poor");      
        	testArrayOfItems.add("I'll fill this in later...");      
        	testArrayOfItems.add("No");          
        	}
        else if (collectionNumber == 2){
        	testArrayOfItems.add("Randal"); 
        	testArrayOfItems.add("Cars"); 
        	testArrayOfItems.add("1967"); 
        	testArrayOfItems.add("Good"); 
        	testArrayOfItems.add("I don't know anything about classic cars.  I even made up the name 'Randal'"); 
        	testArrayOfItems.add("Yes"); 
        	}
        else {
        	}
        
        //Create List Items
         for(int index=0;index<testArrayOfItems.size();index=index+6){  
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);
                                    
            // Create TextView
            TextView product = new TextView(this);
            product.setText(testArrayOfItems.get(index));
            ll.addView(product);

            // Create Button
            final Button btn = new Button(this);
                // Give button an ID
                btn.setId(index+6);
                btn.setText("View");
                // set the layoutParams on the buttons
                btn.setLayoutParams(params);
                homeButton.setOnClickListener(this);
                
                //variable to pass along what item index number was chosen to the next screen
                final int number = index;
                                
                // Set click listener for button
                btn.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
              	
                    	//If Button inside Listview is clicked
                    	Intent itemScreen = new Intent (getApplicationContext(), ViewItem.class); //TBD fix link
     		       	    
                    	//passing along what Item index number was chosen to the next screen
                    	itemScreen.putStringArrayListExtra("arrayOfItems", testArrayOfItems);
                    	itemScreen.putExtra("itemClicked", number);
                    	
         	            //starting new activity - view Home Screen
         	            startActivity(itemScreen);
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
	    }
		// TODO Auto-generated method stub
		
	}
}

//IMPORTANT: make this class implement InfoExtractor
/**
 * Method for Information extraction- for this screen extracts info on a collection
 *
 * @param Collection
 * @return response Boolean (or return UserInfo object containing info from DB?)
 * Pre-condition: must have the Collection object that was specified on click.
 * Post condition: will populate the inforation display fields with the info from the Collection.
 */
/*
@Override
public void extractInfo(Collection selectedCollection){
	private itemsNum

	this.selectedCollection=selectedCollection;

	displayField1 = selectedCollection.getName();
	displayField2 = selectedCollection.getCategory();
	displayfield3 = selectedCollection.getNumberOfItems();
	displayField4 = selectedCollection.getItemList();		//this will have to use for loop to generate correctly:

}
*/