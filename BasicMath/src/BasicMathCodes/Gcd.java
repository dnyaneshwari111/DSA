package BasicMathCodes;

public class Gcd {

	public static int findGcd(int n1,int n2) {
		int gcd=1;
		int limit=Math.min(n1, n2);
		for(int i=1;i<limit;i++) {
			if(n1%i==0&&n2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		System.out.println("GCD is :"+findGcd(6,8));
	}

}
