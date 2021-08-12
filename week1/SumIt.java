import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
        
      // Ask the user to enter a number
      System.out.print("Enter two numbers: ");
      int a;
      int b;
      a = in.nextInt();
      b = in.nextInt();
      in.close();
      int s = a + b;
      System.out.println(a + " and " + b + " is " + s);
        
    }
}