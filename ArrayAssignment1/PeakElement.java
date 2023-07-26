class PeakElement{
    public static void main(String args[]){
        int [] a = {1,1,1,1,1,1} ;
        boolean status = false ;
        
       
        
        for(int i = 0 ; i< a.length-1 ; i++){
            if(a[i] < a[i+1] && a[i+1] > a[i+2] ){
                status = true ;
                break ;   
        }
            else if(a[0] > a[1]){
                status = true ;
                break;
            }
            else if(a[a.length-1] > a[a.length-2]){
                status = true ;
                break ; 
            }
        }
        if(status == true ){
            System.out.println("1");
        }
        else
            System.out.println("0 ");

    }
}