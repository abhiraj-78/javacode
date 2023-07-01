//     A
//    A B
//   A B C
//  A B C D
// A B C D E
// ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
// class p59{
//     public static void main(String rg[]){
//         for(int i=1;i<=5;i++){
//             int k=1;
//             for(int j=1;j<=5 ;j++){
//                 if(j>=6-i && j<=4+i){
//                 System.out.print(k+" ");
//                 k++;
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         System.out.println();
//         }

//     }
// }

class p59{
    public static void main(String rg[]){
        for(int i=1;i<=5;i++){
            char k='A';
            for(int j=1;j<=5 ;j++){
                if(j>=6-i && j<=4+i){
                System.out.print("*");
                k++;
                }
                   System.out.print(" ");
                }
            
        System.out.println();
        }

    }
}