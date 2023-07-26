import java.util.Scanner ;
class Test31{
    public void star(int x){
        for(int i = 1; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(j <= (x+1)-i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
public class Pattern31 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. ");
        int x = sc.nextInt() ;
        Test31 obj = new Test31() ;
        obj.star(x) ;

    }
}
