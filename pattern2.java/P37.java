 import java.util.Scanner ;
 class P37 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int rem , rev = 0 , c = n ;
            while(n != 0 ){
                rem = n % 10  ;
                n = n/10 ;
                rev = rev * 10 + rem ;
            }       
            if(c == rev)
                System.out.println(c + " num is palindrom ");
            else
                System.out.println(c + " number is not a palindrome no.");    
    }    
}
