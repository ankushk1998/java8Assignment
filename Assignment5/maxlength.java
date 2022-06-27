package Assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class maxlength {
	  public static void main(String args[]) throws Exception {
		 String a="This is just a sample string";
	      
	      
	      long maxCharacters = a.chars().filter(ch -> ch != ' ').count();

	        System.out.println("There are max " + maxCharacters + " characters in String");
	    }
	}

