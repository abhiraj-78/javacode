class p83{
    public static void main(String args[]){

        for(int i=0;i<=7 ;i++){
            for(int j=1;j<=7;j++){
                if(i==j || j== (8-i)){
            if(j==i)
                System.out.print("\\");
            else
                System.out.print("/");
                }
            else if(i==0 || i==7){
                System.out.print("_");
            }
            else if(j==1 || j==7){
                System.out.print("|");
            }
            else{ 
                System.out.print(" ");
            }
            }
            System.out.println();
        }

    }
}
