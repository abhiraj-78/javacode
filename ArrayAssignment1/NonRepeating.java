public class NonRepeating {
    public static void main(String args[]){
       int  arr[] = {-1, 2, -1, 3, 2} ;
       int i,j ;
       for( i = 0 ; i < arr.length ; i++){
            for( j = 0 ; j < arr.length ; j++){
                if(i != j && arr[i] == arr[j]){
                    break ; 
                }
            }
            
        }
    }
}