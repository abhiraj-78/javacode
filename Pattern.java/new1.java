// class new1{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++)
//                 if(j<=6-i)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             System.out.println();
//         }
//     }
// }

// class new1{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++)
//                 if(j<=6-i)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             System.out.println();
//         }
//     }
// }

class new1{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int j=1;j<=5;j++)
                if(j>=6-i ){
                   
                // if((i==j || j==1 || i==5))
                   System.out.print(ch++);
                //   else 
                //      System.out.print(" ");   
                } 
               else
                System.out.print(" ");
                
            System.out.println();
        }
    }
}