/*
 * File: ViewCollection.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/06/2013 lwa - initial coding
 * 
 * Credits:
 */

package ee433.uab.edu.collections;

//Clean up and comment code (ongoing)
//
//
 
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

}

	@Override
	public void onClick(View v) {
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