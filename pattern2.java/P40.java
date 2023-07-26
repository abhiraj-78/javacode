import java.util.Scanner; 
class P40 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            int rem ;
            int evencount= 0 ,oddcount = 0 ;
            while(n>0){
                rem = n%10 ;
                n = n/10 ;
            
            if(rem % 2 == 0 )    
                    evencount++ ;
            else
                    oddcount++ ;
            }
            System.out.println(evencount);
            System.out.println(oddcount);


        }
    
}
