class DayOfTheWeek
{
 public static void main (String[] args) throws java.lang.Exception
 {
		// your code goes here
         int ch;
  Scanner s=new Scanner(System.in);
  System.out.println("\n The day of the week:");
  System.out.println("\n 0. Sunday");
  System.out.println("\n 1. Monday");
  System.out.println("\n 2. Tuesday");
  System.out.println("\n 3. Wednesday");
  System.out.println("\n 4. Thursday");
  System.out.println("\n 5. Friday");
  System.out.println("\n 6. Saturday");
  System.out.println("\n Enter day:");
  ch=s.nextInt();
  switch(ch)
  {
   case 0:   System.out.println("\n Free Personal Pizza on purchase of medium Pizza");
             break;
   case 1:   System.out.println("\n Rs.101 OFF on a bill of Rs.400 and above");
             break;
  
   case 2:   System.out.println("\n Free Plain Garlic Bread on another medium pizza");
             break;
  
   case 3:   System.out.println("\n Buy 1 Get 1 Free on any medium pizza");
             break;
  
   case 4:   System.out.println("\n Buy any medium pizza and get 50% off on another medium pizza");
             break;
  
   case 5:   System.out.println("\n Tastiest pizza 20% off on bill of Rs.399 or above");
             break;
   case 6:   System.out.println("\n Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
             break;
  } 
 }
}