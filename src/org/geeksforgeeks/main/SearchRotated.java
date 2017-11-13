/*An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
 * So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
*/
package org.geeksforgeeks.main;


public class SearchRotated {

	public int searchRotated( int[] array, int key ) {

		int pivot = findPivot( array );
		return findKey( array, pivot, key );
	}

	private int findKey( int[] array, int pivot, int key ) {

		if ( key == array[pivot] ) return pivot;
		int resultLeft = binarySearch( array, 0, pivot, key );
		if ( resultLeft >= 0 ) return resultLeft;
		int resultRight = binarySearch( array, pivot, array.length, key );
		if ( resultRight >= 0 ) return resultRight;
		return -1;
	}

	private int binarySearch( int[] array, int low, int high, int key ) {

		if ( high < low ) return -1;
		int l = low, h = high;
		int mid;
		int midVal;

		while ( l <= h ) {
			mid = l + ( h - l ) >>> 1;
			midVal = array[mid];
			if ( midVal < key )
				l = mid + 1;
			else if ( midVal > key )
				h = mid - 1;
			else {
				return mid;
			}
		}
		return -1;
	}

	private int findPivot( int[] array ) {

		int i = 0;
		while ( array[i] <= array[i + 1] ) {
			i++;
		}
		return i;
	}
}
