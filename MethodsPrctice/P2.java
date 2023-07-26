import java.util.Scanner ; 

class Natural{
    public void num(int n){
        for(int i = 0 ; i <= n ; i++){
            System.out.println(i);
        }
    }
}

class P2 {
    public static void main(String args[]){

        Scanner sc =  new Scanner(System.in) ;
        System.out.print("Enter number to print N Natural no. :");
        int n = sc.nextInt() ;
        Natural obj = new Natural() ;
        obj.num(n) ;


    }    
}
