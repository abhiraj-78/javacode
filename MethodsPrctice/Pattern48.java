import java.util.Scanner ;
class Test48{
    public void star(int x){
        for(int i = 1 ; i <= x ; i++){
            char ch = 'A' ;
            for(int j = 1 ; j <= x ; j++){
                if(j >= x+1-i){
                    if(j==x || i==x || j == x+1-i){
                    System.out.print(ch++);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class Pattern48 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter no. : ");
        int n =  sc.nextInt() ;
        Test48 obj = new Test48() ;
        obj.star(n) ;
    }
}
