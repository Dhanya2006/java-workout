package Decisionmaking;
import java.util.Scanner;
public class ProfitorLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		if(num>=1) {
			System.out.println("profit");
		}
			else if(num<0) {
				System.out.println("Loss");
			}
		else {
			System.out.println("no profit or loss");
		}

	}

}
