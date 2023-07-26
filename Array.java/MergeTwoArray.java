public class MergeTwoArray {
    public static void main(String args[]){
        int [] a1 = {1,3,4,5,6} ;
        int [] a2 = {7,9,8,45,31} ;
        int n = a1.length ;
        int [] a3 = new int [a1.length + a2.length  ] ;

        for(int i = 0 ; i < a3.length ; i++){
            if(i < n)
            a3[i] = a1[i] ;
            else 
            a3[i] = a2[i-n];
        }
        for(int i = 0 ; i < a3.length ; i++){
            System.out.print(a3[i]+" ");
        }
    }
}
