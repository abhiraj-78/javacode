class P13{
    public void star(int x){
        for(int i = 1 ; i <= x ;i++){
            for(int j = 1 ; j <= x ;j++){
            if(i>=j){
                if((i+j) % 2 != 0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
        }
        System.out.println();
    }
}
}

public class Pattern13{
    public static void main(String [] args){
        P13 obj = new P13() ;
        obj.star(5) ;
    }
}


