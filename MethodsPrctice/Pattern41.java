import java.util.Scanner;

class Test41{
    public void star(int x){
        char ch = 'A' ;
        for(int i = 1 ; i <= (x*2)-1 ; i+=2){
            for(int j = 1 ; j <= (x*2)-1  ; j++){
                if(j<=i) {
                    System.out.print(ch++);
                }
            }
                System.out.println();
        }
    }
}

public class Pattern41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter no. :");
        int n = sc.nextInt();
        Test41 obj = new Test41();
        obj.star(n) ;
    }
}
