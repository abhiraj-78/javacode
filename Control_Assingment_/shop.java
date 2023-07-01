/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/
import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    int unit,cost;
    System.out.print("Enter Unit");
    unit = sc.nextInt();
    System.out.println("Total Unit : "+ unit);
    cost= unit * 100;
    //System.out.println("Cost is : "+ cost);
    if(cost >= 1000){
        float discount = cost * 10 / 100.0f ;
        float total_cost = cost - discount ;
        System.out.println("Final Cost With 10% Discount : "+total_cost);
    }
    else {
        System.out.println("Total Cost : "+cost);
    }


}


}
