import java.util.Scanner ;
class Test{
    public void rev(int x ){
        for(int i = x ; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}


class P13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt() ;
        Test obj = new Test() ; 
        obj.rev(n) ; 

        sc.close() ;
    }    
}
