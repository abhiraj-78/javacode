import java.util.Scanner;
class a9{
    public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
   int a[] = {10,20,15,2,23,90,100} ;
   int i ;
    for(i = 1 ; i < a.length-1 ; i++){
        if( a[i] > a[i+1] && a[i] > a[i-1] )
        System.out.println(a[i]) ;
    }    
    if(a[0] > a[1] ){
       System.out.println(a[0]) ;
    }
    if(a[a.length - 1] > a[a.length - 2]){
        System.out.println(a[a.length-1]);
    }
}
}