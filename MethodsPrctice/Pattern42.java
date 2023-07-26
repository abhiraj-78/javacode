// 54321
// 5432
// 543
// 54
// 5
//-------------------------------------


import java.util.Scanner ;

class Test42{
    public void star(int x ){
        for(int i = 1 ;i <= x ; i++ ){
            for(int j = 1 ; j <= (x+1)-i ; j++){
                    System.out.print((x+1)-j);
                
            }
            System.out.println();
        }
    }
}
public class Pattern42 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter no. : ");
        int n = sc.nextInt() ;
        Test42 obj = new Test42() ;
        obj.star(n) ;

    }
}
