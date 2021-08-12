import java.util.Scanner;

public class SquareIt {
   public static void main(String [] args){
      int n;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      n = in.nextInt();
      in.close();
      int x = n * n;
      System.out.println(n + " squared is " + x);
   }
}
