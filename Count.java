
class Count
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  Scanner s=new Scanner(System.in);
  int l=0,d=0;
  System.out.println("\n Enter a string:");
  String str=s.nextLine();
  for(int i=0;i<str.length();i++)
  {
   if(Character.isLetter(str.charAt(i))==true)
    l++;
   else if(Character.isDigit(str.charAt(i))==true)
    d++;
   } 
  System.out.println("\n The no:of Digits:"+d);
  System.out.println("\n The no:of Alphanumericals:"+l);
  System.out.println("\n The no:of Characaters:"+str.length());
 }
}