import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteStudents
{
   public static void main(String[] args)
   {
      if (args.length < 2)
      {
         System.out.println("Usage: java WriteStudents <file1> <file2>");
         System.exit(1);
      }

      try
      {
         Scanner in = new Scanner(new File(args[0]));
         int numStud = in.nextInt();
         Student [] students = new Student[numStud];
         for (int i = 0; i < numStud; ++i)
         {
            String name = in.next();
            int mark = in.nextInt() + 1;
            students[i] = new Student(name, mark);
         }
         in.close();
         
         PrintWriter outFile = new PrintWriter(args[1]);
         outFile.println(numStud);
         for (int i = 0; i < numStud; ++i)
         {
            outFile.println(students[i].name + " " + students[i].mark);
         }
         outFile.close();
      }

      catch(FileNotFoundException e)
      {
         System.out.println("Error: file not found");
      }

   }
}