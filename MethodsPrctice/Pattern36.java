import java.util.Scanner ;
class Test36{
    public void star(int x ){
        for(int i = 1 ; i <= x ; i++){
            char ch = 'A' ;
            for(int j = 1 ; j <= x ; j++){
                if(j <= (x+1)-i ){
                    if(i == 1 || j == 1 || j == (x+1)-i){
                        System.out.print(ch);
                    }
                    else {
                        System.out.print(" ");
                    }
                    ch++ ;
                }
            }
            System.out.println();
        }
    }
}
public class Pattern36 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter no. ");
        int n = sc.nextInt() ;
        Test36 obj = new Test36() ;
        obj.star(n);
    }    
}
