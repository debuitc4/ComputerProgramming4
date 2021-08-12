import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNames
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the file name: ");
      String name = in.next();

      try
      {  
         // scanning in the file
         in = new Scanner(new File(name));
         // getting number from first line (how many names)
         int numNames = in.nextInt();
         // initalising array
         String [] names = new String[numNames];

         for (int i = 0; i < numNames; ++i)
         {  
            // assigning each name a spot in the array
            names[i] = in.next();
         }

         System.out.println("The names in reverse order are:");
         for (int i = numNames - 1; i >= 0; --i)
         {
            System.out.print(names[i] + " ");
         }
         System.out.println();

      }

      // catch the file exception
      catch(FileNotFoundException e)
      {
         System.out.println("Error: file not found.");
         System.exit(1);
      }
      in.close();
   }
}