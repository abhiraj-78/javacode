import java.util.Scanner ;

class Test{
    public void fibonacci(int x){
        int a=0,b=1,c;
        for(int i = 1 ; i <= x ; i++){
            System.out.println(a);
            c = a+b ;
            a = b ; 
            b = c ;
        }
    }
}


public class P8 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter number : ");
            int n = sc.nextInt() ;

            Test obj = new Test() ;
            obj.fibonacci(n) ;

        }
}
