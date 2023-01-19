// WAP to calculate the average value of array elements.

package com.practiseprograms.array;

import java.util.Scanner;

public class Program3 {

	public void getAverageByHardCode() {
		
		int a[] = {2,3,45,6,78,9,32,55};
		double sum = 0;
		double average;
		for (int i = 0; i<a.length; i++) {
			
			sum = sum + a[i];
		}
		average = sum/a.length;
		System.out.println("Average of elements of array is:"+average);	
	}
	
	public void getAverageBySoftCode() {
		
		System.out.println("Enter the size of array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int a[] = new int[size];
		double sum = 0;
		double avg;
		System.out.println("Enter "+size+" elements of array");
		
		for(int i = 0; i<a.length; i++) {
			a[i] = scanner.nextInt();
			sum = sum + a[i];
		}
		avg = sum/a.length;
		System.out.println("Averageof elements of array is :"+avg);
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		Program3 program3 = new Program3();
		program3.getAverageByHardCode();
		program3.getAverageBySoftCode();
	}
}
