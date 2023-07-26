import java.util.Scanner;

class Sum{
    public int add(int x){
        int sum = 0 ;
        for(int i=1 ; i<=x ; i++){
            sum = sum + i ;
        }
        return sum;
    }
}
public class P3 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter number : ");
            int n = sc.nextInt() ;
            Sum obj = new Sum() ; 
            int result =  obj.add(n) ;
            System.out.print(result) ;


        }
}
