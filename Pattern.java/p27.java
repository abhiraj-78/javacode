class p27{
    public static void main(String arg[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==j || j==1 || i==5)
                    System.out.print(j%2);
                else
                    System.out.print(" ");    
            
        }
        System.out.println();
    }
    }
}