package Decisionmaking;
import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		float a = sc.nextInt();
		System.out.println("enter b number:");
		float b = sc.nextFloat();
		System.out.println("select operator");
		char ch =sc.next().charAt(0);
		/*....switch(ch) {
		case '+':
			System.out.println("sum"+(a+b));
			break;
		case '-':
			System.out.println("sub"+(a-b));
			break;
		case '*':
			System.out.println("multi"+(a*b));
			break;
		case '/':
			System.out.println("div"+(a/b));
			break;
		default:
			System.out.println("inavlid operator");
				
		}*/
	
		if(ch=='+') {
			System.out.println("sum"+(a+b));
		}
		else if(ch=='-') {
			System.out.println("sub"+(a-b));
		}
		else if(ch=='*') {
			System.out.println("multi"+(a*b));
		}
		else if(ch=='/') {
			System.out.println("div"+(a/b));
		}
		else {
			System.out.println("invalid operator");
		}
        
	}

}
