import java.util.Scanner; 
class P2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N natural no. : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}