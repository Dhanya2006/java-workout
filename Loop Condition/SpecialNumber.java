package LoopCondition;

public class SpecialNumber {

	public static void main(String[] args) {
		int m=15;
		int n=45;
		int result;
		for(int i=m;i<=n;i++) {
		int dig1=i%10;
		int dig2=i/10;
		int sum=dig1+dig2;
		int product=dig1*dig2;
		result=sum+product;
		
    
		if(result==i) {
			System.out.println(i);
		}
	}
	}
}