package Decisionmaking;

public class nestedif {

	public static void main(String[] args) {
		int age=12;
		if(age>=18) {
			System.out.println("Adult");
			if(age>=60) {
				System.out.println("Old Age");
			}
			else {
				System.out.println("young Age");
			}
		}
		else {
			System.out.println("minor");
			if(age<=10) {
				System.out.println("child");
			}
		}

	}

}
