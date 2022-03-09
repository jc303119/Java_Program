import java.util.Scanner;
class factorial
{
  public static void main(String[] args)
{
  int n,i,fact=1;
  Scanner in=new Scanner(System.in);
  
  System.out.println("enter a number to find factorial:\n");
  n=in.nextInt();
  
 if(n<0)
 
   System.out.println("enter any positive number:\n");
 
 else
 {
   for(i=1; i<=n; i++)
    fact=fact*i;
    System.out.println("factorial of" +n+ "is=" +fact);
    }
 }
}