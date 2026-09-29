package Demo;

import java.util.Arrays;

public class InsertionSort {
	static String InsertionSortDemo(int []deck){
		int n=deck.length;
		
	
		for(int cardIndex=1;cardIndex<n;cardIndex++) {
			int cardToPlace=deck[cardIndex];
			int position=cardIndex-1;
				
			while(position >=0 && deck[position]>cardToPlace)
			{
				deck[position+1]=deck[position];
				position--;
				
			}
			deck[position+1]=cardToPlace;
		
	}
		return Arrays.toString(deck);
	}
	

	public static void main(String[] args) {
	int []deck= {2,1,10,40,38};
	System.out.println("Sorted array "+InsertionSortDemo(deck));
	}

}
