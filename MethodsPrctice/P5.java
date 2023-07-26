import java.util.Scanner ;
 class Test{
    private int x ;
    public int Add(int x){
        
        int f = 1 ;
        for(int i = 1 ; i <= x ; i++){
            f = f * i ;
        }
        return f ; 
    }
}

 class P5{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number to find factorial : ");
        int n = sc.nextInt() ;
        int factor ;
        Test obj = new Test() ;
        factor = obj.Add(n);

        System.out.println(factor);
sc.close() ;
    }
}
