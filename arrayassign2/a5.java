
// import java.util.Scanner;
// class a5{
//     public static void main(String args[]){
//         int [] a = {4,5,6};
//         int [] b = {4,5,6};
//         boolean result = false ;
//         if(a.length == b.length){
//             for(int i=0;i<a.length;i++){
//                 if(a[i]==b[i])    
//                     result = true ;
//             }
//         }
//         else{
//             result = false ;
//         }
//         if(result == true){
//             System.out.println("Arrays are equal ");
//         }
//         else{
//             System.out.println("Array are not equal");
//         }
        
    
//   }
// } 
//-------------------------------------------------------------

import java.util.Scanner;
class a5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size : ");
        int n = sc.nextInt();
        System.out.println("Enter second array size : ");
        int m = sc.nextInt();
        
        int [] a = new int [n];     
        int [] b = new int [m];
        
        System.out.println("Enter first array element :");
        for(int i=0 ; i<a.length;i++){
         a[i] = sc.nextInt();   
        }
        System.out.println("Enter second array element :");
        for(int i=0 ; i<b.length;i++){
         b[i] = sc.nextInt();   
        }
        boolean result = false ;
        if(a.length == b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]==b[i])    
                    result = true ;
            }
        }
        else{
            result = false ;
        }
        if(result == true){
            System.out.println("Arrays are equal ");
        }
        else{
            System.out.println("Array are not equal");
        }
  }
} 