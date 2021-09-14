//Adapted from https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/ThreeSum.java

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/******************************************************************************
 *  A program with cubic running time. Reads n integers
 *  and counts the number of triples that sum to exactly 0
 *  (ignoring integer overflow).
 ******************************************************************************/

/**
 *  The {@code ThreeSum} class provides static methods for counting
 *  and printing the number of triples in an arraylist of integers that sum to 0
 *  (ignoring integer overflow).
 *  <p>
 *  This implementation uses a triply nested loop and takes proportional to n^3,
 *  where n is the number of integers.
 *  <p>	
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class ThreeSum {

	// Do not instantiate.
	private ThreeSum() { }

	/**
	 * Prints to standard output the (i, j, k) with {@code i < j < k}
	 * such that {@code a.get(i) + a.get(j) + a.get(k) == 0}.
	 *
	 * @param a the arraylist of integers
	 */
	public static void printAll(ArrayList<Integer> a) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					if (a.get(i) + a.get(j) + a.get(k) == 0) {
						System.out.println(a.get(i) + " " + a.get(j) + " " + a.get(k));
					}
				}
			}
		}
	} 

	/**
	 * Returns the number of triples (i, j, k) with {@code i < j < k}
	 * such that {@code a.get(i) + a.get(j) + a.get(k) == 0}.
	 *
	 * @param  a the arraylist of integers
	 * @return the number of triples (i, j, k) with {@code i < j < k}
	 *         such that {@code a.get(i) + a.get(j) + a.get(k) == 0}
	 */
	public static int count(ArrayList<Integer> a) {
		int n = a.size();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					if (a.get(i) + a.get(j) + a.get(k) == 0) {
						count++;
					}
				}
			}
		}
		return count;
	} 

	/**
	 * Reads in a sequence of integers from a file, specified as a command-line argument;
	 * counts the number of triples sum to exactly zero; prints out the time to perform
	 * the computation.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args)  {
		//make sure that your file is not in the src folder but one level up
		String filename = args[0];
		try {
			Scanner scanner = new Scanner(new File(filename));
			ArrayList<Integer> intList = new ArrayList<Integer>();
			while(scanner.hasNextInt()){
				intList.add(scanner.nextInt());
			}
			Stopwatch timer = new Stopwatch();
			int count = count(intList);
			System.out.println("elapsed time = " + timer.elapsedTime());
			System.out.println(count);
		}
		catch (IOException ioe) {
			throw new IllegalArgumentException("Could not open " + filename, ioe);
		}
	} 
} 

/******************************************************************************
 *  Copyright 2002-2020, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/