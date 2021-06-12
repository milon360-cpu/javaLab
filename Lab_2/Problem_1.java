
package Lab_2;
import java.util.Scanner;
public class Problem_1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int []Arr = new int[10];
        int Sum=0;
        double Avg;
        System.out.println("Please Enter 10 Numbers:\t");
        for(int i=0; i<10; i++)
        {
            System.out.printf("Value %d:\t",i+1);
            Arr[i] = input.nextInt();
            Sum = Sum+Arr[i];
        }
        Avg = ((double)Sum/10);
        System.out.println("Value of Average:\t"+Avg);
    }
}
