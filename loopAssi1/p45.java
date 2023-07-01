import java.util.Scanner;

class Test{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,rem;
		for(int i=1;n!=0;i++){
			rem = n/10;
			sum = sum+rem;
			n=n/10;
		System.out.println(sum);
		}
	
	}
}
