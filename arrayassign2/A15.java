import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = {3,5,8,10,10} ;
    int temp = 0 ;    
        for(int i = 0 ; i<a.length ; i++){
            for(int j = i+1 ; j<a.length ; j++ ){
                if(a[i] > a[j]){
                temp = a[i] ;
                a[i] = a[j];
                a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        if(a[a.length-1] == a[a.length - 2 ]){
        System.out.println("largest element is : " + a[a.length - 2]);
        System.out.println("Second largest element is : " + a[a.length - 3]);
        }
        else{
        System.out.println("largest element is : " + a[a.length - 1]);
        System.out.println("Second largest element is : " + a[a.length - 2]);
        }
    }
}
    
