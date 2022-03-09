import java.util.Scanner;
public class sqrtuser
{
  public static void main(String[] args)
 {
   double a,b;
   Scanner d = new Scanner(System.in);
   System.out.println("Enter a number to find squareroot");
   a=d.nextInt();
   b=Math.sqrt(a);
   System.out.println("square root of entered number is:\n " +b);

   d.close();
   
   }
 }