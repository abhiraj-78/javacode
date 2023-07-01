class p23{
    public static void main(String args[]){
        int i,j;
        char a= 'a' ;
        for( i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if(i==j || j==1||i==5){
                      System.out.print(a);
                }
                else{
                    System.out.print(" "); 
            }
                        a++;
            }
                System.out.println();
        
        }
    }

}