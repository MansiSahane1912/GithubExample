package ExceptionEx;
import java.util.Scanner;

public class FinallyEx 
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter num1 and num2:");
	  int num1 = sc.nextInt();
	  int num2 = sc.nextInt();
	  int result = 0;
	  
	  try
	  {
		  result = num1/num2;
		  
	  }
	  catch(Exception e)
	  {
		System.out.println("Invalid Operation "+e);  
	  }
	  finally
	  {
		  System.out.println("In finally block.");
	  }
	  
	  
	  
  }
}
