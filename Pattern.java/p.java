// class p{
//     public static void main(String args[]){
//             int rem,a=1,b=1,c=11;
//         for(int i=5;i>=1;i--){
//             for(int k=1;k<=i;k++){
//                 System.out.print(" ");
//             }
//             c=b*11;
//             a=b;
//             b=c;
//             //rem = a%10;
//         //for(int j=1;j<=5;j++){
//           //  if(j>=i)
//             System.out.print(a+" ");
//            //else
//          //System.out.print(" ");
        
//         System.out.println();
            
//         }
//     }
// }
import java.util.Scanner;
class p{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=7;

        int k=0;
        for(int i=1;i<=n;i++){
            if(i<=(n/2)+1)
            k++;
            else
            k--;
            for(int j=1;j<=n;j++){
                if(j>=5-k && j<= 3+k){
                    System.out.print("*");
                }  
                else 
                    
                    System.out.print(" ");
            } 
            System.out.println();
        }
    }
}