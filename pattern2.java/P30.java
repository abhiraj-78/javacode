class P30 {
    public static void main(String args[]){
        int n = 5 ;
        int t = 0 , sum = 0 , term = 1 ;
        for(int i = 1 ; i<=n ;i++){
            sum = sum * 10 + term ;
            t = t + sum ;
        }
        System.out.print(t + " ");
    }    
}
