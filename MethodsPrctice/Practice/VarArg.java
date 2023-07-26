package Practice;

class T1{
    public void m1(int... x){
        for(int i = 0 ; i < x.length ; i++){
            System.out.println(x[i]);
        }
    }
}


public class VarArg {
    public static void main(String args[]){
        T1 obj = new T1() ;
        obj.m1();
    }
}
