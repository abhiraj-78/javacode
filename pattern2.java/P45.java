//WAP to find out the sum of all the digits of a number

import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt(); 
    int sum=0;
    while(n!=0){
        int rem=n%10;
        n=n/10;
        sum=sum+rem;
    } 
    System.out.println("The sum of digits are "+sum); 
    }
}