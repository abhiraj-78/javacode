//Q.16 Write a Java program to calculate the average value of array elements.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5} ;
        int average = 0 ;
        int sum = 0 ;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i] ;
            average++;
        }
        System.out.println("Average is :"+sum/average);
    
    }
}
