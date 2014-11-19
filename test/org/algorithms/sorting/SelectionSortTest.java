package org.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {
	private SelectionSort sort;
	private int[] unsortedTable = { 3, 5, 1, 2, 15, 7, 6 };
	private int[] sortedTable = { 1, 2, 3, 5, 6, 7, 15 };
 
	@Before
	public void setUp() throws Exception {
		sort = new SelectionSort();
	}

	@Test
	public void testSelectionSort() {
		assertArrayEquals("selectionSort(unsortedTable) should return true",
				sortedTable, sort.selectionSort(unsortedTable));
	}

}
