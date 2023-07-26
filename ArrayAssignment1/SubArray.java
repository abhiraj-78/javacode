public class SubArray {
    public static void main(String args[]){
        int a [] = {1,3,7,2,5} ;

        int n = 11; 
        int i,j ;
        int sum ;
        for(i = 0; i < a.length ; i++){
            sum = 0 ;
            for(j = i ; j < a.length ; j++){
                sum = sum + a[j] ;
                if(sum == n){
                    System.out.print("sum b/w " + i + " and " +j +" is "+sum);
                    break;
            }
            }
            System.out.println();
        }
    }
}