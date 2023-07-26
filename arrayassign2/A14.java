import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = {1,4,20,3,10,5} ;
        System.out.println("Enter the sum ") ;
        
        boolean result = false ;
        int sum = sc.nextInt();
        for(int i = 0 ; i<a.length ; i++){
        int c_sum = 0 ;
        for(int j = i ; j<a.length ; j++){
            c_sum = c_sum + a[j] ;
         if(c_sum == sum ){   
        System.out.println("Sum found between index "+ i + " and "+ j +" is "+ c_sum)    ;
        result = true ;
        }
        }
        }
        if(result == false ){
            System.out.println("No sub arrayb found for sum "+sum) ;
        }
    }
}
    
