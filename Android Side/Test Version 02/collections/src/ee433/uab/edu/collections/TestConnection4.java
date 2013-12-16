/*
 * File: TestConnection4.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/15/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;

@TargetApi(Build.VERSION_CODES.GINGERBREAD) // needed to turn off StrictMode
@SuppressLint("NewApi") // needed to turn off StrictMode
public class TestConnection4 extends Activity implements OnClickListener {

	//Declare Variables
	String resultsTest4;      //from URL
	public static String results2Test4; //notes or more testing
	EditText testInput;
	//private final String USER_AGENT = "Mozilla/5.0";	
	
	@TargetApi(Build.VERSION_CODES.GINGERBREAD) // needed to turn off StrictMode
	@SuppressLint("NewApi") // needed to turn off StrictMode
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_screen4);
		
		//Turn off StrictMode (testing purposes)
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		
//		//Defining buttons
//		Button refreshPageButton = (Button) findViewById (R.id.refreshPageButton);
//		Button postTestButton = (Button) findViewById (R.id.postTestButton);		
//		
//		//Listen for button press
//		refreshPageButton.setOnClickListener(this);
//		postTestButton.setOnClickListener(this);	
//		
//		
//		//Defining text
//		testInput = (EditText) findViewById(R.id.textInput);
		
		
		//Defining results
		try {
			resultsTest4 = getInternetData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Testing:
//		try {
//			results2Test4 = sendPost();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
		
		
		
		
		
		results2Test4 = "//Results of accessing a servlet hosted on Team 2's 2nd server";
		
		//Assign to text location, display text
	    TextView connectionResult2 = (TextView) findViewById(R.id.results2Test4);
        connectionResult2.setText(results2Test4);
	    
		//Assign to text location, display text
	    TextView connectionResult = (TextView) findViewById(R.id.resultsTest4);
        connectionResult.setText(resultsTest4);
	}
	
	
    //If a button is clicked
	public void onClick(View v) {
//		switch(v.getId()) {
//           case R.id.refreshPageButton:
//	       	   Intent testConnection4 = new Intent (getApplicationContext(), TestConnection4.class);
//	   			
//	       	   //refresh page
//	       	   startActivity(testConnection4);
//	       break;
//           case R.id.postTestButton:
//	       	   Intent testConnection5 = new Intent (getApplicationContext(), TestConnection4.class);
//	   			
//
//        	   try {
//				postInternetData(testInput);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        	   
//	       	   //refresh page
//	       	   startActivity(testConnection5);
//        	   //Intent addItemScreen = new Intent (getApplicationContext(), AddItem.class);
//			   //Toast.makeText(getApplicationContext(),
//	           //"Add Item Coming Soon...",
//	           //Toast.LENGTH_LONG).show();
//        	   //starting new activity - add item
//        	   //startActivity(addItemScreen);
//           break;
//		}
	}
	
	
	// HTTP POST request
//	private String sendPost() throws Exception {
//	 
//			String url = "https://selfsolve.apple.com/wcResults.do";
//	 
//			HttpClient client = new DefaultHttpClient();
//			HttpPost post = new HttpPost(url);
//	 
//			// add header
//			post.setHeader("User-Agent", USER_AGENT);
//	 
//			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
//			urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
//			urlParameters.add(new BasicNameValuePair("cn", ""));
//			urlParameters.add(new BasicNameValuePair("locale", ""));
//			urlParameters.add(new BasicNameValuePair("caller", ""));
//			urlParameters.add(new BasicNameValuePair("num", "12345"));
//	 
//			post.setEntity(new UrlEncodedFormEntity(urlParameters));
//	 
//			HttpResponse response = client.execute(post);
//			System.out.println("\nSending 'POST' request to URL : " + url);
//			System.out.println("Post parameters : " + post.getEntity());
//			System.out.println("Response Code : " + 
//	                                    response.getStatusLine().getStatusCode());
//	 
//			BufferedReader rd = new BufferedReader(
//	                        new InputStreamReader(response.getEntity().getContent()));
//	 
//			StringBuffer result = new StringBuffer();
//			String line = "";
//			while ((line = rd.readLine()) != null) {
//				result.append(line);
//			}
//	 
//			//System.out.println(result.toString());
//            //result = result.toString();
//            return result.toString();   
//		}
	
	//Method to post information to servlet
	public void postInternetData(EditText testInput2) throws Exception{
		
		
		
		
		
		
//	     try {
//	         HttpClient client = new DefaultHttpClient();  
//	         String postURL = "http://65.7.224.226:8080/Team2Servlet/CollectionsServlet";
//	         HttpPost post = new HttpPost(postURL);
//	             List<NameValuePair> params = new ArrayList<NameValuePair>();
//	             params.add(new BasicNameValuePair("user", "kris"));
//	             params.add(new BasicNameValuePair("pass", "xyz"));
//	             UrlEncodedFormEntity ent = new UrlEncodedFormEntity(params,HTTP.UTF_8);
//	             post.setEntity(ent);
//	             HttpResponse responsePOST = client.execute(post);  
//	             HttpEntity resEntity = responsePOST.getEntity();  
//	             if (resEntity != null) {    
//	                 Log.i("RESPONSE",EntityUtils.toString(resEntity));
//	             }
//	     } catch (Exception e) {
//	         e.printStackTrace();
//	     }
		
	}
	
	//Method to get information from servlet
	public String getInternetData() throws Exception{

		BufferedReader in = null;
        String data = null;

        try
        {
            HttpClient client = new DefaultHttpClient();
			//Set up currently to access a test servlet on Lee's machine (LWA) 12/15/13
            URI website = new URI("http://65.7.224.226:8080/Team2Servlet/CollectionsServlet");
            HttpGet request = new HttpGet();
            request.setURI(website);
            HttpResponse response = client.execute(request);
            response.getStatusLine().getStatusCode();

            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer sb = new StringBuffer("");
            String l = "";
            String nl = System.getProperty("line.separator");
            while ((l = in.readLine()) !=null){
                sb.append(l + nl);
            }
            in.close();
            data = sb.toString();
            return data;        
        } finally{
            if (in != null){
                try{
                    in.close();
                    return data;
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
	}
}		