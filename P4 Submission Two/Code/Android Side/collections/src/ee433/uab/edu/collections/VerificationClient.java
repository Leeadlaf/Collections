/**
 * File: VerificationClient.java
 * Author: Jeremy Box <jbox91a@uab.edu>
 * Vers: 1.0.0 12/06/2013 jtb - initial code
 * Vers: 1.0.0 12/06/2013 jtb - created user defined "query" constructor
 *
 */

package ee433.uab.edu.collections;

// Q:	Clean up and comment code (ongoing)
// A: 	*			{date issue addressed: 12/dd/13	}
// Q:	Add communication?: send userID{String}/ recieve response {Boolean or UserInfo object}
// A: 	*			{date issue addressed: 12/dd/13	}
// Q:	Need to look into singleton objects: only one instance of this object should be made {like a clock/timing object}
// A: 	*			{date issue addressed: 12/dd/13	}
// Q:	Check String super method for checking equality: {isEqual()?}
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

public class VerificationClient {

//---Code commented out to make overall program functional (so i can test the rest of the code - LWA)---
//	
//		//instance variables:	
//		private query
//		private Boolean response;
//
//		/* Constructors: Default and User Defined "query"	*/
//		//Default Constructor
//		public VerificationClient(){
//			query = "<blank>";
//			response = False; 				// Mentality behind this: should deny access until it is changed	
//		}
//
//
//		//User Defined "query" Constructor
//		public VerificationClient(String query){
//			query = this.query;
//			response = False; 				// Mentality behind this: should deny access until it is changed	
//		}
//
//
//	   /**
//        * Method for comparing entryID to an existing ID list 
//     	* @param query String
//     	* @return response Boolean (or return UserInfo object containing info from DB?)
//     	*/
//     	public Boolean isValidID(String query) {
//     		idLen = ourDBArrayList.getLength();	 	//**TBD**
//     		query = this.query;
//     		response = False;
//
//     		for(i=0;i<idLen;i++){
//     			data = DB[i];					//get userID in i-th position **TBD***
//     			if(isEqual(data, query)){		//**TBD** check method for String Comparison
//     				response = True;
//     				break;						//break out of for-loop and return response
//     				//return response;			//instead of break, maybe just say return response;?
//     			}	
//     		}
//     		return response;				
//      	}
	}