package com.demojava;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		String [] arr1 = {"Ram","Shyam","Rahul","Kunal","Akash"};
		String [] arr2 = {"Shagun","Pawan","Vikas"};
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		String [] arr3 = new String[l1+l2];
		
		System.arraycopy(arr1, 0, arr3, 0, l1);
		System.arraycopy(arr2, 0, arr3, l1, l2);
		
		System.out.println(Arrays.toString(arr3));
	}

}
