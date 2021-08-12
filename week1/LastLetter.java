import java.util.Scanner;

public class LastLetter {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your name: ");
      String name = in.next();
      in.close();
      int last_index = name.length() - 1;
      System.out.println("The last letter of your name is " + name.charAt(last_index) + ".");
    }
}
