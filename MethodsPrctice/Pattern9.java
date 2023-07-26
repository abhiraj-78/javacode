class Test1{
    public void star(int x){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(i >=j){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

}
public class Pattern9 {
    public static void main(String args[]){
        Test1 obj = new Test1 () ;
        obj.star(5);
    }
}
