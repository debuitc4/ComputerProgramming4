import java.util.Scanner;

public class IsTeenager {
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int age = in.nextInt();
      in.close();
      if (age > 12 && age < 20)
         System.out.println("you are a teenager.");
      else
         System.out.println("you are not a teenager.");
   }
}
