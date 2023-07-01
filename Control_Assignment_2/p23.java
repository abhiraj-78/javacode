//23 Write a Java program to input day number and print week day.   
  
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a days number :");
    int day =sc.nextInt();
    if(day ==1)
    {
      System.out.println(day+ "st is a Monday");
    }
    else if(day==2)
    {
      System.out.println(day+ "nd is a Tuesday");
    }
    else if(day==3)
    {
      System.out.println(day+ "rd is a wednesday");
    }
    else if(day==4)
    {
      System.out.println(day+ "th is a Thursday");
    }
    else if(day==5)
    {
      System.out.println(day+ "th is a Friday");
    }
    else if(day==6)
    {
      System.out.println(day+ "th is a Saturday");
    }
    else if(day==7)
    {
      System.out.println(day+ "th is a Sunday");
    }
    else
    {
      System.out.println("This is not day");
    }
  }
}
