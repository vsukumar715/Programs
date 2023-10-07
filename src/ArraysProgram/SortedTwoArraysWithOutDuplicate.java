package ArraysProgram;

import java.util.*;
/* Given two sorted arrays output a merged array without duplicates
  input  : arr1=[1,2,3,6,9] 
  		   arr2=[2,4,5,10]
  output : res =[1,2,3,4,5,6,9,10];		   	
 
 */
public class SortedTwoArraysWithOutDuplicate {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,6,9};
		int arr2[] = {2,4,5,10};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		List<Integer> result = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) 
				result.add(arr1[i++]);
			else if (arr1[i] > arr2[j])
				result.add(arr2[j++]);
			else
			{
				result.add(arr1[i++]);
				j++;
			}
		}
		for(;i<arr1.length;i++) 
			result.add(arr1[i]);
		
		for(;j<arr2.length;j++)
			result.add(arr2[j]);
		
		System.out.println(result);
		
	}
}
