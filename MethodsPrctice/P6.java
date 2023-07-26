import java.util.Scanner; 
class Test{
    public void Factorial( int x ){
        for(int i = 1 ; i <= x ; i++){
            if(x % i == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

    }
}

class P6 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter number : ");
        int n = sc.nextInt() ;
        Test obj = new Test ();
        obj.Factorial(n) ;


    }    
}
