import java.util.Scanner ;
class P1{
    public static void main(String asrg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Star no. to print : ");
        int n = sc.nextInt() ; 
        for(int i = 1 ; i <= n ; i++ ){
            System.out.print("* ");
        }
        System.out.println();
    }
}