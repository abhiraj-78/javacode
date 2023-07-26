import java.util.Scanner ;
class Triangle{
    public void star(int x ){
        for(int i= 1 ; i <= x ; i++){
            for(int j = 1 ; j <= x ; j++){
                if(j == 1 || i==j ||i == x ){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
class Pattern20 {
    public static void main(String arhs[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size");
        int x = sc.nextInt() ;
        Triangle obj = new Triangle() ;
        obj.star(x) ;
    }
}
