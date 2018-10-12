package com.JavaDay4.Exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NoteHashMap {
	public static void main(String[] args)
	{
		
		   String checkInput;
	        // Initialize Hash map
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("JOY", "34543");
	        map.put("JACK", "56765");
	        map.put("TINA", "34567");   	   
	        
	        System.out.println("Enter the number that you want to check");
	        Scanner scanIn = new Scanner(System.in);
	        checkInput = scanIn.nextLine();         
	        
	        
	        //Check whether 3443 is here or not
	        	if(map.containsValue(checkInput))
	        		System.out.println(checkInput +"  is present in that table");    
	        	else
	        		System.out.println(checkInput+ "  is not here");
	        	//Jack Number
	        	if(map.containsKey("JACK"))
	        	{
	        		System.out.println("number of JACK is: " + map.get("JACK"));
	        	
	        	}
	        	else 
	        		System.out.println("JACK is not in the table");
	        	
	        	//Tina Phone number
	        	
	        	if(map.containsKey("TINA"))
	        	{
	        		System.out.println("Tina's phone number is: " + map.get("TINA"));
	        	}
	        	else
	        	{
	        		System.out.println("TINA is not in that table");
	        	}
	        	
	        	//Delete JOY's phone number
	        	if(map.containsKey("JOY"))
	        	{
	        		map.replace("JOY", map.get("JOY"), "");
	        	}
	        	else
	        	{
	        		System.out.println("JOY is not in that table");
	        	}
	        	
	        	//Display all rows of table
	        	
	        	Set<String> set = map.keySet();
	            for (String key : set) {
	                System.out.println(key + " " + map.get(key));
	            }     			
	        	
	        	
	        
	   
	  

	}

}
