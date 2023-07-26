public class MaxMin {
    public static void main(String args[]){
        int [] arr = {2,5,6,1,7,9} ;
        int max = 0 ;
        int min = arr[0] ; 
        for(int i = 0 ; i < arr.length ; i++ ){
            if (max < arr[i]){
                max = arr[i] ;
            }
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Maximum is "+ max);
        System.out.println("Minmum is "+ min);
    }
}
