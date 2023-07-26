import java.util.Scanner ;
class Test35{
    public void star(int x){
        for(int i =1 ; i<=x ; i++){
            for(int j=1 ; j<=x ; j++){
                if(j<=(x+1)-i){
                    if(i==1  || j==1||j==(x+1)-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
public class Pattern35 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter no. ");
        int n = sc.nextInt() ;
        Test35 obj = new Test35() ;
        obj.star(n) ;
    }
}
