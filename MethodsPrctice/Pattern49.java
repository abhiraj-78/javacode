class Test49{
    public void star(int x ){
        int a = 1 ;
        for(int i = 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(j >= x+1-i){
                    System.out.print(a%2);
                }
                else {
                    System.out.print(" ");
                }
                a++ ;
            }
            System.out.println();
        }
    }
}
public class Pattern49 {
    public static void main(String args[]){
        Test49 obj = new Test49() ;
        obj.star(5) ;
    }
}
