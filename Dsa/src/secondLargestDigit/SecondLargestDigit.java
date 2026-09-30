package secondLargestDigit;

public class SecondLargestDigit {//1234
		
		public static int SecondLargestNum(int n) 
		{
		int firstlarge=-1;
		int secondlarge=-1;
		
		int digit=0;
		while(n>0) 
		{
			digit=n%10;
			if(digit>firstlarge) 
			{
				secondlarge=firstlarge;
				firstlarge=digit;
			}
			else if(digit >secondlarge && digit !=firstlarge) 
			{
				secondlarge=digit;
			}
			
			n=n/10;
		}
		return secondlarge;
	}
		public static void main(String[] args) 
		{
			int num=123;
			System.out.println("number :"+num);
			System.out.println("second large element :" +SecondLargestDigit.SecondLargestNum(num));
		}
		
	}


