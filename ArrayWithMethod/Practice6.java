import java.util.Scanner ;
class Test6{
    public void star(char x){
        System.out.println((int) (x));
    }
}


class Practice6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter character : ");
        char ch = sc.next().charAt(0) ;
        
        Test6 obj = new Test6() ;
        obj.star(ch) ;
    }
}
