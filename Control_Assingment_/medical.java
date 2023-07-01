import java.util.Scanner;
class Test{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("class held : ");
	int class_held = sc.nextInt();
	
	System.out.println("total calss attend : ");
	int attend_class = sc.nextInt();
	System.out.println("No. Class held : " + class_held);
	System.out.println("Total class attend : " + attend_class);
	
	//int total_class = class_held - attend_class ; 
	double percentage = (attend_class * 100) / class_held ;
	System.out.println("Percentage of class attend : "+percentage);	
	if(percentage < 75 )
		System.out.println("Not Allow to sit in Exam ");
	else
		System.out.println("Allow to sit in exam ");
	}

}


