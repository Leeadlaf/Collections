/*
 * File: TestConnection2.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.1 12/13/2013 lwa - cleanup
 * Vers: 1.0.0 12/13/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.http.HttpResponse;
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
public class TestConnection2 extends Activity {

	//Declare Variables
	String result;      //from URL
	public static String resultNotes; //notes or more testing
	
	@TargetApi(Build.VERSION_CODES.GINGERBREAD) // needed to turn off StrictMode
	@SuppressLint("NewApi") // needed to turn off StrictMode
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_screen2);
		
		//Turn off StrictMode (testing purposes)
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		
		//Defining results
		try {
			result = getInternetData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultNotes = "//the IP address currently being used by my android device";
		
		//Assign to text location, display text
	    TextView connectionResult2 = (TextView) findViewById(R.id.responceText2);
        connectionResult2.setText(resultNotes);
	    
		//Assign to text location, display text
	    TextView connectionResult = (TextView) findViewById(R.id.responceText);
        connectionResult.setText(result);
	}
	
	//Method to get information from URL
	public String getInternetData() throws Exception{

		BufferedReader in = null;
        String data = null;

        try
        {
            HttpClient client = new DefaultHttpClient();
            URI website = new URI("http://bot.whatismyipaddress.com");
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