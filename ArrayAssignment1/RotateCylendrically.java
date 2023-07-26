public class RotateCylendrically {
public static void main(String args[]){
    int [] a = {1,2,3,4,65,4,65} ;
    int temp = 0 ;
    for(int i = 0 ; i < a.length ; i++){
        temp = a[i] ;
        a[i] = a[a.length-1] ;
        a[a.length - 1] = temp ;
        
        System.out.print(a[i]+" ");
    }System.out.println();
}
}
