import java.util.Scanner;
class swap
{
 public static void main(String[] args)
{
  int x,y;
  Scanner in = new Scanner(System.in); 
  System.out.println("enter two number:\n");
  x=in.nextInt();
  y=in.nextInt(); 
  System.out.println("\nBefore swapping x ="+x+ "\t " +"y ="+y);

  int z = y;
  y = x;
  x = z;
  
  // x=x+y;   //using 2 variables 
  // y=x-y; 
  // x=x-y;
  System.out.println("After swapping x ="+x+"\t"+"y ="+y);
  
  }
}