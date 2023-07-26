public class RotateByOne {
    public static void main(String args []){
        int [] a = {1,2,3,4,5,65} ;
        int temp ; 
        for(int i = 0 ; i < a.length ; i ++  ){
            temp = a[a.length - 1 ];
            a[a.length - 1 ] = a[i] ;
            a[i] = temp ;
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
 