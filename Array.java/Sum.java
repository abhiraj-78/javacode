import java.util.Scanner ; 
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in); 
        System.out.print(" Enter array element : "); 
        int n = sc.nextInt() ; 
        int [] a = new int [n] ;
        int sum = 0 ;
        System.out.println ("Enter Array element : ");
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt() ; 
        }
        for(int i = 0 ; i < a.length ; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum is : " + sum );

    }
}
