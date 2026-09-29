package BasicMathCodes;

public class armstrom {
	
		   static boolean isArmstrong(int n) {
		        
		        int count=0;
		        int temp=n;
		        while(temp>0){
		            count++;
		            temp=temp/10;
		        }
		        
		        int sum=0;
		        int x=n;

		        while(x>0){
		            int digit=x%10;
		            int power=(int)Math.pow(digit,count);
		            sum=sum+power;
		            x=x/10;
		        }
		        System.out.println("sum:"+sum);
		        return sum==n;
		    }
		
	public static void main(String[] args) {
		int n=153;
		System.out.println("is armstrom :"+isArmstrong(n));	
	}

}
