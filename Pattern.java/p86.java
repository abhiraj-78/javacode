class p86{
    public static void main(String arh[]){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=10;j++){
                if(i>=j || j>= 11-i)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}