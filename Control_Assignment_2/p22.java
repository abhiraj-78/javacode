//22. Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.Scanner;	
    class Test{
    public static void main(String[] args) {
		int num1 = 5 , num2 = 11;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		if(num%5 ==0 && num%11 ==0)
			System.out.println(num + " Number is divisible by 5 and 11");	
		    
		else 
			System.out.println("Number is Not Divisible by 5 and 11");
    		
    
    }
    }
