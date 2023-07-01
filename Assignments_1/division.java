import java.util.Scanner;
class Test{
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Maths : ");
	int Maths= sc.nextInt();
	System.out.println("Physics : ");
	int Phy  = sc.nextInt();
	System.out.println("English : ");
	int Engl = sc.nextInt();
	System.out.println("Chemistry : ");
	int Chem = sc.nextInt();
	System.out.println("Hindi : ");
	int Hin  = sc.nextInt();
	double per =(Maths+Phy+Engl+Chem+Hin)/5 ;
	System.out.print(" Percentage is : " + per);

	//Scanner per = sc.nextDouble();
 	String division = (per > 60) ? "1st division" :(per>50 && per<59)? "2nd division" :(per>33 && per<49)? "3rd division" : "you are fail" ;
	
	System.out.println("Division is : " + division);
	}	


}
