import java.util.Scanner;

public class ReducedString {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a string: ");
      int n = in.nextInt();
      String s = in.next();
      in.close();
      System.out.println(removeCharAt(s, n));
    }

    public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
}