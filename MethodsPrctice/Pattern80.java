import java.util.Scanner;
class Test80{
 Test80(int n){
    int k=0;
    for(int i=1;i<=n;i++){

        if(i<=(n+1)/2){
            k++; 
        }
        else{
            k--;
        }
        for(int j=1;j<=n;j++){
           if(j >= ((n+1)/2)+1-k && j <= ((n+1)/2)-1+k){
             if((i+j)%2==0){
                     System.out.print("*");
                  }
                  else{
                  System.out.print("_");
                  }
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
    }
 }
}
public class Pattern80 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        Test80 obj = new Test80(n);  
    } 
}