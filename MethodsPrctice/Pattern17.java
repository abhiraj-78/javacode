class Test17{
    public void star(int x){
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= i ; j++){
                if(i % 2 == 0){
                    System.out.print("#");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern17 {
    public static void main(String args[]){
        Test17 obj = new Test17() ;
        obj.star(5) ;
    }    
}
