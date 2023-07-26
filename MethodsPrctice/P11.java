class Test{
    public void odd(int x){
        for(int i = 1 ; i <= x*2 ; i++ ){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
class P11 {
    public static void main(String args[]){
        Test obj = new Test() ;
        obj.odd(5) ; 
    }
}
