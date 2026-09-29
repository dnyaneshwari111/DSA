package array;

import java.util.Arrays;

public class Rotate {
	

	public static void Rev(int []arr,int start,int end) {		
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		 System.out.println(Arrays.toString(arr));
	}
		
		
	public static void rotate(int[] nums ,int k)
	{
		int n=nums.length;
		k%=n;
		Rev(nums,0,n-1);
		Rev(nums,0,k-1);
		Rev(nums,k,n-1);
		//System.out.println();
	}	
	public static void main(String[]args) {
		int []arr= {1,2,3,4,5};
		int k=2;
		Rev(arr,0,arr.length-1);
		rotate(arr,k);
	}	
}
