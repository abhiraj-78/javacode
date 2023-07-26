import java.util.Scanner;

public class P47 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the last number");
    int b=sc.nextInt();
    while (a<=b){
        for(int j = 1 ; j <= 10 ; j++){
            System.out.print(a*j+ " ");
        }
        a++ ;
        System.out.println();
    }

    }
}