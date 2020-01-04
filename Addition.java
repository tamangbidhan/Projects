import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
	int num1,num2,sum;
	System.out.println("Enter your two number="); 

	Scanner newObj = new Scanner(System.in);
	num1=newObj.nextInt();
	num2=newObj.nextInt();
	sum = num1+num2; 

	System.out.println("The sum of two given number is=" +sum);
	}
}
