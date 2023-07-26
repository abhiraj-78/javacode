import java.util.Scanner ;
class P54 {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in) ;
         System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter last number");
        int b=sc.nextInt();
        System.out.println("The even number between "+a+" and "+b+" are ");      

        for(int i = a ; i <= b ; i++){
            if(i%2 == 0)
                System.out.println(i + " is even no. ");
        }
    }
}
