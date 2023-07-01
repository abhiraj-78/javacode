// 9. WAP to check wheater number is positive or negative
import java.util.Scanner;


class Test {
    
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number");
	int num =  sc.nextInt();
	if(num<0){
	    System.out.println(num + " number is negative");

	}
	else{
	    System.out.println(num + " number is positive ");
	}
    }
}
