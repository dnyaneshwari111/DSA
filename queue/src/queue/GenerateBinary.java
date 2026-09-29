package queue;
import java.util.*;

public class GenerateBinary {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		Queue<String>q=new ArrayDeque<>();
		q.add("1");
		for(int i=0;i<n;i++) {
			String current=q.remove();
			System.out.println(current +"");
			
			q.add(current +"0");
			q.add(current +"1");
		}
		sc.close();
		
	}

}
