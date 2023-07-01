/* 16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. */
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	
	double fahrenheit = 35,celcius = 20 ;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter choice : ");
	char ch = sc.next().charAt(0);
	
	if(ch == 'c' || ch == 'C'){
	
	celcius = (fahrenheit-32)*5/9;
	System.out.println(" Celcius is : "+ celcius );
	}
	else if(ch == 'f' || ch == 'F'){
	fahrenheit = (celcius + 32)*9/5 ;
	System.out.println("fahrenheit : "+ fahrenheit);
	
	} 
	}



}
