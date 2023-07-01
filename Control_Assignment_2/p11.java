
import java.util.Scanner;
class CheckEvenOdd{

public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");
int num = sc.nextInt(); 



switch(num%2)
		{//this will return 0
case 0: System.out.println(num+" is an Even number");
    break;
case 1: System.out.println(num+" is an Odd number");
	break;
}
}
}
