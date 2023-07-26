import java.util.Scanner;
public class P57 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int n = sc.nextInt();
        System.out.println("Enter second Number : ");
        int s = sc.nextInt();
        
        System.out.println("prime numbers are : ");
        for(int a = n;a<=s;a++){
        boolean status = true ;
        int k = a;
        for(int i=2 ; i<= k/2 ; i++){
            if(k % i == 0 ){
                status = false ;
                break ;
            }
        } 
        if(status )
            System.out.println(k+" " );
    }
}
}

