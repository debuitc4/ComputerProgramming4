import java.util.Scanner;

public class HelloSon {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Tell me your name: ");
      String input = in.nextLine();
      in.close();
      System.out.println("Hello " + input);
    }
}
