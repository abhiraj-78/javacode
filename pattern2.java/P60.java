// 60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner ; 
class P60 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int a = 0 , b = 0;
        for(int i = 1 ; i <= n ; i++ ){
            for ( int j = 1 ; j <= i ; j++)
            a = i * i ;
            b = i * i * i ;
            System.out.println("Square is : "+ i + " is " + a);
            System.out.println("  Qube is : "+ i + " is " + b);
        }
    }    
}
