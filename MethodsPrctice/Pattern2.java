import java.util.Scanner ;
class Test{
    public void Star(int x){
        for(int i = 1; i <= x ; i++){
            System.out.println("*"+ " ");     
        }
    }
}

public class Pattern2{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows no. :");
        int n = sc.nextInt() ;
        Test obj = new Test() ;
        obj.Star(n) ;

    }
}
