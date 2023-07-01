// 20. W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Charachter is : ");
    char ch =sc.next().charAt(0);
    
    if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
    {
      System.out.println("This is alphabet ");
    }
    else
    {
      System.out.println("This is sepical charachter ");
    }
  }
}
