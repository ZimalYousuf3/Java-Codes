import java.util.Scanner;

public class Input_Class {
	public String name;
	public int age;
	
	public Input_Class() {
		this.name = name;
		this.age = age;
	}
	
	public static void main (String [] agrs) {
		Scanner sc = new Scanner (System.in) ;
		
		System.out.print(" Enter your name: ");
		String name = sc.nextLine() ;
		
		System.out.print(" Enter your age: ");
		int age = sc.nextInt();
	}

}
