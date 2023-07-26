class Test3{
    public void m3(){
        int sum = 0 ;
        for(int i = 101 ; i < 200 ; i++){
            if(i % 7 == 0){
                sum = sum + i ;
            }
        }
        System.out.println(sum);

    }
}
public class Practice3 {
    public static void main(String args[]){
        Test3 obj = new Test3() ;
        obj.m3() ;
    }
}
