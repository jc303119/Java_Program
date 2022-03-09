import java.util.Scanner;

class sqrtuser
{
  public static void main(String[] args)
 {
   double a,b;
   System.out.println("enter a number to find squareroot");
   Scanner d=new Scanner(System.in);
   
   a=d.nextInt();
   b=Math.sqrt(a);
  System.out.println("square root of entered number is:\n " +b);
   }
 }