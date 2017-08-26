package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class FinalTest {
	
	
	
private static final String DAT_BUNDLE = "resources/test-input.dat";
	
	
	public static void main(String[] args){
		
		
		DataReader dataReader = new DataReader(DAT_BUNDLE);
		Float[][] data = dataReader.list;
		Float[][] min;
		
		//test to verify input of line
		System.out.println(Arrays.toString(data[0]));
		
		
		int arrayCounter = 0;
		for ( Float[] shuffleLine: data ) {
			Collections.shuffle(Arrays.asList(shuffleLine));
			arrayCounter +=1;
			
			
			
		}
		//test to verify shuffled line
		System.out.println(Arrays.toString(data[0]));
		//display number of lines in the outer array
		System.out.println(arrayCounter);
		
	
	
					
		}

	}
	

	
	
	
	
	
	









