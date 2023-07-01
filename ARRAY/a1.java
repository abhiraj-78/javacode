//1 wap to define an array of integer of size 6 .Take input from user and display it in reverse
//order
import java.util.Scanner;
class a1{
    public static void main(String arg[]){
        
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
          a[i] = sc.nextInt();            
    }
	for(int i=4;i>=0;i--){

        System.out.println("number :" + a[i]);
    }
  }
}
