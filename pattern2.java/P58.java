// 58) WAP to convert decimal number into binary number without using array
import java.util.Scanner;
public class P58 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
       // int n = sc.nextInt();
        int decimal_number = sc.nextInt() ; 
      
        int unit_digit ,pow = 1 , ans = 0 ;
      
        while(decimal_number > 0 ){
      
            unit_digit = decimal_number % 2 ;
            ans = ans + (pow * unit_digit);
            decimal_number = decimal_number / 2 ;
            pow = pow * 10 ;
      
        }
        System.out.println(ans);
        
    }
}


