import java.util.Scanner;
class a2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter element in array : ");
        for(int i=0 ;i<a.length;i++){
            a[i] = sc.nextInt();
        }    
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
            int temp=0;
                if(a[i]>a[j]){
                temp = a[i] ;
                a[i] = a[j] ;
                a[j] = temp ;
                }
            }
            System.out.println(a[i]);
        }
    
        
    }
    
} 