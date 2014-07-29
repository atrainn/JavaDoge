import java.util.*;
import java.net.*;
import java.io.*;

public class getBTC {

	public static String getVal() throws IOException
	{
	    // build a URL
	    String s = "http://blockchain.info/ticker";
	    URL url = new URL(s);
	 
	    // read from the URL
	    Scanner scan = new Scanner(url.openStream());
	    String str = new String();
	    while (scan.hasNext())
	        str += scan.nextLine();
	    scan.close();
	    
	    return str;
	 
}
//Pulls the Raw bitcoin Data from the API
	
	public static String currentVal() throws IOException{
		String cleanedVal;
		String rawVals = getVal();
		String[] splitString = rawVals.split("\\{  \"USD\" \\: \\{\"15m\" \\: ");
		String trimVal = splitString[1];
		
		String[] trimString = trimVal.split(",");
		return trimString[0];
		
	}
}
