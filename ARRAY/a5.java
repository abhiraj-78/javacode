import java.util.Scanner;
import java.lang.ClassNotFoundException ;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[] = new int[5];
        int count = 0 ;
        for(int i=0;i<5;i++){
         a[i]= sc.nextInt();   
        }
        for(int i=0;i<5;i++){
            if(a[i]%2==0){
                System.out.println("no, is Even : "+a[i]);
                count++;
            }
        }
            System.out.println(count+" Even element are found");
    }
}
