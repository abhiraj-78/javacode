// public class AlternatePosNeg {
//     public static void main(String arh[]){
//         int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
//         int pos = 0 , neg = 0 ;
//         int i,j,k ;
//         for(i = 0 ; i < arr.length ; i++){
//             if(arr[i] >= 0){
//                 pos++ ;
//             }
//             else{
//                 neg++ ;
//             } 
//         }
//         int [] p = new int [pos] ;
//         int [] n = new int [neg] ;

//         for(i = 0, j = 0, k = 0 ; i < arr.length ; i++){
//             if( arr[i] >= 0){
//                 p[j] = arr[i] ;
//                 j++ ;
//             }
//             else{
//                 n[k] = arr[i] ;
//                 k++ ;
//             }      

//         }
//     //     for(i = 0 ; i < p.length ; i++){
//     //     System.out.println(p[i]);
//     // }
//     // for(i = 0 ; i < n.length ; i++){
//     //     System.out.println(n[i]);
//     // }
//         int a[] = new int[arr.length];
//         for( i = 0,j=0 ;i < a.length ;i+=2){
//             //int temp = p[i] ;
//             a[i] = p[j] ;
        
//             j++;
//         }
//         for(i = 0 ; i < a.length ; i++ ){
//             System.out.println(a[i]);
//         }









//     }
// }
public class AlternatePosNeg {
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