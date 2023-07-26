class Test{
    public boolean prime(int n){
        boolean flag = true ;
        for(int i = 2 ; i <= n/2 ; i++ ){
            if(n % i == 0){
                flag = false ;
                break ;
            }
        }
        if(n > 0 && flag ){
            return true ; 
        }
        else {
            return false ;
        }
    }
}

class P7 {
    public static void main(String args[]){
        Test obj = new Test() ;

        for(int i = 2 ; i <= 100 ; i++){
            if(obj.prime(i)){
                System.out.println(i);
            }
        }

    }
}
