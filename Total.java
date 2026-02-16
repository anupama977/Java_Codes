import java.util.Scanner;
public class Total
{
public static void main(String args[])
{
  int a,b,sub;
  float div=1;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number 1");
  a=sc.nextInt();
  System.out.println("Enter number 2");
  b=sc.nextInt();
  int sum=a+b;
  if(a>b)
  sub=a-b;
  else
  sub=b-a;
  int mul= a*b;
  if(a!=0 && b!=0)
  div=a/b;
  System.out.println("SUM= "+sum);
  System.out.println("SUBTRACTION= "+sub);
  System.out.println("MULTIPLICATION= "+mul);
  System.out.println("DIVISION= "+div);
  }
  }