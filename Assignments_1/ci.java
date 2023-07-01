//WAP to find out compound interest
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	double p,r,t,ci;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Principal is :");
	p = sc.nextInt();
	System.out.print("Rate is :");
	r = sc.nextInt();
	System.out.print("Time is :");
	t = sc.nextInt();
	ci = p * (Math.pow((1 + r/100),t)) - p ;
	System.out.println("Compound interest :" +ci);
	
	}


}
