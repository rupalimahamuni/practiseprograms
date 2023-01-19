// WAP to sum values of an array.

package com.practiseprograms.array;

import java.util.Scanner;

public class Program2 {

	public void hardCodedValue() {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			
			sum = sum + a[i];
		}
		System.out.println("The sum of values of array are: "+sum);
	}
	
	public void softCodedValue() {
		
		System.out.println("Enter the size of array:");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int a[] = new int[size];
		int sum = 0;
		System.out.println("Enter the "+size +" elements of array:");
		
		for(int i = 0; i<a.length; i++) {
			
			a[i] = scanner.nextInt();
			sum = sum + a[i];
		}
		
		System.out.println("The sum of values of array are: "+sum);
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		Program2 program2 = new Program2();
		program2.hardCodedValue();
		program2.softCodedValue();
	}
}
