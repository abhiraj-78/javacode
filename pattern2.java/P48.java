//WAP to find out the factors of all the numbers between two entered numbers

import java.util.Scanner;

public class P48 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter last number");
    int b=sc.nextInt();
    System.out.println("The factors of number between "+a+" and "+b+" are ");
    for(int i = a ; i <= b ; i++){
        System.out.print("Factor of " + i + " is : ");
        for(int j = 1 ; j <= b ; j++){
                if(i % j == 0)
                    System.out.print(j + " ");
        }
        System.out.println();
    }
       
    }
}