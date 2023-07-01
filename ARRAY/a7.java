import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,6,3,8,4};
        // for(int i=0;i<5;i++){
        //     a[i] = sc.nextInt();
        // }
        System.out.println("Enter no. to search");
        int n= sc.nextInt();
        for(int i=0;i<5;i++){
         if(n== a[i])
            System.out.println(n + "is in array at "+i);
        else 
            System.out.println("is not in array");
        }
    }
}
