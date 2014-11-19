package org.algorithms.recursion;

import org.algorithms.Utils;
import org.algorithms.searching.BinarySearch;

public class RecurentBinarySearch {
	public static void main(String[] args) {
		RecurentBinarySearch binary = new RecurentBinarySearch();
		int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int value = 12;
		System.out.println("Binary search:");
		System.out.println(Utils.printTable(table));
		System.out.println("value " + value + ", is at index: " 
				+ binary.recurentBinarySearch(table, 0, table.length - 1, value));
	}
	
	/*
	 * recurent binary search uses the fact that input table 
	 * is sorted and splits subtables into half
	 * to find desirable value using recurent factor that p and r values
	 * are always set on the begining and later they are set 
	 * according to output value o q
	 */
	
	public int recurentBinarySearch(int[] table, int p, int r, int searchedValue) {
		if(p > r) {
			return -1;
		} else {
			int q = (p + r) / 2;
			if(table[q] == searchedValue) {
				return q;
			} else if(table[q] > searchedValue) {
				return recurentBinarySearch(table, p, q - 1, searchedValue);
			} else {
				return recurentBinarySearch(table, q + 1, r, searchedValue);
			}
		}
	}
}
