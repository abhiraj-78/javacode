import java.util.Scanner ;
class Test{
    public void m1(int  basic,char g){
        double gross_salary , allowance=0;
        float hra ,da,pf ;
        
        hra = basic * 20 / 100 ;
        da = basic * 50 / 100 ;
        pf = basic * 11 / 100 ;
        
        if(g == 'A'){
            allowance = 1700 ;
        }
        else if(g == 'B'){
            allowance = 1500 ;
        }
        else if(g == 'C'){
            allowance = 1300 ;
        }
        gross_salary = basic + hra + da + allowance - pf ;
        System.out.println(gross_salary);
     }
}

public class Practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        int basic = sc.nextInt() ;
        System.out.println("enter grade ");
        char ch = sc.next().charAt(0) ;
        Test obj = new Test() ;
        obj.m1(basic , ch) ;
    }
}
