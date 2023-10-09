package ArraysProgram;
import java.util.*;
/* Given an array with n elements print the number of occurrences of that number each number in that array.
   The order of number doesnt matter. You can reorder the elements.
   Example :
   Sample Input:
   [2,1,3,2,2,5,8,9,8]
	Output:
	2  3																																							
	1  1
	3  1
	5  1
	8  2
	9  1
      
 */
public class CountOccurences {

	public static void main(String[] args) {
		int nums[]= {2,1,3,2,2,5,8,9,8};
	    int n=nums.length;
	    Map<Integer,Integer> countMap=new HashMap<>();
	    for(int i=0;i<n;i++)
	    {
	    	if(!countMap.containsKey(nums[i])) {
	    		countMap.put(nums[i], 0);
	    	}
	    	countMap.put(nums[i], countMap.get(nums[i])+1);
	    }
	    
	    System.out.println(countMap);
	}

}
