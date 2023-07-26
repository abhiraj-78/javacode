import java.util.Scanner ;
class P39 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int rem , mod = 0 ,sum , p=n ;
        while( n > 0 ) {
            sum = 1 ;
            rem = n % 10 ;
            n = n / 10 ;
            
            for(int j = 1 ;j <= rem ; j++ ){
                sum = sum * j ;
            }
            mod = mod + sum ;
        }
        if(p == mod )
            System.out.println(p + " no. is strong ");
        else
            System.out.println(p + " is not strong number ");    


        }

    }

