import java.util.Scanner ;
class Test45{
    public void star(int x ){
        for(int i = 1 ; i <= x ; i++ ){
            for(int j = 1 ; j <= x ; j++){
                if(j >= x+1-i){
                    System.out.print(x+1-i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
class Pattern45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number : ");
        int n = sc.nextInt() ;
        Test45 obj = new Test45() ;
        obj.star(n) ;
    }
}