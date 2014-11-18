package org.algorithms.searching;

/*
 * Simple LinearSearch class
 * 
 */

public class LinearSearch {
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 1, 5, 4, 3, 2, 6 };
		int value = 3;
		
		System.out.println("linearSearch() - searched value is on index: " 
				+ linearSearch.linearSearch(table, value));
		
		System.out.println("betterLinearSearch() - searched value is on index: " 
				+ linearSearch.betterLinearSearch(table, value));
		
		System.out.println("betterLinearSearchWithSentinel() " 
				+ " - searched value is last, index: " 
				+ linearSearch.linearSearchWithSentinel(table, 10));
	}
	
	/*
	 * linearSearch method with arguments of a table, and searched value
	 * if value is -1, element is not inside the table
	 * returns index value 
	 */
	
	public int linearSearch(int[] table, int searchedValue) {
		int result = -1; 
		
		for(int i = 0; i < table.length; i++) {
			if(table[i] == searchedValue) {
				result = i;
			}
		}
		return result;
	}
	
	/*
	 * betterLinearSearch - same working mechanism as linearSearch
	 * but stops loop when value is found and return index value
	 */
	
	public int betterLinearSearch(int[] table, int searchedValue) {
		int result = -1;
		
		for(int i = 0; i < table.length; i++) {
			if(table[i] == searchedValue) {
				result = i;
				return i;
			}
		}
		
		return result;
	}
	
	/*
	 * linearSearchWithSentinel
	 * saves last value of the table int last variable
	 * puts searchValue at last position in the table
	 * increments i until table[i] doesn't equals searchedValue
	 * put last variable on the last index of the table
	 * returns index if i < length of the table or last index of table 
	 * equals searched value
	 * otherwise returns not found
	 */
	
	public int linearSearchWithSentinel(int[] table, int searchedValue) {
		int result = -1;
		int last = table[table.length - 1];
		table[table.length - 1] = searchedValue;
		int i = 0;
		while(table[i] != searchedValue) {
			i++;
		}
		table[table.length - 1] = last;
		if(i < table.length - 1 || table[table.length - 1] == searchedValue) {
			return i;
		} else {
			return result;
		}
		
	}
	
}
