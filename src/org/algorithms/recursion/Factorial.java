package org.algorithms.recursion;

import org.algorithms.Utils;

public class Factorial {
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println("Factorial of 10 is: " + fact.factorial(10));
		
		int[] table = { 123, 54, 23, 76, 12, 32 };
		System.out.println("Factorial search");
		System.out.println("in table" + Utils.printTable(table));
		System.out.println("value 23 is at index: " + 
				fact.factorialLinearSearch(table, 0, 23));
	}
	
	/*
	 * if argument is 0 returns 1
	 * otherwise multiples argument 
	 * by calling herself with argument - 1
	 */
	
	public int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return (n *= factorial(n - 1));
		}
	}
	
	/*
	 * takes as an argument index value which is incremented 
	 * by 1 using recursion
	 * until index is bigger then size of a table 
	 * or value is found
	 */
	
	public int factorialLinearSearch(int[] table, int index, int searchedValue) {
		if(index > table.length -1) {
			return -1;
		} else if(table[index] == searchedValue) {
			return index;
		} else {
			return factorialLinearSearch(table, index + 1, searchedValue);
		}
	}
}
