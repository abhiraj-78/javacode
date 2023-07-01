// program to convert lowercase to uppercase
import java.util.Scanner;
class Test{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter in lowercase");
    String lowerCase = sc.nextLine();
    String upperCase = lowerCase.toUpperCase();
    System.out.println("The result is " + upperCase );
    }
}
