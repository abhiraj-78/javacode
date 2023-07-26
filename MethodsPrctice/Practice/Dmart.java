package Practice;
class Mart{
    private int  bill,a,b ;

    public void pen(int x){
        System.out.println(x);
    }
    public void shoes(int y){
        System.out.println(y);
    }
    public void setPen(int y){
        this.b = y ;
    }
    public int  total(int x , int y){
        this.a = x ;
        bill = a+b ;
        return bill ;
    }
}

public class Dmart {
    public static void main(String args[]){
        int p = 10 ;
        int s = 500 ; 

        Mart obj = new Mart() ;
        obj.setPen(700);
        int result = obj.total(p,s) ;
        System.out.println(result);
    }
}
