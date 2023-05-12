package throwAtmService;

import java.util.Scanner;

public class ATM 
{
   public void withdrawal(int pin) throws Exception
   {
	   int count = 0;
	   Scanner sc = new Scanner(System.in);
	   for(int i=0; i<=3; i++) 
	   {
		   if(pin!=1234)
			  {
				  System.out.println("Invalid Pin!! Please Enter valid Pin");
				  count++;
				  // System.out.println("Count: "+count);
				  if(count>=3)
				  {
					  System.out.println("Card is Blocked.");
					  throw new Exception();    // throw concept
				  }
				  System.out.println("Please Enter your Pin.");
				  pin = sc.nextInt();
			  } 
	      
		  else
	     {
		  System.out.println("Login Sucessfully.!! ");
		  break;
	     }
	   }
	     System.out.println("Continue.....");
   }
   
   public static void main(String[] args) throws Exception 
   {
	 ATM mansi = new ATM();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please Enter Valid Pin");
	 int pin = sc.nextInt();
	 
	 mansi.withdrawal(pin);
   }
}
