package Arrays;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Find_duplicate_elements {

	public static void main(String[] args) {
		
		int arr[] =  {45,67,90,77,33,67};
		
		System.out.print("Array is :: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		System.out.print("Duplicate elemenrs are ::");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+",");
				}
			}
		}
	}
}