public class Duplicate {
    public static void main(String args[]){
        
        int [] arr = {1,3,2,4,3,3,4,7,8,7,9,9,9} ;
         int i,j,count = 0 ;

        System.out.println("After delete duplicate element : ");
        for( i = 0 ; i < arr.length ; i++ ){
            for( j = 0 ; j < arr.length ; j++ ){
                     if(arr[i] == arr[j]){
                       break ;  
                      }
            }
           if(i == j){
                count++ ;
           }
           System.out.println(count);   
    }
   }
  }

    

