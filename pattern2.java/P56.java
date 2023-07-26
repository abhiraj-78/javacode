import java.util.Scanner ;
class P56 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
         System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter last number");
        int b=sc.nextInt();
        System.out.println("The factors between "+a+" and "+b+" are ");      

        for(int i = a ; i <= b ; i++){
            int pow = 1 ;
            for(int j = 1 ; j <= i ; j++){
                pow = pow * j ;
            }
            System.out.println("factorial of "+i+" is "+pow);
        }
    }    
}
