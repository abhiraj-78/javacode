//3. WAP to calculate the percentage of students
import java.util.Scanner ;
class Test{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float math,physics,chemistry,bio,hindi ;
	math = sc.nextFloat();
	physics = sc.nextFloat();
	chemistry = sc.nextFloat();
	bio = sc.nextFloat();
	hindi = sc.nextFloat();
	
	float percentage = (math+bio+chemistry+bio+hindi)/5.0f ;
	System.out.println("Percentage :- " + percentage);
}
}
