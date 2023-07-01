class p39{
    public static void main(String arg[]){
        for(int i=6;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i%2==0)
                    System.out.print(j);
                else
                    System.out.print((i+1)-j);
            }
            System.out.println();
        }

    }
}