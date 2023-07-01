import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int row = 8 ;
    int column = 10 ;
    String a[] [] = new String [row] [column] ;
    
    for(int i=0 ;i<row ; i++){
        for(int j=0 ; j < column ;j++){
            a[i][j] = "-" ;
        }
    }
    for(int i=0;i<row ; i++){
        for(int j=0;j<column;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
        
    }
      
    
    }
}
