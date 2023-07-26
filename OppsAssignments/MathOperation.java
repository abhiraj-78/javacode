import java.util.Scanner ;
class Test2{
    private int x , y , r ;
    public Test2(int x , int y ){
        this.x = x ;
        this.y = y ;
    } 
    public void add(){
        this.r = x + y;
    }
    public void multiply(){
        this.r = x * y ;
    }
    public void power(){
        int pow = 1 ;
        for(int i = 1 ; i <= y ; i++){
            pow = pow * x ;
        }
        this.r = pow ;
    }
    public void display(){
        System.out.println(r);
    }
}
class MathOperation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter two number x & y : ");
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;

        Test2 obj = new Test2(x,y) ;
        //obj.add() ;
        //obj.multiply() ;
        obj.power() ;
        obj.display() ;
        

    }    
}
