class Test10{
    public void star(int x){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(i >=j){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

}
public class Pattern10 {
    public static void main(String args[]){
        Test obj = new Test () ;
        obj.star(5);
    }
}
