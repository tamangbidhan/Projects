import java.util.Scanner;
public class Division{
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter your number for division= ");
	int num1 = obj.nextInt();
	int num2 = obj.nextInt();
	int sum = num1/num2;
	System.out.println("The division number is= "+sum);	
	}
}
