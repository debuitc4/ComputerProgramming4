import java.util.Scanner;

public class Absolute {
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = in.nextInt();
      in.close();
      if (n < 0){
         n = Math.abs(n);
      }
      System.out.println("The absolute value is " + n + ".");
   }
}
