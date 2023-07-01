//12. Check given character is vowel or not using switch case 
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Character : ");
	char ch = sc.next().charAt(0); 
	
	String s=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"VOWEL CHARACTER" : "NOT A VOWEL CHARACTER";
	System.out.println(s);
	}

}
