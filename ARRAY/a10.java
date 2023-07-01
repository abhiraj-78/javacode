import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a[] = new int[20] ;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
     for(int i=0;i<20;i++){
         a[i] = sc.nextInt();
     }
       for(int i=0;i<20;i++){
            if(a[i] >= 1)
                    System.out.println("number is positive : "+ a[i]);
            if(a[i] < 0)
                    System.out.println("number is negative : " + a[i]);
            if(a[i] % 2 !=0)
                    System.out.println("number is odd :"+a[i]);
            if(a[i] == 0)
                    System.out.println("number is zero :"+a[i]);
            if(a[i] % 2==0)
                    System.out.println("number is Even :"+ a[i]);
      
       }       
    }
}
