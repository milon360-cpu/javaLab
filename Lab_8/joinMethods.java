
package Lab_8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class joinMethods 
{
    public static void main(String[] args) throws Exception
    {
        Teacher teacher = new Teacher();
        Teacher  teacher1= new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3= new Teacher();
        
        teacher.start();
        teacher.join();
        teacher1.start();
        teacher2.start();
        teacher3.start();
    }
}
class Teacher extends Thread
{
    public void run()
    {
        try
        {
           for(int i=1; i<=10; i++)
           {
               sleep(1000);
               System.out.println("Hi:\t"+i);
           }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
}