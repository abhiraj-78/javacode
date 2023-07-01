/*24. Write a Java program to count total number of notes in given amount. //24. Write a Java program to count total number of notes in given amount */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter A Amount :");
    int a = sc.nextInt();
    int f,th,h,fi,tw,ten,five,two,one;
    f = a/500;
    a =(a%500);
    
    th= a/200;
    a = (a%200);
   
    h = a/100;
    a = a%100;
    
    fi =a/50;
    a = a%50;
    
    tw =a/20;
    a = a%20;
    
    ten =a/10;
    a = a%10;
    
    five =a/5;
    a = a%5;

    two  = a/2;
    a = a%2;
    one =a/1;
    System.out.println(f+   " = notes of 500");
    System.out.println(th+  " = notes of 200");
    System.out.println(h+   " = notes of 100");
    System.out.println(fi+  " = notes of 50 ");
    System.out.println(tw+  " = notes of 20");
    System.out.println(ten+ " = notes of 10");
    System.out.println(five+" = notes of 5");
    System.out.println(two+ " = notes of 2");
    System.out.println(one+ " = notes of 1");
    
    
    
  }
}

