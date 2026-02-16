import java.util.Scanner;
 public class Reverse
 {
  public static void main(String args[])
  {
   Scanner sc =new Scanner(System.in);
   String str1; int i;
   System.out.println("Enter a String : ");
   str1=sc.nextLine();
   int len= str1.length();
   String str=""; char ch;
   for(i=(len-1);i>=0;i--)
   {
	   ch= str1.charAt(i);
    str=str+ch;
	}
	System.out.println("ORIGINAL STRING: "+str1);
	System.out.println("REVERSED STRING: "+str);
	}
	}