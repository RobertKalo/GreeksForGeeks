package org.geeksforgeeks.main;

import java.util.Arrays;

public class SortByFreq {

	public static void main( String[] args ) {

		int[] arr1 = new int[] { 2, 5, 2, 8, 5, 6, 8, 8 };
		int[] arr2 = new int[] { 2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8 };

		int min = arr1[0];
		int max = arr1[0];
		for ( int i = 1; i < arr1.length; i++ ) {
			if ( arr1[i] < min ) {
				min = arr1[i];
			} else if ( arr1[i] > max ) {
				max = arr1[i];
			}
		}

		int[] count = new int[max - min + 1];

		for ( int i = 0; i < arr1.length; i++ ) {
			count[arr1[i] - min] += 1;
		}

		int[][] result = new int[arr1.length][arr2.length];
		int maxFreq = count[0];
		int maxFreqIndex = min;
		for ( int i = 1; i < count.length; i++ ) {
			if ( count[i] > maxFreq ) {
				maxFreq = count[i];
				maxFreqIndex = i + min;
			}
		}

	}
}
