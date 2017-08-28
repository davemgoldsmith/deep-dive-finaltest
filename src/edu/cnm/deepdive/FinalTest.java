package edu.cnm.deepdive;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class FinalTest {

	private static final String DAT_BUNDLE = "resources/test-input.dat";
	private static final String DATA_OUTPUT = "resources/test-output.dat";

	public static void main(String[] args) {

		DataReader dataReader = new DataReader(DAT_BUNDLE);
		Float[][] data = dataReader.list;

		// test to verify input of line
		// System.out.println(Arrays.toString(data[0]));
		
		
		// test variable to fine minimum
		// double minFound;

		// test counter
		// int arrayCounter = 0;

		for (Float[] shuffleLine : data) {
			Collections.shuffle(Arrays.asList(shuffleLine));
			// arrayCounter +=1;
			// Collections.sort(Arrays.asList(shuffleLine));
			// minFound = Collections.min(Arrays.asList(shuffleLine));

			// test to find out minimum of each line
			// System.out.println(minFound);

		} // Enhanced For Loop

		// test to verify shuffled line
		// System.out.println(Arrays.toString(data[0]));

		// test display number of lines in the outer array
		// System.out.println(arrayCounter);

		// Sort collection
		Arrays.asList(data).sort((arr1, arr2) ->

		{
			if ((Collections.min(Arrays.asList(arr1)) < (Collections.min(Arrays.asList(arr2))))) {
				return -1;
			} else if ((Collections.min(Arrays.asList(arr1)) > (Collections.min(Arrays.asList(arr2))))) {
				return 1;
			} else {
				return 0;
			}
		});

		writeShuffled(DATA_OUTPUT, data);
	} //main method
	
	
	
	//method to write to output file
	public static void writeShuffled(String DATA_OUTPUT, Float[][] shuffled) {
		
		//variables to compute average
		float counter = 0.0f;
		float sum = 0.0f;

		try (FileOutputStream stream = new FileOutputStream(DATA_OUTPUT);
				OutputStreamWriter writer = new OutputStreamWriter(stream);
				PrintWriter printer = new PrintWriter(writer);) {
			for (Float[] writeShuffledArray : shuffled) {
				int i = 1;
				
				for (Float number : writeShuffledArray) {
					counter ++;
					sum += number;
					if (i++ == writeShuffledArray.length) {
						printer.printf("%.3f", number);
					} else {
						printer.printf("%.3f|", number);
					} // else
				} // for inner
				printer.println();
			} // for outer
			float average = (sum / counter);			
			printer.print(average);
		} // try
		
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} // catch
		catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} // catch		
		
	} // writeShuffled method

} //FinalTest class
