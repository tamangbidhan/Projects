import java.util.Scanner;
public class Info{
	public static void main(String[] args){
	Scanner object = new Scanner(System.in);
	System.out.println("Enter you name, gender, birthplace & age=");
	// String value
	String name= object.nextLine();
	String gender= object.nextLine();
	String add = object.nextLine();
	// number value
	int age = object.nextInt();
	System.out.println("Your name= "+nam);
	System.out.println("Your are= "+gen);
	System.out.println("You live in= "+add);
	System.out.println("Your age= "+age);	
	}
}
