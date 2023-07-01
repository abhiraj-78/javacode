//5.Take input of age of 3 people by user and determine oldest and youngest among them
import java.util.Scanner ;
class Test{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age1,age2,age3 ;
		System.out.print("enter first person age : ");
		age1 = sc.nextInt();
		System.out.print("enter second person age : ");
		age2 = sc.nextInt();
		System.out.print("enter third person age : ");
		age3 = sc.nextInt();
		
		if(age1 > age2 && age1 > age3)
			System.out.println("first persosn is oldest");
		
		else if(age2 > age1 && age2 > age3)
			System.out.println("second person is oldest");
		else if (age3 > age1 && age3 > age2) 
			System.out.println("third person is oldest");
		
		if(age1<age2 && age1<age3)
			System.out.println("first person is youngest");
		else if(age2<age1 && age2<age1)
			System.out.println("second person is youngest");
		else if(age3<age1 && age3<age2)	
			System.out.println("third person is youngest");
	}

}

