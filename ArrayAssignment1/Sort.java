import java.util.Scanner;

public class Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter size of array : ");
        int n = sc.nextInt() ;
        int temp = 0 ; 
        int a [] = new int [n] ; 
        System.out.println("Enter element in "+ n +" array");

        for(int i = 0 ;i < a.length ; i++ ){
            a[i] = sc.nextInt() ; 
        }
        for(int i = 0 ;i < a.length ; i++ ){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Sorted array is : ") ;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                if(a[i] > a[j]){
                temp = a[i] ;
                a[i] = a[j] ;
                a[j] = temp ;
                }
            }
            System.out.print(a[i]+" ");
    }
    System.out.println();
    sc.close() ;

}
}