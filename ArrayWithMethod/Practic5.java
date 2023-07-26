import java.util.Scanner ;

class Test5{
    public void m5(int x){
        if(x >= 18 && x <= 100){
            System.out.println("Eligble for voting ");
        }
        else{
            System.out.println("Not eligble for voting ");
        }
    }
}
public class Practic5 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter age : ");
        int n = sc.nextInt() ;
        Test5 obj = new Test5() ;
        obj.m5(n) ;
    }
}
