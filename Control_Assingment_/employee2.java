/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".  

*/
import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age :");
	int age = sc.nextInt();
	System.out.println("Enter Gender  in F or M:");
	char ch = sc.next().charAt(0);
	System.out.println("Age : " + age); 
	System.out.println("Gender : " + ch);
	
	if(ch == 'F' && age < 60){
	 // System.out.println("Age : " + age);
	 // System.out.println("Gender : " + ch); 
	  System.out.println("She Will Work Only In Urban Areas");
	}
	else if(ch == 'M'){ 
	
	  if((age >=20) && (age <= 40))
	  
	 
	  System.out.println("He May Work Anywhere");
	}
	else if(ch=='M') {
	  if((age >40) && (age <= 60))
	//  System.out.println("Age : " + age);
	//  System.out.println("Gender : " + ch);
	  System.out.println("He Will Work In Urban Areas Only");
	}
	else if(age > 60){ 
	  System.out.println("Error");
	
	}


}
}
