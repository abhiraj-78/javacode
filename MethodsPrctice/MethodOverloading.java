
class Helper{
    private int a,b ;
    public void multiply(int x ,int y){
        this.a = x ;
        this.b = y ;
        // System.out.println(a*b);
    }
    public void multiply(){
        System.out.println(a/b);
    }

}

public class MethodOverloading {
    public static void main(String args[]){
        Helper obj = new Helper() ;
        obj.multiply(10 , 5); 
//        obj.multiply(30) ;
    }
}
