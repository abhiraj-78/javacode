class Peak{
    public static void main(String args[]){
        int  [] a = {1,2,34,5,6,76} ;
        int size = a.length-1 ; 

        if(a[0] > a[1]){
            System.out.print("0 ");
        }
        if(a[size] > a[size -1]){
            System.out.print(size);

        }

        for(int i = 1 ; i < size ;i++){
            if(a[i] > a[i-1] && a[i] > a[i+1])
                System.out.print(i);
            }

    }    
}
