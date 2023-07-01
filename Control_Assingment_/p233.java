    import java.util.Scanner;
    class Test{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a days number :");
    int day =sc.nextInt();
    
    switch(day){
    	case 1 : System.out.println(day + " Monday ");
    		break; 
    	case 2 : System.out.println(day + " Tuesday");	
    		break;
    	case 3 : System.out.println(day + " wednesday");
    		break;
    	case 4 : System.out.println(day + " Thursday");
    		break;
    	case 5 : System.out.println(day + " Friday");
    		break;
    	case 6 : System.out.println(day + " Saturday");
    		break;
    	case 7 : System.out.println(day + " Sunday");
    		break;
    	default : System.out.println("Not a valid day,");
    				
    		
    					
    }
    
    
    }
    }
