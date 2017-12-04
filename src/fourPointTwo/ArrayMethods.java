package fourPointTwo;

import java.util.*;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] array = {1, 2, 6, 70, 59, 32, 65, 80, 99, 87, 56, 1, 1, 1};
		System.out.println("56's index in array: " + indexOf(array, 56));
		System.out.println("2nd 1's index in array: " + indexOf(array, 1, 2));
		System.out.println(Arrays.toString(array));
		replaceAll(array, 1, 10);
		System.out.println(Arrays.toString(array));
		
	}
	
	public static int indexOf(int[] list, int target) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}
		
		return -1; //defaults if target not found
	}
	
	public static int indexOf(int[] list, int target, int occurrence) {
		//same method but with third parameter that specifies which number occurrence you want
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				count++;
				if(count >= occurrence) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void replaceAll(int[] list, int target, int replace) { 
		for (int i = 0; i < list.length; i++ ) {
			if(list[i] == target) {
				list[i] = replace;
			}
		}
		//methods applied on objects 'ignore' scope unlike variables
	}
	
	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true; 
	}
}