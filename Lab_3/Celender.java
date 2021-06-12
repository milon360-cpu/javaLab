
package Lab_3;
public class Celender extends Circel
{
    double Height;
    Celender ()
    {
        double Height = 1;
    }
    Celender (double Redious)
    {
        super(Redious);
    }
    Celender (double Redious ,double Height)
    {
        super(Redious);
        this.Height = Height;
        this.Redious = Redious;
        
        
    }
    double getHeight()
    {
        return Height;
    }
    double getVolume()
    {
        return getArea()*Height;
    }
    
}
