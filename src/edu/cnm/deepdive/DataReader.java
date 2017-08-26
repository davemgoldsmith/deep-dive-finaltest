package edu.cnm.deepdive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

 public class DataReader {
		
	public Float [][] list;
		
	public DataReader(String file) {
		//File dataReader = new File(file);
		
		try (
									
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
					) {
				LinkedList<Float[]> work = new LinkedList<>();
				String line;
				while ((line = buffer.readLine()) != null){
					if (line.trim().length() > 0) {
						String[] values = line.trim().split("\\s+");
						Float[] FloatValues = new Float[values.length];
						for ( int i = 0; i < values.length; i++){
							FloatValues[i] = Float.parseFloat(values[i]);
						}
						work.add(FloatValues);
					}
				}
				list = work.toArray(new Float [0][]);
				
			} catch (NumberFormatException ex) {
				
			} catch (FileNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}

	}

