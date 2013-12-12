/*
 * File: ViewItem.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/10/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//Clean up and comment code (ongoing)
//TBD - write code / design screen to do view specific item
//
 
import android.os.Bundle;
import android.app.Activity;
//import android.app.ActionBar.LayoutParams;
//import android.content.Intent;
//import android.util.Log;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.widget.Toast;
 
public class ViewItem extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_item_screen);

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