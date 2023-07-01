// ABCDE
//  A__D
//   A_C
//    AB
//     A
// -----------------------------------------------------    

class p54{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            char a='A';
            for(int sp=5-i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==j || j==1 || i==5)
                System.out.print(a);
                else
                System.out.print(" ");
                a++;
            }
            System.out.println();
        }
    }
}