public class UnionIntersection {
    public static void main(String args []){
        int a[] = {1,2,3,4,5} ;
        int b[] = {1,2,3} ;

        int c[] = new int [a.length + b.length ];
        int i,j,count = 0 ;
        for(i = 0,j=0 ; i < c.length ; i++){
            if(i < a.length ){
            c[i] = a[i];
            }
            else {
                c[i] = b[j];
                j++ ;
            }
        }
        for(i = 0 ;i < c.length ;i++){
            for(j = 0 ; j < c.length ; j++){
                if(c[i] == c[j]){
                    break ;
                }
            }
            if(i == j){
                count++ ;
            }

        }
        System.out.println("union is "+count);
            int inter = 0 ;
        for(i = 0 ; i < a.length ;i++){
            for( j = 0 ; j < b.length ; j++){
                if(a[i] == b[j]){
                    inter++ ; 
                }
            }
        }
        System.out.println("Inter section is : "+inter);

    }
}
