// 59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9
import java.util.Scanner ;
class P59 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first Number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter second Number : ");
         //int n = sc.nextInt();
    
        int sum = 0 ;
    for( int i = 100 ; i <= 200 ; i++ ){
        if(i % 9 == 0){
            System.out.println(i + " ");
            sum = sum + i ;
    } 
}
    System.out.println("sum is : " +sum );
    
}
}