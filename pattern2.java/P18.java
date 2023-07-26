public class P18 {
    public static void main(String args[]){
    int a=1 , b=2 ,c =a*b ;
    int n = 5 ;
    while (n > 0){
        System.out.println(a);
        c = a*b ;
        a=b ; 
        b=c ;
        n--;
        }    
    }
}
