package org.algorithms.searching;

import org.algorithms.Utils;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch binary = new BinarySearch();
		int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int value = 12;
		System.out.println("Binary search:");
		System.out.println(Utils.printTable(table));
		System.out.println("value " + value + ", is at index: " 
				+ binary.binearySearch(table, value));
	}
	
	/*
	 * binary search uses the fact that input table 
	 * is sorted and splits subtables into half
	 * to find desirable value
	 */
	
	public int binearySearch(int[] table, int searchedValue) {
		int result = -1;
		int p = 0;						// lower index
		int r = table.length - 1;		// higher index
		int q = 0;						// current index
		while(p <= r) {
			q = (p + r) / 2;
			
			/*
			 * if value at q index of table is searched value return index value
			 * if value is bigger set right index (r) at current index position lesser by 1
			 * if value is lower set left index (p) at current index position bigger then 1
			 */
			
			if(table[q] == searchedValue) {		
				return q;
			} else if(table[q] > searchedValue) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return result;
	}
}
