import java.util.Scanner ;

public class DeleteElement {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
       
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt () ;
        int [] a ={2,4,2,4};

        System.out.println("Enter index to delete : ");
        int delete = sc.nextInt() ;

        int count = 0 ;
        int [] arr = new int [a.length - 1] ;
        System.out.print("After deleting element : ");
        for(int i = 0 ;i < a.length ; i++){
            if(i == delete - 1 )
                continue ;  
            else 
                arr[count++] = a[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}