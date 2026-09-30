package selectionSort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSorT(int []arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			if(i!=minindex) {
				int temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]=temp;
			
			}
		}
		System.out.println(Arrays.toString(arr));	
	}

	public static void main(String[] args) {
		int []arr= {85,43,958,64,200};
		selectionSorT(arr);
	}

}





