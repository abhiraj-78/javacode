class p49{
   public static void main(String arg[]){
    for(int i=5;i>=1;i--){
         char a='A';
        for(int j=1;j<=5;j++){
          
            if(i<=j){
                if((i+j)%2!=0 )
                System.out.print("0");
            else 
                System.out.print("1");    
            }
            else
                System.out.print(" "); 
  
        }
            System.out.println();
    }
}
}