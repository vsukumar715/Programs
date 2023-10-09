package ArraysProgram;

import java.util.Arrays;

public class AlternateSort {
    
	public static void main(String[] args) {
      int nums[]= {5,2,8,7,4,3,9};
      System.out.println("Original array  : "+Arrays.toString(nums));
      alternateSort(nums);
      System.out.println("Alternate array : "+Arrays.toString(nums));
	}
	private static void alternateSort(int nums[]) {
		sort(nums);
		int n=nums.length;
		int result[]=new int[n]; 
		int left=0;
		int right=n-1;
		int index=0;
		while(left<=right) {
			if(index%2!=0) {
				result[index]=nums[left];
				left++;
			}else {
				result[index]=nums[right];
				right--;
			}
			index++;
		}
		System.arraycopy(result, 0, nums, 0, n);
  		
	}
	private static void sort(int nums[]) {
		for(int i=1;i<nums.length;i++)
		{
			int index=i;
			int val=nums[i];
			while(index>0 && nums[index-1]>val)
			{
				nums[index]=nums[index-1];
				index--;
			}	
			nums[index]=val;
		}
	}
	

}
