import java.util.Scanner ; 
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in); 
        System.out.print(" Enter array element : "); 
        int n = sc.nextInt() ; 
        int [] a = new int [n] ;
        int OddSum = 0 ; 
        int EvenSum = 0 ;
        int Even = 0 ;
        int Odd = 0 ; 
        System.out.println ("Enter Array element : ");
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt() ; 
        }
        for(int i = 0 ; i < a.length ; i++){
          if(a[i] % 2 == 0 ){
            EvenSum = EvenSum + a[i] ;
            Even++ ;
        } 
          else{
            Odd++ ;
            OddSum = OddSum + a[i] ;
          }
        }
        System.out.println("Even element Sum is : " + EvenSum + " & element is "+ Even);
        System.out.println("Odd element Sum is : " + OddSum +  " & element is "+ Odd ); 
}
}
