//4. WAP to exchange value to two variable with third variable and without third variable
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a,b ;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	}

}
