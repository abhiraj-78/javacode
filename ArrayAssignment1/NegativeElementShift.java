public class NegativeElementShift {
    public static void main(String ats[]){
        int a [] = { 1,-2,8,-4,-5,6} ;
        int  pcount = 0,ncount = 0  ;
        int i,j,k ;
        for ( i = 0 ; i < a.length ; i++ ){
                if(a[i] > 0){
                    pcount++ ;
                }
                else {
                    ncount++ ;
                } 
        }
        int p [] = new int[pcount] ;
        int n [] = new int[ncount] ;

        for( i = 0 ,j=0,k=0 ;i<a.length ;i++){
            if(a[i] >= 0){
                p[j] = a[i] ;
                j++ ;
            }
            else{
                n[k] = a[i];
                k++ ;
            }
        }
        for( i = 0 ,j=0 ;i<a.length ;i++){
            if(i < p.length){
                a[i] = p[i] ;
            }
            else{
                a[i] = n[j] ;
                j++ ;
            }
            System.out.print(a[i]+" ");
        }
       

        }
    }