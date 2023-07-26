import java.util.Scanner ;
class Test44{
    public void star(int x ){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 0 ; j <= x ; j++){
                if( j >= x+1-i){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

public class Pattern44 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number : ");
        int n = sc.nextInt() ;
        Test44 obj = new Test44() ;
        obj.star(n) ;
    }
}
