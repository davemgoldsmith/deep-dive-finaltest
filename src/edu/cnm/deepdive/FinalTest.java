package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class FinalTest {
	
	
	
private static final String DAT_BUNDLE = "resources/test-input.dat";
	
	
	public static void main(String[] args){
		
		ResourceBundle messageBundle = null;
		
		try {
			messageBundle = ResourceBundle.getBundle(DAT_BUNDLE);
		} catch (MissingResourceException ex){
				System.out.println("Missing Resource - Dat file not found");
					
		}

	}
	

	}
	
	
	
	
	

}







