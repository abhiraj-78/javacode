// 55555
//  4__4
//   3_3
//    22
//     1
// ==================================================
class p53{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int sp=5-i;sp>=1;sp--)
            System.out.print(" ");
        
        for(int j=1;j<=i;j++){
             if(i==j || i==5 || j==1)
            System.out.print(i);
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    }
}