import java.util.Scanner ; 
public class BinarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt() ; 
        int [] a = new int [n];
        System.out.println("Enter array element in asending array : ");
        for(int i = 0 ; i < a.length ; i++ ){
             a[i] = sc.nextInt() ; 
            }
            System.out.print("Array element Are : ");
            for(int i = 0 ; i < a.length ; i++ ){
                System.out.print(a[i]+" ");
               }  

        int l = 0 , u = a.length-1 ;
        int m = 0 ;
        System.out.print("Enter item to find : ");
        int item = sc.nextInt() ;
        while(l <= u){
            m = (l+u)/2 ;
            if(item == a[m]){
                System.out.println(" Array item is found at index " + m + " element is "+ a[m]);
                break ; 
            }
            else if(item > a[m]){
                l = m + 1 ; l = m + 1 ; 
            }
            else if(item < a[m]){
                u = m - 1 ;
            }
        }
    }
}
