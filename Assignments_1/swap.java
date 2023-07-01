// Write a program to swap to number without using 3rd variable.
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st no. : ");
	int a= sc.nextInt();
	System.out.print("Enter 2nd no. : "); 
	int b= sc.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("1st no. ="+ a );
	System.out.println("2nd no. ="+ b );
	}

}
