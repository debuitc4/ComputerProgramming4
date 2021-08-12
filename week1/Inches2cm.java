import java.util.Scanner;

public class Inches2cm {
   public static void main(String [] args)
   {
       // Create a scanner object
       Scanner in = new Scanner(System.in);
       int inch;
       System.out.println("Please enter a quantity in inches:");
       inch = in.nextInt();
       in.close();
       double s = inch * 2.54;
       System.out.printf("%d inch is %.2f cm", inch, s);

   }
}
