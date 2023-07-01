import java.util.Scanner;
class Test{
	public static void main(String args[]){
	
	String Above = "Elligbel_for_vote" ;
	String Below = "Not_elligble_for_vote" ;
	Scanner sc = new Scanner(System.in);
	System.out.print("Age is :");
	int age = sc.nextInt();
	
	String elligbleOrNot = age>18 ? Above : Below ;
	System.out.println(elligbleOrNot); 
	
	}
}
