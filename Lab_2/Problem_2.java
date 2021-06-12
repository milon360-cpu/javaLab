
package Lab_2;

import java.util.Scanner;

public class Problem_2 
{
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
        int []Arr = new int[10];
        int i;  
         System.out.println("Please Enter 10 Numbers:\t");
        for(i=0; i<10; i++)
        {
            System.out.printf("Value %d:\t",i+1);
            Arr[i] = input.nextInt();
        }
        int Max = Arr[0];
        for(i=1; i<10; i++)
        {
            if(Max<Arr[i])
            {
                Max = Arr[i];
            }
        }
        System.out.println("Maximum Number:\t"+Max);

    }
   
}
