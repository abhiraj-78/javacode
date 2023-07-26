import java.util.Scanner ;
class P38 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
       int n = sc.nextInt();
       int rem ,arm , sum = 0 , c = n;
           while(n != 0 ){
               rem = n % 10  ;
               n = n/10 ;
               arm = rem*rem*rem ;
               sum = sum + arm ;
           }       
           if(c == sum)
               System.out.println(c + " num is armstrong ");
           else
               System.out.println(c + " number is not a armstrong no.");    
   }    
}
