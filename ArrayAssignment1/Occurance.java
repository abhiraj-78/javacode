public class Occurance {
    public static void main(String args[]){
        int [] a = {1,2,3,4,5,5,5,5,5,5,6,2} ;
        int n = 5 , count = 0;
        for(int i = 0 ; i < a.length ; i++ ){
            if(a[i] == n){
                count++;
            } 
        }
        System.out.println(count);
        


    }
}

