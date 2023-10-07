package ArraysProgram;

import java.util.Arrays;

/* Given a sliding window of size k print the maximum of the numbers under the sliding window
 * Example :
 * 		Consider a sliding window of size k equals 3.Let the array be[3,2,7,6,5,1,2,3,4]
 * the output should  print 7 as the first output as first window contains{3,2,7} and second
 * window caontains {2,7,6} and so on
 * 
 * Expected output :
 * 7 7 7 6 5 3 4      
 * 
 */
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int arr[] = {3,2,7,6,5,1,2,3,4};
		int k=3;
		int result[]=new int[arr.length-k+1];
		int index=0;
		for(int i=0;i<=arr.length-k;i++) {
			int max=arr[i];
			for(int j=i;j<k+i;j++)
			{
				if(max<arr[j])
					max=arr[j];
			}
			result[index++]=max;
		}
		System.out.println(Arrays.toString(result));

	}

}
