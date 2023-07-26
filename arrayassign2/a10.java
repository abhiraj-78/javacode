import java.util.Scanner;
class a10{
    public static void main(String args[]){
        int a [] = {1,2,3,3,4,5,10};
        int count = 1 ;
        int n = a.length ;
        //System.out.println("Enter element to search : ")
        //int x = sc.nextInt
        for(int i = 0 ; i < a.length  ; i++){
            for(int j = 1 + i ; j < a.length ;j++){
            if( a[i] == a[j]){
                count++;
                } 
            }
        }
        if(count >= n/2)
        System.out.println("True x appears more than n/2 times in the given array)");
        else 
        System.out.println("False x dose not appears more than n/2 times in the given array)");
}
}