package LoopCondition;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
if(isPrime==true) {
	System.out.println("prime");
}
else {
	System.out.println("not prime");
}
	}

}
