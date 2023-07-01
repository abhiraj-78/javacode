import java.util.Scanner;
class array{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array size : ");
int n= sc.nextInt();
int a[] = new int[n];
int sum =0 ;
for(int i=0;i<n;i++){
a[i] = sc.nextInt();
sum = sum + a[i] ;
}
System.out.println(sum ) ;
//for(int i=0 ; i<5 ; i++){

}
}
