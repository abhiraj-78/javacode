import java.util.Scanner ;

class Test40{
    public void star(int x ){
        int count = 1 ;
        for(int i = 1 ; i <= x ; i++ ){
            for(int j = 1 ; j <= count ; j++){
                    System.out.print("*");
                }
            count = count + i ;
            System.out.println();
        }
    }
}
public class Pattern40 {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int x = sc.nextInt() ;

        Test40 obj = new Test40() ;
        obj.star(x) ;
    } 
}
