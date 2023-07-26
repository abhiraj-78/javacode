import java.util.Scanner ;
class Test9{
    public void star(int x ){
        int a = 0, b = 1 ,c ;
        for(int i = 1 ; i <= x ; i++){
            System.out.print(a+" ");
            c = a + b ;
            a = b ;
            b = c ;
        }

    }
}
class Practice9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter n no. : ");
        int n = sc.nextInt() ;
        Test9 obj = new Test9() ;
        obj.star(n) ;
    }
}
