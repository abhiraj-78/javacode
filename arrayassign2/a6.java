import java.util.Scanner;
class a6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
            int n = sc.nextInt();
            int arr[] = new int [n];
        
        System.out.println("Enter (n-1) element : ");
        for(int i = 0;i<n-1;i++){
            arr[i] = sc.nextInt(); 
        }
            int SumOfAll = ( n * (n+1) ) / 2 ;
            int SumOfArray = 0 ;
        
        for(int i = 0 ; i<n-1;i++){
            SumOfArray = SumOfArray + arr[i] ;
        }
            int MissingNumber = SumOfAll - SumOfArray ;
            System.out.println("Missing Number is :"+MissingNumber);
	}
}
