class Test14{
    public void star(int x){
        int  k =1 ;
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(i >= j){
                    System.out.print(k++);
                }
            }
            System.out.println();
        }
    }
}
public class Pattern14 {
    public static void main(String args[]){
        Test14 obj = new Test14() ;
        obj.star(4) ;         
    }
}
