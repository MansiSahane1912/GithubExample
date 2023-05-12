package throwsAndthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mansi
{
   public void method1() throws FileNotFoundException
   {
	   System.out.println("Mansi.method1() !!! ");
	   FileInputStream fis = new FileInputStream("F:\\java\\age.java");
	   System.out.println("FIS object created in Mansi Class.");
   }
}
