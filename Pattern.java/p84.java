class p84{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=9;j++){
                if(i<=j && j<= 10-i){
                    if(j<=5)
                        System.out.print(6-j);
                    else
                        System.out.print(j-4);
                }
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}