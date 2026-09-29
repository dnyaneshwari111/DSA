package array;

import java.util.Arrays;

public class TransposeArray {

	public static void transpose(int [][]matrix) {
		
		for(int i=0;i<matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		int row=matrix.length;
		int col=matrix[0].length;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<Math.min(row, col);j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
			System.out.println();
			System.out.println(Arrays.toString(matrix[i]));
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		transpose(arr);

	}

}
