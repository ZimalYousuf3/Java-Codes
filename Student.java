
public class Student {
	private String name;
	private int age;

	public Student() {
		name = "Zimal" ;
		age =  19 ;
	}
	
	public void display() {
		System.out.println(" Name: " + name);
		System.out.println(" Age: " + age);
	}

	public static void main(String[] args) {
		Student s1 = new Student ();
		s1.display();

	}

}
