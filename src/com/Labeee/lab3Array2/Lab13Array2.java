package com.Labeee.lab3Array2;

public class Lab13Array2 {
	public static void main(String[] arges) {
		int[][] twoArray = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		Two_array(twoArray);
		showarray3(twoArray);
	}
	public static void Two_array(int[][] array) {
		for(int row=0; row < array.length; row++) {
			for(int coum=0; coum< array[row].length;coum++) {
				System.out.print(array[row][coum]);
			}
			System.out.print("\n");
		}
	}
	public static void showarray3(int[][] array) {
		System.out.println("ข้อ2 ");
		for(int row=0; row < array.length; row++) {
			for(int coum=2; coum< array[row].length;coum++) {
				System.out.print(array[row][coum]);
			}
			System.out.print("\n");
		}
	}
}
