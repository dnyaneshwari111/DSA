package Search;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class BinarySearch {

	public static int binarysearch(int []arr,int target) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(target<arr[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr= {2,5,8,12,16,23,38,45,56,67,78};
		int target=5;
		int index =binarysearch(arr,target);
		System.out.print(index + " found");
	}

}
