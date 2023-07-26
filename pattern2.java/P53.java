import java.util.Scanner ;
class P53 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter last number");
            int b=sc.nextInt();
            System.out.println("The strong number between "+a+" and "+b+" are ");        
            int mod = 0 ;
            int rem = 1 , sum = 1 ;
            for(int i = a ; i <= b ; i++){
                for( int j = i ; j>0 ;j = j/10){ 
                    sum = 1 ;
                    rem = j %10 ;
                    for(int k = 1 ; k<=rem ; k++){
                       sum = sum * k;
                    }
                    mod = mod + sum ;
                   
                }
                if (i == mod ){
                    System.out.println(i + " Is Strong number ");

                }
                mod = 0 ;

    }
}
}