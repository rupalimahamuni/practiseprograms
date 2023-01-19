// 1 - Write a Java program to create a new array list, add some colors (string) and print out the collection.
// 2 - Write a Java program to iterate through all elements in a array list
package com.practiseprograms.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		list.add("Green");
		list.add("Green");
		list.add("Red");
		
		//System.out.println(list);
		
//		for(String s : list) {
//			System.out.println(s);
//		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object s = itr.next();
			System.out.println(s);
		}
	}
}
