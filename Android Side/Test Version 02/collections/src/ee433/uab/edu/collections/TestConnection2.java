/*
 * File: TestConnection2.java
 * Author: Lee Adlaf <adlaf@uab.edu>
 * Vers: 1.0.0 12/13/2013 lwa - initial coding
 * 
 * Credits:  
 */

package ee433.uab.edu.collections;

//TBD - Fix Add Item Link (build add item)
//TBD - Fix Networking Link (build networking)
//TBD - Add code to 'really' log off the user

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

@TargetApi(Build.VERSION_CODES.GINGERBREAD) //222
@SuppressLint("NewApi") //222
public class TestConnection2 extends Activity {

	// Define shared preferences
	//SharedPreferences namePreferences;
	
	String result;
	public static String result2;
	
	@TargetApi(Build.VERSION_CODES.GINGERBREAD) //222
	@SuppressLint("NewApi") //222
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_screen2);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 

		//result = getURLContent("http://www.yahoo.com");
		
		
		try {
			result = getInternetData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result2 = "//the IP address currently being used by my android device";
		
	    TextView connectionResult2 = (TextView) findViewById(R.id.responceText2);
        connectionResult2.setText(result2);
	    
	    TextView connectionResult = (TextView) findViewById(R.id.responceText);
        connectionResult.setText(result);
		
		
	}
	
	public String getInternetData() throws Exception{

        //new TrustAllManager();
        //new TrustAllSSLSocketFactory();

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
	
	
	
	
	
	
		public static String getURLContent(String URL){
	        String Result = "";
	        String IP = "http://localhost/";
	        try {
	            // Create a URL for the desired page
	            URL url = new URL(IP.concat(URL));

	            // Read all the text returned by the server
	            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	            String str;// = null;
	            //result2 = str;
	            
	            //String result2 = Result;
	    	    //TextView connectionResult2 = (TextView) findViewById(R.id.responceText2);
	            //connectionResult2.setText(str);
	            
	            
	            while ((str = in.readLine()) != null) {
	                // str is one line of text; readLine() strips the newline character(s)
	                Result = Result+str+"~";
		            //result2 = str;
		            
	            }
	            
	            //result2 = Result;
	    	    //TextView connectionResult2 = (TextView) findViewById(R.id.responceText2);
	            //connectionResult2.setText(result2);
	            
	            in.close();
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return Result;
	    }
		
		
		
//		URI url;
//		try {
//			url = new URI("http://www.bot.whatismyipaddress.com");
//			HttpClient client = new DefaultHttpClient();
//			HttpGet request = new HttpGet(url);
//			HttpResponse response = client.execute(request);
//
//			
//			
//			
//			
//			String html = "";
//			InputStream in = response.getEntity().getContent();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//			StringBuilder str = new StringBuilder();
//			String line = null;
//			while((line = reader.readLine()) != null)
//			{
//		    str.append(line);
//			}
//			in.close();
//			html = str.toString();	
//			
//		    result2 = in.toString();
//		    //result2 = line;  //null at this point
//		    result = html;
//		    
//
//		    TextView connectionResult2 = (TextView) findViewById(R.id.responceText2);
//	        connectionResult2.setText(result2);
//		    
//		    TextView connectionResult = (TextView) findViewById(R.id.responceText);
//	        connectionResult.setText(result);
//			
//			
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClientProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		
		
		
		
//		try {
//			  URL url = new URL("http://www.bot.whatismyipaddress.com");
//			  //URL url = new URL("http://www.yahoo.com");
//			  HttpURLConnection con = (HttpURLConnection) url
//			    .openConnection();
//			  readStream(con.getInputStream());
//			  } catch (Exception e) {
//			  e.printStackTrace();
//			}




		
		
		//result = "test result";
		
		
		
		
		
//		InputStream source;
//		try {
//			source = new URL("http://www.bot.whatismyipaddress.com/").openStream();
//			String result = new Scanner( source ).useDelimiter("\\A").next();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	
//		try {
//			result = GetString.getString();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		//URL theConnection;
		//theConnection = new URL("www.bot.whatismyipaddress.com?query=value"); 
		
		
		
		
		
//		URL theConnection;
//		theConnection = new URL("www.bot.whatismyipaddress.com?query=value");
//
//        HttpURLConnection urlConnection = (HttpURLConnection) url
//                .openConnection();
//
//        InputStream in = urlConnection.getInputStream();
//
//        InputStreamReader isw = new InputStreamReader(in);
//
//        int data = isw.read();
//        while (data != -1) {
//            char current = (char) data;
//            data = isw.read();
//            System.out.print(current);
//        }
		
		
		
		
//		URLConnection theConnection;
//		theConnection = new URL("www.bot.whatismyipaddress.com?query=value").openConnection(); 
//
//		theConnection.setRequestProperty("Accept-Charset", "UTF-8");
//
//		HttpURLConnection httpConn = (HttpURLConnection) theConnection;
//
//
//		int responseCode = httpConn.getResponseCode();
//		String result = httpConn.getResponseMessage();
//
//		InputStream is = null;
//		if (responseCode >= 400) {
//		    is = httpConn.getErrorStream();
//		} else {
//		    is = httpConn.getInputStream();
//		}
//
//
//		String resp = responseCode + "\n" + result + "\n>" + Util.streamToString(is) + "<\n";
//		//String resp = responseCode + "\n" + result
//		
//		//result = re
		
		
		
		
		//Tying name to text field
		//TextView connectionResult = (TextView) findViewById(R.id.connectionResult);
    
        // Displaying Received data in text field
        //connectionResult.setText(result);
		
		
		
		
		
	//}

	private void readStream(InputStream in) {
		//private void readStream(InputStream in) {
			  BufferedReader reader = null;
			  try {
			    reader = new BufferedReader(new InputStreamReader(in));
			    String result = "";
//			    StringBuffer line = new StringBuffer();
//			    while((result = reader.readLine()) != null){
//			        line.append(result);
//			        System.out.println(line.toString());
//			        line.delete(0,line.length());
//			        
//			        TextView connectionResult = (TextView) findViewById(R.id.connectionResult);
//			        connectionResult.setText(result);				        
//			    }
			    
			    //BufferedReader inn = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			    String urlString = "";
			    String current;
			    while ((current = reader.readLine()) != null) {
			      urlString += current;
			    }
			    System.out.println(urlString);
			    result = urlString;
			    
			    TextView connectionResult = (TextView) findViewById(R.id.connectionResult);
		        connectionResult.setText(result);
			    
			    
//			    while ((result = reader.readLine()) != null) {
//			        //result = "nope";
//			    	System.out.println(result);
//			    	//System.out.println(result);
//					//Tying name to text field
//					TextView connectionResult = (TextView) findViewById(R.id.connectionResult);
//			    
//			        // Displaying Received data in text field
//			        connectionResult.setText(result);
//			    	
//			    }
			  } catch (IOException e) {
			    e.printStackTrace();
			  } finally {
			    if (reader != null) {
			      try {
			        reader.close();
			      } catch (IOException e) {
			        e.printStackTrace();
			        }
			    }
			  }
				//Tying name to text field
				//TextView connectionResult = (TextView) findViewById(R.id.connectionResult);
		    
		        // Displaying Received data in text field
		        //connectionResult.setText(result);
			} // TODO Auto-generated method stub
		
	}
	
//}

//}
		// Get the app's shared preferences
		//namePreferences = PreferenceManager.getDefaultSharedPreferences(this);
		
		// pulling the saved user name out of preferences
		//String savedUserName = namePreferences.getString("userName", "");
		
		//Tying name to text field
		//TextView userName = (TextView) findViewById(R.id.userName);
    
        // Displaying Received data in text field
        //userName.setText(savedUserName);
		
		