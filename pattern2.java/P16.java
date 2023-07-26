import java.util.Scanner;
public class P16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt() ;    
        for(int i = -n ; i<= n ; i+=3){
                System.out.print(i+" ");
        }
    }
}
