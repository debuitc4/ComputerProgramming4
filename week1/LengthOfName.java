import java.util.Scanner;

public class LengthOfName {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Tell me your name: ");
      String input1 = in.next();
      in.close();
      int result = input1.length();
      System.out.println("Hello " + input1 + ", your name has " + result + " letters.");
    }
}
