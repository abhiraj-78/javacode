/*A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 */

import java.util.Scanner;
class Test{
	public static void main(String argsp[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 4 Digit no. : ");
	int num = sc.nextInt();
	int rem,rev=0;
	
	rem = num % 10 ;
	num = num /10 ;
	rev = rev * 10 + rem;
	
	rem = num % 10 ;
	num = num /10 ;
	rev = rev * 10 + rem;
	
	rem = num % 10 ;
	num = num /10 ;
	rev = rev * 10 + rem;
	
	rev = rev * 10 + num; 
	
	System.out.println("Reverse number is : " + rev);
	}

}

