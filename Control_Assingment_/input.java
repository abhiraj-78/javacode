 /*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1 */
import java.util.Scanner;

class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Input : " );
	int num = sc.nextInt();
	System.out.println("Output : " + Math.abs(num));
	}
}


