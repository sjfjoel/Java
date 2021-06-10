import java.util.Scanner;

public class PatternPyramid {
    public static void main(String[] args)
    {
        System.out.println("Program for printing pramid");
        System.out.print("Enter the number of rows : ");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        for(int i=1; i<=row-1; i++)
        {
            for(int j=1; j<=row*2-1; j++)
            {
                if(j>=row-(i-1) && j<=row+(i-1))
                {
                    System.out.print(" *");   //Avoid println
                }
                else
                {
                    System.out.print("  ");   //Avoid println
                }
            }
            System.out.println();
        }
         
    }
}