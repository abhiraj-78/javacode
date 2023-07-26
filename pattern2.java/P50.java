import java.util.Scanner;
class P50 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter last number");
    int b=sc.nextInt();
    System.out.println("The palindrom number between "+a+" and "+b+" are ");

        for (int i = a ; i <= b ; i++){
            int rem, rev = 0 ,temp = i ,n = i ;
            while(n != 0){
                rem = n % 10 ;
                rev = rev * 10 + rem;
                n = n / 10 ;
            }
            if (temp == rev ){
                System.out.println(temp + " is a palindrom no. ");
            }

        }
        

}

}