import java.util.Scanner;
class a3{
    public static void main(String args[]){
    int a [] = {2,3,4};
    int b [] = {4,5,6};
    int temp = 0;
    for(int i=0;i<a.length;i++){
        temp = a[i];
        a[i] = b[i];
        b[i] = temp;

    }
        System.out.println("After Swaping 1st & 2nd  array is : ");
        for(int i=0 ;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0 ;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
       
    }
    
} 