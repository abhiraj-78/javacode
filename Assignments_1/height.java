//Program to convert person height from inches to cm
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Height in Inches = ");
	float inch = sc.nextFloat();
	
	float cm = inch * 2.54f ;
	System.out.println("Height in Cm : " + cm );
	}


}
