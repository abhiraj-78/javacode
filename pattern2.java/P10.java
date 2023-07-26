import java.util.Scanner ;
public class P10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for(int i = 2 ; i<=n ; i+=2){
            
                System.out.println(i);
        }
    }
}
