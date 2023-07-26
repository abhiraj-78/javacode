class RepeatingElement{
    public static void main(String args[]){
        int [] a = {1, 5, 10, 20, 5, 40, 80} ;
        int sum ;
        for (int i = 0 ; i < a.length ; i++){
            for (int j = 1+i ; j < a.length ; j++){
                if(a[i] == a[j]){
                    System.out.print("First repeating element foumd at "+(j+1));
                }
            }
        }
        System.out.println();

    }
}