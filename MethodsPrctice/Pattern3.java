import java.util.Scanner ;
class Test3{
    void star(int x){ 
        for(int i = 1 ; i <= x ; i++ ){
            for (int j = 1 ; j <= x ; j++){
                if(i == j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter star no.");
        int n = sc.nextInt() ;
        Test obj = new Test() ;
        obj.star(n);
        sc.close();
    }
}
