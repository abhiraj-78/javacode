//15. WAP to check given year is a leap year or not 
import java.util.Scanner ;

class Test{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter year :");
	int year = sc.nextInt();
	System.out.println("Year :" + year);
	if((year % 4==0 || year % 100 ==0) && year % 400 ==0){
	System.out.println("Leap Year");
	
	}  
	else {
		System.out.println("Not a leap year");
	}
	}


}
