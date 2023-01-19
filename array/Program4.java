// WAP to test if an array contains a specific value.

package com.practiseprograms.array;

import java.util.Scanner;

public class Program4 {

	public void checkContentHardCode() {
		
		int a[] = {12,34,56,78,91,23,45,67,89};
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i]!=78) {
				continue;
			}
			else if (a[i]==78){
				System.out.println("The array contains the number");
			}
		}
	}
	
	public boolean checkArrayElement(int[] a,int num) {
		
		for(int x:a) {
			if (num == x) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkArrayElementSoftCode() {
		
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter "+size+" elements of array");
		int a[] = new int[size];
		for(int i =0; i<a.length; i++) {
			a[i]= scanner.nextInt();
		}
		System.out.println("Enter the number you want to check if it is present or not");
		int num = scanner.nextInt();
		
		for(int x : a) {
			if(x==num) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Program4 program4 = new Program4();
		program4.checkContentHardCode();
		int[] a = {56,87,66,763,87};
		boolean result = program4.checkArrayElement(a, 65);
		System.out.println(result);
		boolean result1 = program4.checkArrayElementSoftCode();
		System.out.println(result1);
	}
}
