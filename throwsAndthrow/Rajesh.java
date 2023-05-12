package throwsAndthrow;

import java.io.FileNotFoundException;

public class Rajesh 
{
  public void method2()
  {
	  System.out.println("Rajesh.method2() !!!! ");
	  Ashwin a = new Ashwin();
	  
	  try 
	  {
		a.method1();
	  }
	  
	  catch (FileNotFoundException e)
	  {
		
		System.out.println("Please provide correct path.");
	  }
  }
  
  public static void main(String[] args) throws FileNotFoundException 
  { 
	  Rajesh r = new Rajesh();
	  System.out.println("In main(). ");
	  r.method2();
	  System.out.println("After call in main(). ");
	  
	  Mauu m = new Mauu();
	  m.method2();
  }
}
