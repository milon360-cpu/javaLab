
package Lab_2;
public class Problem_4
{
    public static void main(String[] args)
    {
       
        String str1= "Student";
        String str2= "Teacher";
        
        char []A = new char[100];
        char []A1 = new char[100];
        A = str1.toCharArray();
        A1 = str2.toCharArray();
        int counter=0;
         
        for(int i=0; i<A1.length; i++)
        {
            counter++;
        }
         System.out.println("Value of Length:\t"+counter);

    }
}
