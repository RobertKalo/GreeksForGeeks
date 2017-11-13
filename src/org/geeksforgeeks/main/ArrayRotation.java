package org.geeksforgeeks.main;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings( "unused" )
public class ArrayRotation {

	final static int	N			= 50;
	final static int	BOUNDARY	= 55;
	static int[]		array;
	static Random		random		= new Random();

	public static void main( String[] args ) {

		makeArray();
		Arrays.sort( array );
		System.out.println( Arrays.toString( array ) );
		leftRotate( 3 );
		System.out.println( Arrays.toString( array ) );
	}

	private static void leftRotate( int d ) {
		int i, j, k, temp;
		int n = array.length;
		for ( i = 0; i < gcd( d, n ); i++ ) {
			/* move i-th values of blocks */
			temp = array[i];
			j = i;
			do {
				k = j + d;
				if ( k >= n )
					k = k - n;
				if ( k == i ) 
					break;
				array[j] = array[k];
				j = k;
			} while ( k != i );
			array[j] = temp;
		}
	}

	private static void rotateArray( int rotateBy ) {

		int i;
		for ( i = 0; i < rotateBy; i++ )
			leftRotatebyOne();
	}

	static void leftRotatebyOne() {
		int i, temp;
		temp = array[0];
		for ( i = 0; i < array.length - 1; i++ ) {
			array[i] = array[i + 1];
		}
		array[i] = temp;
	}

	private static int gcd( int a, int b ) {
		if ( b == 0 )
			return a;
		else
			return gcd( b, a % b );
	}

	private static void makeArray() {

		array = new int[N];
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt( BOUNDARY );
		}

		System.out.println( Arrays.toString( array ) );
	}

}
