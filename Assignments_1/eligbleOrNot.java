import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Age = ");
	int age = sc.nextInt();
	
	String s = (age > 18) ? " Eligble for vote" : "Not Eligble for vote" ;
	System.out.println(s);
	
	
	
	}


}
