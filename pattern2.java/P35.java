class P35 {
    public static void main(String args[]){
        int n = 1234 ;
        int rem ; 
        int count = 0 ;
        System.out.println("digit is : ");
        while(n!=0){
            rem = n%10 ;
            n = n/10 ;
            count++ ;
        }
        System.out.println(count);

    }    
}
