//13. Program to perform arithmetic operation using switch case
import java.util.Scanner;

class Test{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number a :");
	int a = sc.newInt();
	System.out.println("Enter number b :");
	int b = sc.newInt();
	System.out.println("Enter Character : ");
	char ch = sc.next().charAt(0);
	
	switch(ch){
	case '+' :System.out.println("Addition is :" (a+b));
			break;
	case '-' :System.out.println("Substraction is :"+ (a-b));
			break;
	case '/' :System.out.println("Division is : "+(a/b));
			break;
	case '*' :System.out.println("Multiple is : "+(a*b);
			break;
	case '%' :System.out.println("Modulo is : " + (a%b));
			break;
	default  : System.out.println("Not a valid Operator");
	
	}
	
	}


}
