import java.util.Scanner ;
class Test4{
    public void m4(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println("Vowel");
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println("Vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
}

public class Practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Alfabet : ");
        char ch = sc.next().charAt(0) ;
        
        Test4 obj = new Test4() ;
        obj.m4(ch) ;
    }
}
