import java.util.Scanner;

public class TwoTimes {
   public static void main(String [] args){
      int n;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      n = in.nextInt();
      in.close();
      int x = n * 2;
      System.out.println("Times two is: " + x);
   }
}
