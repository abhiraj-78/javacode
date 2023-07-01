import java.util.Scanner;
class Test{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("fahrenheit is : ");
	double fahrenheit = sc.nextDouble();
	
	double celcius = (fahrenheit-32)*5/9;
	System.out.println(" Celcius is : "+ celcius );
	
	}



}
