import java.util.Scanner;
class A13{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
            
        int arr [] = {5,6,3,4,2,7};
        int min = arr[0] ;
        int min_index = 0 ;
        int i ;
        for( i=0 ;i<arr.length ; i++){
            if(min > arr[i]){
                min = arr[i] ;
                min_index = i ;
            }
        }
        System.out.println("The rotated array count in array : "+ min_index);
    
    }
}
    