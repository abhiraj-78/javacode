public class Max2ndMin {
    public static void main(String args[]){
        int [] a = {1,3,2,4,3,3,4,7,8,7,9,9,9} ;
         int temp = 0 ;
        int i,j ;
       //  System.out.print("After delete duplicate element : ");
        for( i = 0 ; i < a.length ; i++ ){
            for( j = 0 ; j < a.length ; j++ ){
                     if(a[i] == a[j]){
                       break ;  
                    }
                    if(i == j){
                        System.out.print(a[i]+" ");
                    }

            }
        for(i = 0 ; i < a.length ; i++){
            for( j = i+1 ; j < a.length ; j++){
                if(a[i] > a[j]){
                temp = a[i] ;
                a[i] = a[j] ;
                a[j] = temp ;
                }
            }
         

        }
            System.out.println("2nd smallest element  " + a[1]);
            System.out.println("2nd largest element  " + a[a.length - 1 ]);
        
        
    }
}
}