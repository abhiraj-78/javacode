import java.util.Scanner ;
class Test19{
    public void star(int x){
        for(int i = 1 ;i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(i==j ||i==x || j == 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter size : " );
        int x = sc.nextInt() ;
        Test19 obj = new Test19() ;
        obj.star(x) ;
    }
}
