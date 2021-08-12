import java.util.Scanner;

public class Temp
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      double fahr = in.nextDouble();
      in.close();
      double cent = Convert.fahr2cels(fahr);
      System.out.println(cent);
   }
}