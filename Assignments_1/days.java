// program to convert days into month , weeks and day
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter days ");
	int days = sc.nextInt();
	float year = days/365.0f;
	System.out.println("Year : "+ year);
	float month = days/30.0f;	
	System.out.println("Month : "+ month);
	float week = days/ 7.0f;	
	System.out.println("Week : " + week);	
	}


}
