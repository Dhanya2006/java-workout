package LoopCondition;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Fact=1;
		for(int i = 1;i<=5;i++) {
			Fact=Fact*i;
		}
System.out.println(Fact);
	}

}
