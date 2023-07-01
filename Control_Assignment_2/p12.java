//12. Check given character is vowel or not using switch case 

import java.util.Scanner;

class Test{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Character : ");
	char ch = sc.next().charAt(0);
	
	switch(ch){
	case 'a' :
	case 'e' :
	case 'i' :
	case 'o' :
	case 'A' :
	case 'E' :
	case 'I' :
	case 'O' :
	case 'U' : System.out.println("Character is vowel");
	default  : System.out.println("Character is consonant");
	
	}
	
	}


}
