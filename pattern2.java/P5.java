import java.util.Scanner ;
public class P5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Print table : ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=10 ;i++){
            System.out.println(i*n);
        }

    }
}
