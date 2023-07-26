import java.util.Scanner ;
public class P8 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int a=0 , b=1 ,c=a+b ;
        for(int i = 1 ; i<=n+1 ; i++){
            System.out.println(a);
            c=a+b ; 
            a=b ;
            b=c ;
        }
    }
}
