import java.util.Scanner ;
class Test{
    public char alfa(int x){
        char ch = (char)(32+x) ;
        return ch ;
    }
}

class P15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        Test obj = new Test() ;
        System.out.println("Enter character : ");
        char ch = sc.nextLine().charAt(0) ;
        char result = obj.alfa(ch) ;
        System.out.println(result);
    }    
}
