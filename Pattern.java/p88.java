class p88{
    public static void main(String args[]){
        int k=0;
        for(int i=1;i<=9;i++){
            if(i<=5)
                k++;
            else
                k--;
            for(int j=1,s=0; j<=9; j++){
                if( j==5)
                System.out.print(k);
                else if(i==5){
                if(j<=5)
                System.out.print(++s);
                else
                System.out.print(s--);
                }else
                System.out.print(" ");

                

            }

            System.out.println();    
        }
    }
}