import java.util.Scanner ;
public class PairOfsum {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println(" Enter size of array ; ");
        int n = sc.nextInt() ;
      
        int a [] = new int [n] ;
        int sum = 0 ,count = 0;
        System.out.println(" Enter element in array : ");
        for(int i = 0 ;i < a.length ; i++){
            a[i] = sc.nextInt() ;
        }
        System.out.println(" Ente number to search pair in array : ");
        int k = sc.nextInt() ;
        for(int i = 0 ;i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                sum = a[i] + a[j] ;
                if(sum == k ){
                    count++ ;
                }
            }
           
        }
        System.out.println(count);
        sc.close() ;
    }
}
