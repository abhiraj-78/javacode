import java.util.Scanner;
class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter size of array : ");
        int n = sc.nextInt() ;

        int a [] = new int [n] ; 
        System.out.println("Enter element in "+ n +" array");

        for(int i = 0 ;i < a.length ; i++ ){
            a[i] = sc.nextInt() ; 
        }
        System.out.println("Array is : ");
        for(int i = 0 ;i < a.length ; i++ ){
            System.out.print( a[i] + " " ); 
        }
        System.out.println();
        System.out.println("REvers array is : ");
        for(int i = a.length-1 ;i >= 0 ; i-- ){
            System.out.print( a[i] + " " ); 
         }
         System.out.println();
         sc.close() ;

    }
}
