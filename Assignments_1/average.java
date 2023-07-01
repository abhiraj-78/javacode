import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 1st no. : ");
	int num1 = sc.nextInt();
	System.out.print("Enter 2nd no. : ");
	int num2 = sc.nextInt();
	System.out.print("Enter 3rd no. : ");
	int num3 = sc.nextInt();
	System.out.print("Enter 4th no. : ");
	int num4 = sc.nextInt();
	System.out.print("Enter 5th no. : ");
	int num5 = sc.nextInt();
	
	double average = (num1+num2+num3+num4+num5)/5 ;
	System.out.println("Average of 5no. are : "+ average);
	
	}

}
