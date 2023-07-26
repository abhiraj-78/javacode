import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int sum=0;
    int last=n%10;
    while(n>9){
        int rem=n%10;
        n=n/10;
    }
    int first=n;
    sum=first+last;
    System.out.println("the sum of first and last digit is: "+sum);
    }
}