/*26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F */
	
	import java.util.Scanner; 
	class Test{
  	public static void main(String args[]){
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter percentage :- ");
  		int percent = sc.nextInt();
  		System.out.println("Percentage is :- "+ percent);
  		
  		if(percent > 90 )
  			System.out.println("Grade : A");
  	        else if(percent > 80 && percent <= 90)
  			System.out.println("Grade : B");
  		else if(percent > 70  && percent <= 80)
  			System.out.println("Grade C");
  		else if(percent < 60 && percent >= 70)
  			System.out.println("Grade D");
  		else if(percent > 40 && percent <= 60)
  			System.out.println("Grade : E");
  		else if(percent < 40 )
  			System.out.println("Grade : F");	  	
  	}
  
  }
