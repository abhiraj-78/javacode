import java.util.Scanner ;
class calculate{
    float a ;
    public calculate(int r ){
        float a = r * r * 3.14f ;
        this.a = a ;
    }
    public void display(){
        System.out.println("Area of circle is : " + a);
    }
}

class AreaOfRadius{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter radius : ");
        int radius = sc.nextInt() ;
        calculate obj = new calculate(radius) ; 
        obj.display() ;
    } 
}