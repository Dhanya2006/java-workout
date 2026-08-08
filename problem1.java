package corejava;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.println("enter a name:");
	        String name=in.nextLine();
	        System.out.println("enter a department:");
	        String department= in.nextLine();
	        System.out.println("enter a cgpa:");
	        float cgpa=in.nextFloat();
	        System.out.println("enter a register number:");
	        long register_number=in.nextLong();

	        System.out.println("Name:"+name);
	        System.out.println("department:"+department);
	        System.out.println("cgpa:"+cgpa);
	        System.out.println("register_number"+register_number);
	        in.close();

	}

}
