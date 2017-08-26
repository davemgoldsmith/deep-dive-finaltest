package edu.cnm.deepdive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

 public class DataReader {
	
		
		float [][] data;
		
	public DataReader(String file) {

			try (
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
					) {
				LinkedList<float[]> work = new LinkedList<>();
				String line;
				while ((line = buffer.readLine()) != null){
					if (line.trim().length() > 0) {
						String[] values = line.trim().split("\\s+");
						float[] floatValues = new float[values.length];
						for ( int i = 0; i < values.length; i++){
							floatValues[i] = Float.parseFloat(values[i]);
						}
						work.add(floatValues);
					}
				}
				data = work.toArray(new float [0][]);
				
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

