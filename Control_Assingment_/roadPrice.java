/* Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%		*/
     
     import java.util.Scanner; 
     class Test{
  	public static void main(String args[]){
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter PRICE :- ");
  		float price = sc.nextInt();
  		System.out.println("Price is :- "+ price);
  		
  		if(price > 100000 ){
  			float tax = price * 15 / 100.0f ;			
  			System.out.println("Tax To Be Paid : "+ tax);
  			}
  	        else if(price > 50000 && price <=100000){
  	        	float tax = price * 10 / 100.0f ;
  			System.out.println("Tax To Be Paid : "+ tax);
  			}
  		else if(price < 50000){
  			float tax = price * 5 / 100.0f ;
  			System.out.println("Tax To Be Paid : " + tax);
  			}
  		}
  
  }
