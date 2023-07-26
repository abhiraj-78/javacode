import java.util.Scanner ;
class Test24{
    public void star(int x ){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(i >= j){
                    if(i == j || j == 1 || i == x){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("@");
                    }
                }
            }
            System.out.println();
        }
    } 
}

public class Pattern24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        Test24 obj = new Test24();
        obj.star(x) ;

    }
}
