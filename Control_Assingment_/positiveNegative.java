//9. WAP to check wheater number is positive or negative
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number :- ");
	int num = sc.nextInt();
	System.out.println("number is = "+num);
	
	
	if(num== 0)
	System.out.println("number is zero");
	else if(num >= 1)
	System.out.println("number is positive");
	else if(num < 0)
	System.out.println("number is negative");
	
	}


}

