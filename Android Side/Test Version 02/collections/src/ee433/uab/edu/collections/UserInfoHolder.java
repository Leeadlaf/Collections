/**
 * File: UserInfoHolder.java
 * Author: Jeremy Box <jbox91a@uab.edu>
 * Vers: 1.0.0 12/06/2013 jtb - initial code
 * Vers: 1.0.0 12/06/2013 jtb - 
 *
 */

package ee433.uab.edu.collections;

// Q:	Clean up and comment code (ongoing)
// A: 	*			{date issue addressed: 12/dd/13	}
// Q:	Add communication?: gets
// A: 	*			{date issue addressed: 12/dd/13	}
// Q:   IMPORTANT TO STRESS: Does this object have the ability to be volatile/dynamic?
// A:
// Q:	Need to narrow down all the info we need
// A: 	*			{date issue addressed: 12/dd/13	} 

/* which imports are important to this class if any?*/
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
//import ee433.uab.edu.collections.R.id;
//import android.view.View.OnClickListener;
//import android.view.Menu;

public class UserInfoHolder {
		/*Notes: 
		* Get data 2 ways:
		* 1). Using 1 giant getInfo method that uses screen type to decide which to use : 
				pros:	versatility {use only one method throughout program}
				cons:	larger block, harder to unit-test {each call in each screen will call and sort through large amounts of data }
		* 2). Create a specific getInfo method that is specific to each screen {getLoginInfo,getHomeScreenInfo,getAddScreenInfo,getViewInfo....}
				pros: 	easier to unit test, small blocks of code
				cons: 	lots of methods to be coded, have to use right specific call in other classes that need method implementation.
		*/


	static final int HOMESCREEN_NUM=1;
	static final int VIEWCOLLECTIONSCREEN_NUM=2;
	static final int ADDCOLLECTIONSCREEN_NUM=3;
	static final int NETWORKINGSCREEN_NUM=4

	//instance variables: {by screen type: 1)Login, 2)Home, 3)Add}	**is Login and Home needed?
		//General
				int screenType;
				int collectionNumber;
				String collectionName;

		// Login
				private Boolean response;
				private String entry;

		// Home 
				//favorites?

		// Add


		// View My Collections
				
				Collection myCollection[1];	//default to 1 collection



		// Networking
				//



		/* Constructors: Default and User Defined "query"	*/
		//Default Constructor
		public UserInfoHolder(){
			screenType = 0; 



			query = "<blank>";
			response = False; 				


		//User Defined Constructor
		public UserInfoHolder(int screenType, int collectionNum, String collectionName){
			screenType = this.screenType;				
		collectionNum=this.collectionNum;
		collectionName=this.collectionName
	}	

	   /**
        * Method 
     	* @param 
     	* @return 
     	*/
     	private UserInfoHolder Boolean getUserInfo(UserID userID) {
     		screenType = this.screenType;

     		//homescreen info get
     		if(screenType== HOMESCREEN_NUM){


     		}
     		else if(screenType ==VIEWCOLLECTIONSCREEN_NUM){
     			numberOfCollections = this.getNumberOfCollections();

     		}
     		else if(screenType ==ADDCOLLECTIONSCREEN_NUM){


     		}
     		else if(screenType ==NETWORKINGSCREEN_NUM){


     		}
			return UserInfoHolder;
      	}
	}