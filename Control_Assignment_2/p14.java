//14. WAP to find lowest number among four different number 
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number :- ");
	int a = sc.nextInt();
	System.out.print("Enter Number :- ");
	int b = sc.nextInt();
	System.out.print("Enter Number :- ");
	int c = sc.nextInt();
	System.out.println("Enter Number :-");
	int d = sc.nextInt();
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("c = "+c);
	System.out.println("d = "+d);
	if(a<b && a<c && a<d)
	System.out.println("a is smallest");
	else if (b<a && b<c && b<d)
	System.out.println("b is smallest");
	else if (c<a && c<b && c<d) 
	System.out.println("c is smallest");
	else 
	System.out.println("d is smallest");
	
	}


}
