//17. W.A.P to check the sign of given number. 

import java.util.Scanner;


class Test {
    
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number");
	int num =  sc.nextInt();
	if(num<0){
	    System.out.println("number has negative sign");

	}
	else{
	    System.out.println("number has positive sign");
	}
    }
}
