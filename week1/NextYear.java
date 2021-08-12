import java.util.Scanner;

public class NextYear {
   public static void main(String [] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your name: ");
      String input1 = in.next();

      System.out.print("What age are you: ");
      int input2 = in.nextInt();
      in.close();
      int result = input2 + 1;
      System.out.println("Hello " + input1 + ", next year you will be " + result + ".");
    }
}
