import java.util.Scanner ;

class Test30{
    public void star(int x ){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(j <=(x+1)-i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
public class Pattern30 {
    public static void main(String args[]){
        Scanner sc  = new Scanner (System.in) ;
        System.out.println("Enter no. : ");
        int n = sc.nextInt() ;

        Test30 obj = new Test30() ;
        obj.star(n) ;

    }
}
