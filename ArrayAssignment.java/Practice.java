public class Practice {
    public static void main(String args[]){
        int [][] a = { {8 ,7, 3},
                       {9 ,12,6},
                       {13,15,14}
                    } ;
        int i,j,k ,temp,sum = 0 ,index  = 0 ;
        // for(i = 0 ; i < a.length ;i++){
        //     for(j = 0 ; j < a.length  ; j++){
        //         for(k = j+1 ; k < a.length ; k++){
        //             if(a[i][j] > a[i][k]){
        //                 temp = a[i][j];
        //                 a[i][j] = a[i][k];
        //                 a[i][k] = temp;
        //             }
        //         }  
        //         if(j==0) 
        //         System.out.print(a[i][j]);
        //     }
        //     System.out.println();
        //     }
        //     System.out.println("After Sorting Matrix : ");
        //     for(i = 0 ; i < a.length ;i++){
        //         for(j = 0 ; j < a.length  ; j++){
        //             System.out.print(a[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        //_________________________________________________________________________
                int max = 0 ; 
            for(i = 0 ; i < a.length ; i++){
                sum = 0 ;
                for(j = 0 ; j < a.length ; j++){
                    sum = sum + a[i][j] ;
                }
                //  System.out.println(sum);
                if(max < sum ){
                    index = i ;
                    max = sum ;
                }
            }
            for( j = 0 ; j < a.length ; j++ ){
                System.out.print(a[index][j]+" ");
            }
            System.out.println();
            //_________________________________________________________________
    }
}