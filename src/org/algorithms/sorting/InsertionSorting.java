package org.algorithms.sorting;

import org.algorithms.Utils;

public class InsertionSorting {
	public static void main(String[] args) {
		InsertionSorting sort = new InsertionSorting();
		int[] unsortedTable = { 2, 4, 3, 1 };
		
		System.out.println("Sorting by insertation");
		System.out.println("Unsorted table: " + Utils.printTable(unsortedTable));
		System.out.println("Sorted table: " 
				+ Utils.printTable(sort.insertionSorting(unsortedTable)));
	}
	
	/*
	 * Sorting by insertation 
	 * for loop is running thrught table
	 * each value is assigned to key variable
	 * then it starts while loop to check if
	 * items left of each other are lower then
	 * the one on the right 
	 * if so algorithm is pushing them to the right
	 * 
	 */
	
	public int[] insertionSorting(int[] table) {
		for(int i = 1; i < table.length; i++) {
			int key = table[i];
			int j = i - 1;
			while(j > -1 && table[j] > key) {
				table[j + 1] = table[j];
				j--;
			}
			table[j + 1] = key;
		}
		return table;
	}
}
