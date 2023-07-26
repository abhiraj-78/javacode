import java.util.Scanner ;
class Test{
    public void Table(int x){
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(i*x);
        }
    }
}

public class P4 {
    public static void main(String arsf[]){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        Test obj = new Test ();
        obj.Table(n);
    }
}
