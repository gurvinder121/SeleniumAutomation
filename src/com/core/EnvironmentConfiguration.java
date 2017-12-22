package com.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class EnvironmentConfiguration {
	
	private static HashMap<String,String> map=new HashMap<String,String>();
	public static void readfile() throws Throwable {
		File f=new File("./config/config.txt");
		InputStream in=new FileInputStream(f);
		InputStreamReader reader=new InputStreamReader(in);
	    BufferedReader b=	new BufferedReader(reader);
	    String l=b.readLine();
        while(l!=null) {
        	l=b.readLine();
        	if(l!=null) {
        	String [] arr=l.split("=");
        	map.put(arr[0],arr[1]);
        	
        	}
	    
	    }
   }
	
	
	public static String getchromeDriver() {
		
		return map.get("chromedriverpath");
	}
	
	  public static String getGeckoDriver() {
	    	
	    	return map.get("geckodriverpath");
	    }
	
	  public static String getBrowser() {
	    	
	    	return map.get("browser");
	    }
    
    public static String getUrl() {
    	
    	return map.get("utl");
    }
    
    
	

}
