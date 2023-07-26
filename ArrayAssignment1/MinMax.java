import java.util.Scanner ; 
class MinMax {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter size of array : ");
        int n = sc.nextInt() ;

        int a [] = new int [n] ; 
        System.out.println("Enter element in "+ n +" array");

        for(int i = 0 ;i < a.length ; i++ ){
            a[i] = sc.nextInt() ; 
        }
        int max = 0 ;
        int min = a[0] ;

        for(int i = 0 ; i < a.length ; i++){
            if(max < a[i]){
                max = a[i] ;
            }
            if(min > a[i]){
                min = a[i];
            }
           
        }
        System.out.println("Maximum Value Is : "+ max);
        System.out.println("Minimum Value Is : "+ min);

        sc.close() ;

    }    
}
