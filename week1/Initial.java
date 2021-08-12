import java.util.Scanner;

public class Initial {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Tell me your name: ");
      String name = in.next();
      in.close();
      System.out.println(name + " starts with the letter " + name.charAt(0));
    }
}
