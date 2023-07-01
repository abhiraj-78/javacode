class p36{
    public static void main(String args[]){
        for(char i='E';i>='A';i--){
            for(char j='A';j<=i;j++){
                if(i==j || i=='E' || j=='A')
                    System.out.print(j);
                else 
                    System.out.print(" ");    
            }
            System.out.println();
        }
    }
}