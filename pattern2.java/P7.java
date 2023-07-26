import java.util.Scanner;
public class P7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        boolean status = true ;
        for(int i=2 ; i<= n/2 ; i++){
            if(n % i == 0 ){
                status = false ;
                break ;
            }
        } 
        if(status )
            System.out.println( n + " number is prime " );
        else
            System.out.println(n + " Number is not prime ");    
    }
}

