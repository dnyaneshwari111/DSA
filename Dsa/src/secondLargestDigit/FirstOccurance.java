package secondLargestDigit;

public class FirstOccurance {

	public static int searchRange(int[]nums,int target)
	{
		int left=0;
		int right=nums.length-1;
		int inx=-1;
		boolean isSearchingleft=false;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			if(target<nums[mid]) {
				right=mid-1;
			}else if(target>nums[mid]){
				left=mid+1;
			}
			else {
				inx=mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int []arr= {1,2,2,2,3,4,5};
	}

}
