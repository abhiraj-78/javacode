class Test11{
    public void star(){
        for(int i = 65 ; i <= 69 ; i++){
            for(int j = 65 ; j <= i ; j++){
                    System.out.print((char)j);
            }
            System.out.println();
        }
    }

}
public class Pattern11 {
    public static void main(String args[]){
        Test obj = new Test () ;
        obj.star();
    }
}
