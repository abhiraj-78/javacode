import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a[] = {1,5,3,2};
    int b[] = {8,4,7,6};
    int c[] = new int [a.length + b.length] ;

    int temp = 0 ;
    for(int i = 0 ; i<a.length ;i++){
        c[i] = a[i] ;
    }
    for(int i =0 ; i<b.length ; i++){
        c[a.length + i] = b[i] ;
    }
    System.out.println("After merging array : ") ;
    for(int i =0 ; i<c.length ; i++){
        System.out.println(c[i]+" ");
    }
    System.out.println("After sorting array : ");
    for(int i = 0 ; i < c.length  ; i++){
        for(int j = i + 1 ; j< c.length ; j++ ){
            if(c[i] > c[j]){
                temp = c[i];
                c[i] = c[j];
                c[j] = temp; 
            }
        }
        System.out.print(c[i]+" ");
    }    
    System.out.println();
    System.out.println("Enter the position");
    int pos=sc.nextInt();
    System.out.print("Element at "+ pos + " position is " + c[pos-1]);
    }
    }
    