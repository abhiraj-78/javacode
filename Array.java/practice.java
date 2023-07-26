
public class practice {
   // public static void main(String args[]){
   //    int [] arr2 = {5,4,3,2,1};

   //   int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
   //   //arr2[]= arr1[];
   //   for(int i = 0 ; i < arr1.length ; i++ ){
   //      arr2[i] = arr1[i];
   //   }
   //   for(int i = 0 ; i < arr1.length ; i++ ){
   //      System.out.print(arr2[i]);
   //   }
   public static void main(String args[]){
      int [] a = {2,2,2,3,7,8,9,6,9,9,9,9};
      int i,j,temp = 0  ;
      int max = 0 , min = 0 ;
      int max2 = 0 , min2 = 0 ; 
      for( i = 0 ; i < a.length-1  ; i++){
         for( j = i+1 ; j < a.length-1  ; j++){
            if(a[i] > a[j]){
               temp = a[i] ;
               a[i] = a[j] ;
               a[j] = temp ;
            }
         }
         System.out.print(a[i]+" "); 
      }
   System.out.println();
         min = a[0] ; 
         max =a[a.length-1]; 
      boolean minflag = true,maxflag = true ;
      
      for(i = 1 ; i < a.length ; i++){
         if(minflag && a[i] != min ){
            min2 = a[i] ;
            minflag = false ; 
         }
         if(maxflag && a[a.length-i] != max){
            max2 = a[a.length-i] ;
            maxflag = false ; 
         }
         if(maxflag == false && minflag == false){
            break ;
         }
         
      }
   
      System.out.println("minimum value is : "+ min + " 2nd minimum value is : " + min2 );
      System.out.println("maximum value is : "+ max + " 2nd maximum value is "+ max2);
      
   }
      
      
   }

