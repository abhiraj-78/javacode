//7. WAP to find greater among three number
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number :- ");
	int a = sc.nextInt();
	System.out.print("Enter Number :- ");
	int b = sc.nextInt();
	System.out.print("Enter Number :- ");
	int c = sc.nextInt();
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("c = "+c);
	
	if(a>b && a>c)
	System.out.println("a is greater");
	else if (b>a && b>c)
	System.out.println("b is greater");
	else
	System.out.println("c is greater");
	
	}


}
