import java.util.Scanner;
class a4{
    public static void main(String args[]){
    
    int [] a = {3,5,6,4,7} ;
    int temp;
    temp = a[a.length-1];
        a[a.length-1] = a[0];
        a[0] = temp ;
    for(int i = 0 ; i<a.length ;i++){
        
        System.out.print(a[i]+" ");
    }
  }
} 