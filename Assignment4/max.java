package Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class max { 
	 public static void main(String[] args)
	    {
	 
	      
	        ArrayList<Integer> myList
	            = new ArrayList<Integer>();
	 
	        
	        myList.add(16);
	        myList.add(26);
	        myList.add(3);
	        myList.add(52);
	        myList.add(70);
	        myList.add(12);
	 
	        
	        System.out.println("Maximum Element in ArrayList = "
	                           + Collections.max(myList));
	    }
	}

