
package Lab_2;

import java.util.Scanner;

public class Problem_3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i;
        int []Arr = new int[10];
        System.out.println("Please Enter 10 Number:\t");
        for(i=0; i<10; i++)
        {
            System.out.printf("Value %d:\t",i+1);
            Arr[i] = input.nextInt();
        }
        
        System.out.println("Arre Square root Element Are:\t");
         for(i=0; i<10; i++)
         {
             System.out.println(Math.sqrt(Arr[i]));
         }
    }
     
            
}
