class Test37{
    public void star(int x ){
        for(int i = 1 ; i<=x ; i++){
            for(int j =1 ; j<=(x+1)-i ; j++){
                    if(i%2 ==0)
                        System.out.print("#");
                    else 
                        System.out.print("*");    
                
            }
            System.out.println();
        }
    }
}
public class Pattern37 {
    public static void main(String args[]){
        Test37 obj = new Test37() ;
        obj.star(6) ;
    }
}
