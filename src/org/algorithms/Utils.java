package org.algorithms;

public class Utils {
	public static String printTable(int[] table) {
		String output = "[";
		if(table.length == 0) {
			output += "]";
			return output;
		} else {
			for(int i = 0; i < table.length; i++) {
				output += table[i];
				if(i < table.length - 1) {
					output += ", ";
				}
			}

			output += "]";
			return output; 
		}
	}
	
}
