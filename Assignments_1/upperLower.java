import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Character : ");
	char ch = sc.next().charAt(0);
	
	String c = (ch>='A' && ch <= 'Z') ? "Upper Case" : "Lower Case" ;
	System.out.println("Character Is : " + c);
	
	}



}

