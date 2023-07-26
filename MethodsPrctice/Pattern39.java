import java.util.Scanner;
class Test39{
    public void star(int x ){
        for(int i = 1 ; i <= x ; i++ ){
            for(int j =1 ; j <= (x+1)-i ; j++){
                
                    if(i % 2 == 0){
                        System.out.print((x+2) - (i+j));
                    }
                    else{
                        System.out.print(j);
                    }
                }
                System.out.println();
            }
        }
    }

public class Pattern39 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter no. : ");
        int n = sc.nextInt() ;
        Test39 obj = new Test39() ;
        obj.star(n) ;
    }
}
