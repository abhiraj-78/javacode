/*  Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday */
import java.util.Scanner;

class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter day no. : ");
	int num = sc.nextInt();
	System.out.println("Day no. :- "+ num);		
	if(num == 1)
		System.out.println("Day is :- Monday");
	else if(num == 2)
		System.out.println("Day is :- Tuesday");
	else if(num == 3)
		System.out.println("Day is :- Wednesday");
	else if(num == 4)
		System.out.println("Day is :- Thursday");
	else if(num == 5)
		System.out.println("Day is :- Friday");
	else if(num == 6)
		System.out.println("Day is :- Saturday");	
	else if(num == 7)
		System.out.println("Day is :- Sunday");	
	else
		System.out.println("Not a valid day please enter no. days b/w 1 to 7");
	
	}


}
