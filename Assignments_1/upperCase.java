// program to convert lowercase to uppercase
import java.util.Scanner;
class Test{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter string in uppercase : ");
    String upperCase = sc.nextLine();
    String lowerCase = upperCase.toLowerCase();
    System.out.println("The result is " + lowerCase );
    }
}
