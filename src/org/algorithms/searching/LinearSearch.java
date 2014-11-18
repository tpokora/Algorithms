package org.algorithms.searching;

import org.algorithms.Utils;

/*
 * Simple LinearSearch class
 * 
 */

public class LinearSearch {
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 1, 5, 4, 3, 2, 6 };
		int value = 3;
		
		System.out.println("Linear searches in table: " + Utils.printTable(table));
		
		System.out.println("Linear search - searched value " + value + " is on index: " 
				+ linearSearch.linearSearch(table, value));
		
		value = 4;
		System.out.println("Better linear search - searched value " + value 
				+ " is on index: " + linearSearch.betterLinearSearch(table, value));
		
		value = 2;
		System.out.println("better linear search with sentinel " 
				+ "searched value " + value + " is on index: " 
				+ linearSearch.linearSearchWithSentinel(table, value));
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
