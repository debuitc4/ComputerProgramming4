import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNames {
   public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      // System.out.println("Enter the filename:");
      // String f = in.next();


      try{
         in = new Scanner(new File(args[0]));
         int num = in.nextInt();
         String [] names = new String[num];

         for (int i=0; i<names.length;i++){
            names[i] = in.next();
         }

         for (int j=names.length-1; j>= 0; j--){
            System.out.println(names[j]);
         }
      }

      catch(FileNotFoundException e)
      {
         System.out.println("Error: file not found.");
         System.exit(1);
      }
      in.close();

   }
}
