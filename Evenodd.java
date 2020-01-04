public class Evenodd{
	public static void main(String[] args){
	int value = 20;
	String out, put;
	out = (value%2==0)  ? "Given number is even" : "Given number is odd.";
	System.out.println(" Answer = "+out);
	put =(value%10==0) ? "Given number is mulitple of 10" : "Given number is not multiple of 10.";
	System.out.println("=> "+put);
	}
}

	/*if(value/2==0){
	System.out.println("Given number is even.");
	if(value%10==0){
	System.out.println("Number is also multiple of 10.");
	}
	}
	else if(value/2!=0){
	System.out.println("Given number is odd.");
	if(value%10==0){
	System.out.println("Number is also multiple of 10.");
	}
	*/