package org.algorithms.sorting;

import org.algorithms.Utils;

public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] unsortedTable = { 3, 5, 1, 2, 15, 7, 6 };
		
		System.out.println("Selection sort");
		System.out.println("unsorted table: " + Utils.printTable(unsortedTable));
		System.out.println("sorted table: " + Utils.printTable(sort.selectionSort(unsortedTable)));
	}

	/*
	 * Slection sort works similar to linear search 
	 * but theres a second loop inside to check if 
	 * value is lower then value from first loop
	 * if it is lower then it swamps those two values
	 */
	
	public int[] selectionSort(int[] table) {
		int[] sortedTable = table;
		for(int i = 0; i < sortedTable.length; i++) {
			int min = i;
			for(int j = i + 1; j < sortedTable.length; j++) {
				if(sortedTable[j] < sortedTable[min]) {
					min = j;
				}
			}
			int x = sortedTable[i];
			sortedTable[i] = sortedTable[min];
			sortedTable[min] = x;
			
		}
		return sortedTable;
	}
}
