/*
 * File: ViewItem.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.5 12/11/2013 lwa - Layout, adding items
 * Vers: 1.0.0 12/10/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//TBD - Add Research Button
//TBD - Add Remove Functionality
//TBD - Add Thumbnail
//TBD - Add Edit Functionality
 
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
 
public class ViewItem extends Activity implements View.OnClickListener {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_item_screen);

        //Getting the index number and the name of the collection being displayed:
        Intent i = getIntent();
        //String collectionName = i.getStringExtra("collectionNameClicked");
        int itemIndexNumber = i.getIntExtra("itemClicked", 0);
        ArrayList<String> arrayOfItems = i.getStringArrayListExtra("arrayOfItems");
                
        //TextView
        TextView itemName = (TextView) findViewById(R.id.itemName);
        TextView itemDate = (TextView) findViewById(R.id.itemDate);
        TextView itemDiscription = (TextView) findViewById(R.id.itemDiscription);
        TextView itemCondition = (TextView) findViewById(R.id.itemCondition);
        TextView itemForSale = (TextView) findViewById(R.id.itemForSale);
        
        //Displaying the name of the collection
        itemName.setText(arrayOfItems.get(itemIndexNumber));
        itemDate.setText(arrayOfItems.get(itemIndexNumber+2));
        itemDiscription.setText(arrayOfItems.get(itemIndexNumber+4));
        itemCondition.setText(arrayOfItems.get(itemIndexNumber+3));
        itemForSale.setText(arrayOfItems.get(itemIndexNumber+5));
        
        //Defining buttons
      	Button removeItemButton = (Button) findViewById (R.id.removeItemButton);
      	Button goHomeButton = (Button) findViewById (R.id.toHomeButton);
      	//Button itemResearchButton = (Button) findViewById (R.id.itemResearchButton); 
      	Button viewImagesButton = (Button) findViewById (R.id.viewImagesButton);
      	
      	//Listen for button click
      	removeItemButton.setOnClickListener(this);
      	goHomeButton.setOnClickListener(this);
      	viewImagesButton.setOnClickListener(this);
    }

    //On button click
	@Override
	public void onClick(View v) {
		switch(v.getId()) {
        case R.id.toHomeButton:
     	   Intent homeScreen = new Intent (getApplicationContext(), HomeScreen.class);
			
     	   //starting new activity - view collections
     	   startActivity(homeScreen);
        break;
//        case R.id.viewImagesButton:
//      	   Intent imagesScreen = new Intent (getApplicationContext(), ViewImages.class);
// 			
//      	   //starting new activity - view collections
//      	   startActivity(imagesScreen);
//         break;
		}
	}

//make this class implement InfoExtractor
/**
 * Method for Information extraction- for this screen extracts info on a specific item
 *
 * @param Item
 * @return void
 * Pre-condition: must have the Item object that was specified on click.
 * Post condition: will populate the information display fields with the info from the Item.
 *
 *TBD: need to find out what identifier for each text/display field are and set them to the appropriate .get
 */
/*

/*
	@Override
	public void extractInfo(Item selectedItem){}
		displayfield1 = selectedItem.getName();
		displayfield2 = selectedItem.getDescription();
		displayfield3 = selectedItem.getDateAdded();
		displayfield4 = selectedItem.getCondition();
		displayfield5 = selectedItem.getForSaleStatus();
*/
}