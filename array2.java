import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Size : ");
int n=sc.nextInt();
int size[] = new int[n];

for(int i=0;i<n;i++){
size[i]= sc.nextInt();
}
for(int i=n-1;i>=0;i--){
	System.out.println(size[i]);
}
}
}
