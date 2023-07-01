class p46{
   public static void main(String arg[]){
    for(int i=5;i>=1;i--){
         char a='A';
        for(int j=1;j<=5;j++){
            if(i<=j)
                System.out.print(a++);
            else
                System.out.print(" ");    
  
        }
            System.out.println();
    }
}
}