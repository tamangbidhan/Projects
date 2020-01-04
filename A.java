public class A{
	A(){
	System.out.println(100);	
	}
	A(int i){
	System.out.println(i);
	}
	A(char i){
	System.out.println(i);
	}
	A(int i, int j){
	System.out.println(i);
	System.out.println(j);
	}
public static void main(String[] args){
	A a1 = new A();
	A a2 = new A(1000);
	A a3 = new A('B');
	A a4 = new A(10,20);
}
}
