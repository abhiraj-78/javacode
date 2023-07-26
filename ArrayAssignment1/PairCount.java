import java.util.Scanner ;
public class PairCount {
    public static void main(String args[]){
        int a[] = {1,4,5,3,1,5} ;
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter number to find pair ");
        int n = sc.nextInt() ;
        int sum , count = 0  ;
        for(int i = 0 ; i < a.length ; i++ ){
            sum = 0 ;
            for(int j = 1+i ; j < a.length ; j++){
                sum = a[j] + a[i] ;
                if(sum == n){
                    count++;
                    break ;
                }
            }
        }
        System.out.println("sum pair is : "+count);
        sc.close() ;

    }
}
