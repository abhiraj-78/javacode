import java.util.Scanner ; 
class P52 {
        public static void main(String args []){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter last number");
            int b=sc.nextInt();
            System.out.println("The armstrong number between "+a+" and "+b+" are ");
            
            for(int i = a ; i <= b ; i++){
                int rem , arm , sum = 0 ; 
                int  n = i ;
                while(n != 0){
                    rem = n % 10 ;
                    n = n / 10 ;
                    arm = rem * rem * rem ;
                    sum = sum + arm ;
                }
                if( i == sum )
                System.out.println(i + " number is armstrong number ");
                else
                System.out.println(i +  " no. is not armstrong");
            }
    }
}
