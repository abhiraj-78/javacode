import java.util.Scanner;
class array{
		public static void main(String args[]){
		int a[] = new int [5];
		System.out.println("enter number " );
		Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++){
a[i] = sc.nextInt();
}	
System.out.println("enter number to search " );	
int num=sc.nextInt();
boolean e=false;
for(int i=0;i<5;i++){
if(num == a[i]){
	e=true ;
}
}
if(e)
System.out.println(num + " number is exists at : ");
else
System.out.println("number is not exists ");

	}
}
