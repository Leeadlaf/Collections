package ee433.uab.edu.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class GetString {

	String inputLine;
	
//public class URLReader {
    public static String getString() throws Exception {

        URL test = new URL("http://www.bot.whatismyipaddress.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(test.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
		return "test"; //inputLine;
    }



//    public String toString() {
//    	String result = inputLine;
//    	
//    	
//        return result.toString();
//    }
}