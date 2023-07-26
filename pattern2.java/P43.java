import java.util.Scanner ;
class P43 {
    public static void main(String args[]){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int binary_number = sc.nextInt() ; 
      
        int unit_digit ,pow = 1 , ans = 0 ;
      
        while(binary_number > 0 ){
      
            unit_digit = binary_number % 10 ;
            ans = ans + (pow * unit_digit);
            binary_number = binary_number / 10 ;
            pow = pow * 2 ;
      
        }
        System.out.println(ans);
    }
}
