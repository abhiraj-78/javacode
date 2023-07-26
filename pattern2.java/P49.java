import java.util.Scanner ;
class P49 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter last number");
    int b=sc.nextInt();
    System.out.println("The perfect number between "+a+" and "+b+" are ");

    for(int i = a ; i <= b ; i++){
        int sum = 0 ;
        for(int j = 1 ; j < i ; j++){
            if(i % j == 0 )
                sum = sum + j ;
        }
        if ( i == sum )
            System.out.println(i + " no. is perfect ");
    }

    }    
}
