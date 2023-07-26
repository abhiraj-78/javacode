import java.util.Scanner ; 
class SpecificPOsition{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        int [] a = {4,6,3,1,8,7} ;
        
        int pos = sc.nextInt() ;
        int x =  sc.nextInt() ;

        int [] arr = new int [a.length + 1] ;
        
        for (int i = 0 ; i < arr.length ; i++){
            if(i < pos-1 )
                arr[i] = a[i] ;
            else if(i == pos-1)
                arr[i] = x ;
            else 
                arr[i] = a[i-1];         
        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}