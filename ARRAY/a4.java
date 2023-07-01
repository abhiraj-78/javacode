import java.util.Scanner;
class array{
public static void main(String arg[]){
//Scanner sc = new Scanner(System.in);
int a[] = {5,2,3,4};
System.out.println("Enter Number : ");
int max=a[0];
int min=a[0];
for(int i=0;i<4;i++){
if(max < a[0]){
max = a[i];
}
if(min > a[0]){
min = a[i];
}
}
System.out.println("maximum is : "+max);
System.out.println("minimum is : "+min);


}
}
