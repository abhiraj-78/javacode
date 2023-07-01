//Program to calculate simple interest

import java.util.Scanner;
class Test{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Principal : ");
	float principal = sc.nextFloat();
	System.out.println("Rate : ");
	float rate = sc.nextFloat();
	System.out.println("Time : ");
	float time = sc.nextFloat();
	
	float simple_interest = (principal * rate * time) / 100.0f;
	System.out.println("Simple Interest : " + simple_interest); 
	 
	}
}
