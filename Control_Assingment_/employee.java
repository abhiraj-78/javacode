/* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Year :");
        year = sc.nextInt();
        float salary;
        System.out.print("Salary : ");
        salary = sc.nextFloat();
        System.out.println("Year : "+ year);
        System.out.println("Salary Is :" + salary);
        if(year >= 5){
            
            float bonus = salary * 5 /100.0f ;
            System.out.println("Net Bonus is : " + bonus);
        }
       
    }
}
