import java.util.Scanner;
class ifelseexample
{
  public static void main(String[] args)
{
  int marksobtain,passingmark;
 Scanner in=new Scanner(System.in);
 passingmark=35;

 System.out.println("enter your marks\n");
 marksobtain=in.nextInt();
 if(marksobtain>=passingmark)
{ 
 System.out.println("congratulation! you are pass");
  }
else
 {
   System.out.println("you are fail");
   }
  }
} 
  