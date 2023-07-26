import java.util.Scanner ;
public class Pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt() ;
        System.out.print("Enter no. of cloumn : ");
        int c = sc.nextInt() ;

        Test obj = new Test() ;
        obj.star(r , c) ;
    }
}

class Test {
    public void star(int r , int c){
        for (int i = 1 ; i <= r ; i++){
            for(int j = 1 ; j <= c ; j++){
                if(i >= j){
                    if(i % 2 != 0){
                        System.out.print("1");
                    }
                    else {
                        System.out.print("0");
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
