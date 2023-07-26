import java.util.Scanner ;

class Test8{
    public void star(int x){
        if(x > 0){
            System.out.println("no. is positive" );
        }
        else{
            System.out.println("no. is negative");
        }
    }
}
class Practice8 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter no. :");
        int x = sc.nextInt() ;
        Test8 obj = new Test8() ;
        obj.star(x) ;
    }
}