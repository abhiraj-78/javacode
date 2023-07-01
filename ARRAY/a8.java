import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int sum=0,pro=1;
        for(int i=0;i<5;i++){
            sum = sum + a[i];
            pro = pro * a[i];
        }
        System.out.println("sum is : " + sum);
        System.out.println("product is : "+ pro);
 
    }
}
