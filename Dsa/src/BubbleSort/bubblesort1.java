package BubbleSort;

import java.util.Arrays;

public class bubblesort1 {
	public static void bubblesort(int []arr)
	{
		boolean swap=false;
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			swap=false;
			int temp;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println("Swapped index :"+j);
					swap=true;
					
				}
			}
			if(!swap) {
				break;
			}
		}
		System.out.println("full sorted bubble sort : "+Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int []arr= {85,43,958,64,200};
		bubblesort(arr);
		

	}

}
