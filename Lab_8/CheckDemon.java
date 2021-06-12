
package Lab_8;
public class CheckDemon
{
 
    public static void main(String[] args) 
    {
        Teacher_ teacher = new Teacher_();
        teacher.setDaemon(true);
        teacher.start();
        System.out.println(teacher.isDaemon());
        
    }
}
class Teacher_ extends Thread
{
    @Override
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

