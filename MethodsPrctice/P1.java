class Pass{

    public void add(int x){
        for(int i = 0 ; i < x ; i++ ){
            System.out.println("hello");
        }
    }

}
public class P1{
    public static void main(String args[]){
        
        Pass obj = new Pass() ;
        obj.add(1000) ;

    }

}