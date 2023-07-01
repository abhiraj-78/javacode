// 18. W.A.P to check whether given number is even or odd Without using % operator. 
import java.util.Scanner;

class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int a = sc.nextInt();
	
	
	if(a == ((a/2)*2))
		System.out.println("Number is even");
	else 
		System.out.println("Number is odd");	
	}

}
