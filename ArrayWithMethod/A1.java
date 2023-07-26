 import java.util.Scanner ;
class Test1{
    public void array(int x[]){
        System.out.println("array element are : ");
        for(int i = 0 ; i < x.length ; i++){
            System.out.println(x[i]+" ");
        }
    }
    public int peak(int a[]){
        boolean flag = false ; 
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > a[i+1]){
                flag = true ;
                break ;
            }
            else if(a[a.length-1] > a[a.length - 2]){
                flag = true ;
                break ;
            }
            else if(a[i+1] > a[i+2] && a[i+1] > a[i]){
                flag = true ;
                break ;
            }
            else {
                flag = false ;
            }
        }
        if(flag){
            return 1 ;
        }
        else {
            return 0 ; 
        }

    }    

}

class A1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter array size : ");
        int n = sc.nextInt() ;
        int a [] = new int [n] ;
        System.out.println("Enter array element : ");
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt() ;
        }        
        Test1 obj = new Test1() ;
        obj.array(a) ;
        int result = obj.peak(a) ;
        System.out.println(result);
    } 
} 