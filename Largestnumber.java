package Decisionmaking;
import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a = sc.nextInt();
		System.out.println("enter a second number:");
		int b = sc.nextInt();
		System.out.println("enter a third number:");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(" greatest number:" + a);
		}else if(b>a && b>c) {
			System.out.println(" greatest number: "+ b);
		}
		else {
			System.out.println(" greatest number:"+ c);
		}
	}

}
