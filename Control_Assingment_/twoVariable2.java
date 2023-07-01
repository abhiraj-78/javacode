//AP to exchange value of two variable without using third variable and arithmetic operator
import java.util.Scanner;
class Test{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int a,b ;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	a = a^b;
	b = b^a ;
	a = a^b ;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	}
	


}
