import java.util.Scanner;
class p44 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int dup = n;
    int rem ;
    int digit = 0;
    int count = 0;
    
    while(dup!=0){
        rem =  dup % 10 ;
        count++ ; // count no. 
        dup = dup/10 ;
    }

    int a = n % 10 ; // 4321 % 10 = 1
    n = n / 10 ; // 4321 / 10 = 432
    int d = count - 2 ;
    int divide = 1 ;

    for(int i = 1 ; i<=d ; i++){
        divide = divide * 10 ;
    }

    int c = n % divide ; // 432 % 100 = 32
    int b = n / divide ; // 432 / 100 = 4
    digit = (a * divide + c ) * 10 + b;
    System.out.println(digit);


    }
}