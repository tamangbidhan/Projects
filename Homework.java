public class Homework{
	public static void main(String[] args){
	int age = 14;
	System.out.println("You are " +(age*12)+" months old.");
	if(age<14){
	System.out.print("You are still a child.");
	}
	else if(age>=14 && age<=19){
	System.out.println("You are a teenager.");
	}
	else if(age>=20 && age<=65){
	System.out.println("You are an adult.");
	}
	else {
	System.out.println("You are a seinor citizen.");
	} 
	for(int i=0;i<=age;i++){
	System.out.print("*");
	}
	}
}