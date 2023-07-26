import java.util.Scanner ;
class Test9 {
    public void even(int n ){
        for(int i = 1 ; i <= n*2 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }    
    }
}
class P9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter n number : ");
        int n = sc.nextInt();
        Test obj = new Test() ;
        obj.even(n) ;

    }
}
