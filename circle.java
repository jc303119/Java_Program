import java.util.Scanner;
class circle
{
  public static void main(String[] args)
{
  int r;
  double A;  //pi=3.14;
  Scanner in=new Scanner(System.in);
  System.out.println("enter radius of the circle:\n");
  r=in.nextInt();
  A=Math.PI*r*r;  //use math.PI constant to get value of pi
  System.out.println("Area of the circle is:\t" +A);
 }
}