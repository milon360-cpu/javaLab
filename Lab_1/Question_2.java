
package Lab_1;

import java.util.Scanner;

public class Question_2
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        int N1,N2;
        System.out.print("Please Enter First Number:\t");
        N1 = input.nextInt();
        System.out.print("Please Enter second Number:\t");
        N2 = input.nextInt();
        
        System.out.println("Sum of Number:\t"+(N1+N2));
    }
}
