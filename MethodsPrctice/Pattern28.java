import java.util.Scanner ;
class P28{
    public void star(int x){
        for(int i = 1 ; i <= (x*2)-1 ; i+=2){
            for(int j = 1 ; j <= (x*2)-1 ; j++){
                if( i >= j){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

public class Pattern28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        P28 obj =new P28() ;
        obj.star(x) ;
    }    
}
