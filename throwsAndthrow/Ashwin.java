package throwsAndthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ashwin
{
  public void method1() throws FileNotFoundException
  {
	  System.out.println("Ashwin.method1() !!! ");
	  FileInputStream fis = new FileInputStream("F:\\java\\aged.java");
	  System.out.println("FIS object is created in ashwin class");
  }
}
