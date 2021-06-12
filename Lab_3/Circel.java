
package Lab_3;
public class Circel 
{
    double Redious;
    Circel (double Redious)
    {
        this.Redious = Redious;
    }
     Circel ()
    {
      
    }
    double getArea()
    {
        return 3.1615*Redious*Redious;
    }
    double getRedious()
    {
        return Redious;
    }
   
}
