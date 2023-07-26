import java.util.Scanner ;
class Test{
    public void odd(int x){
        for(int i = 1 ; i <= x ; i++ ){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
class P12 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter number : ");
        int n = sc.nextInt() ;
        Test obj = new Test() ;
        obj.odd(n) ; 
    }
}
