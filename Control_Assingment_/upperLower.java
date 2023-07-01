 //Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
 import java.util.Scanner ;
 
 class Test{
 	public static void main(String args[]){
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter Character : " );
 	char ch = sc.next().charAt(0); 
 	System.out.println("CHaracyter : " + ch );
 	
 	if(ch >= 'A' && ch<= 'Z')
 	System.out.println("Upper case character :"+ ch);
 	else
 	System.out.println("Lower case character :"+ ch);
 	
 	}
 
 }
