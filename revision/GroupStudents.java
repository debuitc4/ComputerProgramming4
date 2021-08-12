import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GroupStudents
{
   public static void main(String[] args)
   {
      if (args.length < 1)
      {
         System.out.println("Usage: java GroupStudents <filename>");
         System.exit(1);
      }

      try
      {
         Scanner in = new Scanner(new File(args[0]));
         int numStudents = in.nextInt();
         Student [] students = new Student[numStudents];

         for (int i = 0; i < numStudents; ++i)
         {
            String name = in.next();
            int mark = in.nextInt();
            // creating a new Student using Student class
            students[i] = new Student(name, mark);
         }
         Student.print(students);
      }

      catch(FileNotFoundException e)
      {
         System.out.println("Error: file not found");
      }
   }
}