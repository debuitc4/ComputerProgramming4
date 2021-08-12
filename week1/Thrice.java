import java.util.Scanner;

public class Thrice
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter three numbers: ");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();
        int s = a * b * c;
        System.out.printf("%d", s);


    }
}