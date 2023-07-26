import java.util.Scanner ;
class Test2{
    public void m2(int x ){
        
        if(x > 10000){
            x = x + (x*20/100) ; 
            System.out.println("eligeble for bonus of 20% "+x);
        }
        else{
            System.out.println("not eligble for bonus " + x);
        }
       
    }
}

public class Practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter sale of person ");
        int x = sc.nextInt();
        Test2 obj = new Test2() ;
        obj.m2(x) ;
    }    
}
