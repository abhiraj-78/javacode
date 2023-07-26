import java.util.Scanner ;
class Pattern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt() ;
        System.out.print("Enter no. of column : ");
        int c = sc.nextInt() ;

        Test obj = new Test() ;
        obj.star(r,c) ;
    }
}
class Test4{
    public void star(int r ,int c){
        for(int i = 1 ; i <= r ; i++ ){
            for(int j = 1 ; j <= c ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
