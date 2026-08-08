package corejava;

public class problem2 {

	public static void main(String[] args) {
		String name ="dhanya";
		int age = 20;
		double salary = 97500.5876;
	    //System.out.println("name:" + name +"age:" + age);	
		//%n-for the new line
		//basis
		System.out.printf("name:%s, age: %d%n",name,age);
		//formatline with width and precision
		System.out.printf("salary: $%,2f",salary);

	}

}
