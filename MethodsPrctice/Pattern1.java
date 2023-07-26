import java.util.Scanner ;


class Test {
    public void star(int x){
        for(int i = 1 ; i <= x ; i++){
            System.out.print(" * ");
        } 
        System.out.println();
    }
    public void star(int x ,int y ){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= y ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        } 
    }
}

class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ") ;
        int n = sc.nextInt() ;
        System.out.print("Enter no. of columns : ") ;
        int b = sc.nextInt() ;
        Test obj = new Test() ;
        // obj.star(n) ;
        obj.star(n,b) ;


    }    
}
