import java.util.Scanner ;

class Test{
    public char alfa(int x){
        char ch = (char)(x - 32);
        return ch ;
}
}
class P14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0) ;
        Test obj = new Test() ;
        char result = obj.alfa(ch);
        System.out.print(result);
    }    
}
