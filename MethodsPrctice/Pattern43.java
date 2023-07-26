import java.util.Scanner ;
class Test43{
    public void star(int x ){
      for(int i = 1 ; i <= x ; i++){
        // char ch = 'A' ;
        for(int j = 1 ; j<= x ; j++){
            if(j >= x+1-i){
                System.out.print((i+j)-x);
            }
            else{
                System.out.print(" ");
            }
        }   
            System.out.println();
    }
}
}

public class Pattern43 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter number : ");
        int n = sc.nextInt() ;
        Test43 obj = new Test43();
        obj.star(n) ;
        sc.close() ;
    }
}
