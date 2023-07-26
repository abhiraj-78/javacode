public class CommonElement {
    public static void main(String args[]){
        int [] a = {1,5,10,20,40,80,70} ;
        int [] b = {6,7,20,80,100,70} ;
        int [] c = {3,4,15,20,30,70,120};
        int i,j,k;
        for( i = 0 ; i < a.length ; i++ ){
            for(j = 0 ; j < b.length ; j++){
                for( k=0 ; k < c.length ; k++){
                    if(a[i] == b[j] && a[i]==c[k]){
                        System.out.println(a[i]);
                    }
                }
            }
        }

    }
}
