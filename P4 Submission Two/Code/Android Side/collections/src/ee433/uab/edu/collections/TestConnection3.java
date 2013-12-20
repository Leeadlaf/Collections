/*
 * File: TestConnection3.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/14/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;

@TargetApi(Build.VERSION_CODES.GINGERBREAD) // needed to turn off StrictMode
@SuppressLint("NewApi") // needed to turn off StrictMode
public class TestConnection3 extends Activity {

	//Declare Variables
	String result;      //from URL
	String resultNotes; //notes or more testing
	
	@TargetApi(Build.VERSION_CODES.GINGERBREAD) // needed to turn off StrictMode
	@SuppressLint("NewApi") // needed to turn off StrictMode
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_screen3);
		
		//Turn off StrictMode (testing purposes)
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		
		URI url;
		try {
			//Set up currently to access a test servlet on Kuni's machine (LWA) 12/14/13
			url = new URI("http://71.45.66.15:8080/DatabaseConnect/DatabaseAccess");			
			//url = new URI("http://65.7.224.226:8080/Team2Servlet/CollectionsServlet");
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);

			String fromURL = "";
			InputStream in = response.getEntity().getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder str = new StringBuilder();
			String line = null;
			while((line = reader.readLine()) != null)
			{
		    str.append(line);
			}
			in.close();
			fromURL = str.toString();	
			
			//Defining results
			result = fromURL;
			resultNotes = "//Results of accessing a servlet hosted on Team 2's server";

			//Assign to text location, display text
		    TextView connectionResult2 = (TextView) findViewById(R.id.serverResult2);
	        connectionResult2.setText(resultNotes);
		    
	        //Assign to text location, display text
		    TextView connectionResult = (TextView) findViewById(R.id.serverResult);
	        connectionResult.setText(result);
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
		