import java.util.Scanner ;
class Test10{
    public void star(int a , int b , int c){
        if(a >= 20 && a < b && a < c){
            System.out.println(a + " no. is greater then 20 and smaller then other no.");
        }
        else if(b >= 20 && b < a && b < c ){
            System.out.println(b + " no. is greater then 20 and smaller then other no.");
        }
        else if(c >= 20 && c < b && c < a){
            System.out.println(c + " no . greater then 20 and smaller then other no. " );
        }
        else {
            System.out.println("no no. is found ");
        }

    }
} 
class Practice10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter 1st no. ");
        int a = sc.nextInt() ;
        System.out.println("Enter 2nd no. ");
        int b = sc.nextInt() ;
        System.out.println("Enter 3rd no. ");
        int c = sc.nextInt() ;
        Test10 obj = new Test10 () ;
        obj.star(a,b,c) ;


    }    
}
