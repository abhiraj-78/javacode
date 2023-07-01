/* 21. Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. */ 
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st angle is : ");
    int a1 = sc.nextInt();
    System.out.println("Enter 2nd angle is : ");
    int a2 = sc.nextInt();
    System.out.println("Enter 3rd angle is : ");
    int a3 = sc.nextInt();
    int sum= (a1+a2+a3);
    if(sum==180)
    {
      System.out.println("This is Tringale");
    }
    else
    {
      System.out.println("This is not tringle");
    }
  }
}
