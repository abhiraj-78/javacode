import java.util.Scanner;

public class P4 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. to find factorial : ");
        int n = sc.nextInt();
        int 
        pow = 1 ; 
        for(int i = n ; i!=0 ; i--){
            pow = pow * i ;
        }
            System.out.println(pow);

    }
}
