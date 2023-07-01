//18. W.A.P to check whether given number is even or odd Without using % operator. 
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number :- ");
	int num = sc.nextInt();
	System.out.println("number is = "+num);
	
	
	if(num%2 == 0)
	System.out.println("number is even");
	else
	System.out.println("number is odd");
	
	}


}
