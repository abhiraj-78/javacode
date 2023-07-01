class p89{
    public static void main(String args[]){
        for(int i=6 ;i>=1;i--){
            for(int j=1;j<=11;j++){
                if(i<=j && j <= 12-i ){
                if((i+j)%2 !=0)
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