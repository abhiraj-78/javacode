public class BubbleSort {
    public static void main(String args[]){
        int [] a = {4,5,6,2,1};
        // int temp = 0;
        int i,j;
        for(i = 0 ; i < a.length ; i++){
            for( j = 0 ; j < a.length-i-1 ; j++){
                if(a[j] > a[j+1]){
                a[j] = a[j] + a[j+1] ;
                a[j+1] = a[j] - a[j+1] ;
                a[j] = a[j] - a[j+1]  ;
                }
            }
        }
        for(int k = 0 ;k < a.length ;k++ ){
            System.out.println(a[k]);
        }
    }
} 