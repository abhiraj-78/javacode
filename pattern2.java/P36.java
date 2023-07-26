class P36 {
    public static void main(String args []){
        int n = 2341 ;
        int rem=0 , rev=0;
        while(n!=0){
            rem = n%10 ;
            n = n / 10 ;
            rev = rev * 10 + rem ;
        }
        System.out.println(rev);

    }    
}
