
import java.util.Scanner;
class dmart{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of costumer:");
		String name = sc.nextLine();
		System.out.print("Enter date :");
		String date = sc.nextLine();
		System.out.println("Enter Gender:");
        char gender = sc.next().charAt(0);
        System.out.println("Gender :"+gender);
        System.out.println("carry bag : ");
        char carryBag =sc.next().charAt(0);
	System.out.print("Enter 1st Item Quantity : ");
	int q1 = sc.nextInt();
	System.out.print("Enter 2nd Item Quantity : ");
	int q2 = sc.nextInt();
	System.out.print("Enter 3rd Item Quantity : ");
	int q3 = sc.nextInt();
	System.out.print("Enter 4th Item Quantity : ");
	int q4 = sc.nextInt();
	System.out.print("Enter 5th Item Quantity : ");
	int q5 = sc.nextInt();
	System.out.print("Enter 6th Item Quantity : ");
	int q6 = sc.nextInt();	
	System.out.print("Enter 7th Item Quantity : ");
	int q7 = sc.nextInt();
	System.out.print("Enter 8th Item Quantity : ");
	int q8 = sc.nextInt();
	System.out.print("Enter 9th Item Quantity : ");
	int q9 = sc.nextInt();	
	System.out.print("Enter 10th Item Quantity : ");
	int q10 = sc.nextInt();	
	int p1 = 10,p2 = 20,p3 = 30,p4 = 40,p5 = 50,p6 = 60,p7 = 70,p8 = 80,p9 = 90,p10 = 100; 
	int tp1 = q1 * p1 ;
	int tp2 = q1 * p1 ;
	int tp3 = q1 * p1 ;
	int tp4 = q1 * p1 ;
	int tp5 = q1 * p1 ;
	int tp6 = q1 * p1 ;
	int tp7 = q1 * p1 ;
	int tp8 = q1 * p1 ;
	int tp9 = q1 * p1 ;
	int tp10 = q1 * p1;
	double dp1=0;	
	if(q1 > 4){
	double dis1 = tp1 * 5 / 100 ;
	      dp1 = tp1 - dis1 ;
	}else {
	 dp1 = tp1;
	}
	double dp5=0;
	double dis5 = tp5 * 10 /100;
	dp5 = tp5 - dis5 ;
	
	double dp10=0;	
	if(q10>10){
	double dis10 = tp10 * 15 / 100 ;
	dp10 = tp10 - dis10 ;
	}else{
		dp10 = tp10;
	}
	int total_price = tp1 + tp2 + tp3 + tp4 + tp5 + tp6 +tp7 + tp8 +tp9 +tp10 ;
	double after_discount = dp1+tp2+tp3+tp4+dp5+tp6+tp7+tp8+tp9+dp10;
                System.out.println("\t\tD-Mart\t\t");
                System.out.println("Name : "+name +"\t\t"+"Date : "+date);
                System.out.println("--------------------------------------------------------");
		System.out.println("Item Name\tQuantity\tPrice\tTotal\tAfter-Discount");
		System.out.println("item1"+"\t\t"+q1+"\t\t"+p1+"\t"+tp1+"\t"+dp1+" Rs");
		System.out.println("item2" +"\t\t"+q2+"\t\t"+p2+"\t"+tp2+"\t"+tp2+" RS");
		System.out.println("item3" +"\t\t"+q3+"\t\t"+p3+"\t"+tp3+"\t"+tp3+" RS");
		System.out.println("item4" +"\t\t"+q4+"\t\t"+p4+"\t"+tp4+"\t"+tp4+" RS");
		System.out.println("item5" +"\t\t"+q5+"\t\t"+p5+"\t"+tp5+"\t"+dp5+" RS");
		System.out.println("item6" +"\t\t"+q6+"\t\t"+p6+"\t"+tp6+"\t"+tp6+" RS");
		System.out.println("item7" +"\t\t"+q7+"\t\t"+p7+"\t"+tp7+"\t"+tp7+" RS");
		System.out.println("item8"+"\t\t"+q8+"\t\t"+p8+"\t"+tp8+"\t"+tp8+" RS");
          	System.out.println("item9" +"\t\t"+q9+"\t\t"+p9+"\t"+tp9+"\t"+tp9+" RS");
                		      	  		         		   System.out.println("item10"+"\t\t"+q10+"\t\t"+p10+"\t"+tp10+"\t"+dp10+"RS");								
		System.out.println("-------------------------------------------------------");
		System.out.println("\t\t\t\t\t"+total_price+"\t"+after_discount);	
        double gst = total_price * 10 / 100 ;
        double tpGst,apGst ;
        apGst =after_discount + gst ;
        tpGst = total_price + gst ;

        if(gender == 'M' || gender == 'm'){
            System.out.println("Gift : lether Wallet\t\t\t0.0\t0.0");
        }else if(gender == 'F' || gender == 'f'){
            System.out.println("Gift : cadeburry \t\t\t 0.0 \t 0.0");
        }
        if(carryBag == 'Y' || carryBag == 'y'){
            System.out.println("Carry Bag : Yes \t\t\t"+"10"+"\t"+"10");
        }
        else if(carryBag == 'N' || carryBag == 'n'){
            System.out.println("Carry Bag : No \t\t\t\t"+"00"+"\t"+"00");
        }
        System.out.println("GST (10% \t\t\t\t"+gst+"\t"+gst);
	System.out.println("-------------------------------------------------------");
        if(carryBag == 'Y' || carryBag == 'y'){
      		System.out.println("Final Bill \t\t\t\t"+(tpGst+10)+"\t"+(apGst+10));
  		}
  	if(carryBag == 'N' || carryBag == 'n'){
  		System.out.println("Final Bill \t\t\t\t"+tpGst+"\t"+(apGst+10));
  		}
        System.out.println(" \t\t    Thank You \t\t");    
        System.out.println(" \t\t     To Visit \t\t");
        System.out.println(" \t\t      D-Mart \t\t");
        System.out.println("-------------------------------------------------------");
   }
}
