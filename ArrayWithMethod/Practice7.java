class TestMain{
    public void star(int a){
        
        int rev=0 ,rem ;
        while (a > 0){
        
            rem = a%10 ;
            a = a/10 ;
            rev = rev * 10 + rem ; 
        
        }
        System.out.print(rev);
    }
}
public class Practice7 {
    public static void main(String args[]){
        TestMain obj = new TestMain() ;
        obj.star(123) ;
    }
}
