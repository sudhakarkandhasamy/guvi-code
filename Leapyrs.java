class Leapyrs
{
 public static void main (String[] args) throws java.lang.Exception
 {
		// your code goes here
  int i;
  System.out.println("\n The leap years are:");
  for(i=1900;i<=2020;i++)
  {
   if(i%4==0)
    System.out.println("\n"+i);
  }  
 }
}