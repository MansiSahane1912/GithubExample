package throwsAndthrow;

import java.io.FileNotFoundException;

public class Pooja 
{
  public void method2() throws FileNotFoundException
  {
	  System.out.println("Pooja.method2() !!!! ");
	  Mansi m = new Mansi();
	  m.method1();
  }
  public static void main(String[] args) throws FileNotFoundException
  {
	Pooja p = new Pooja();
	System.out.println("In main() ");
	p.method2();
	System.out.println("After Call. ");
  }
}
