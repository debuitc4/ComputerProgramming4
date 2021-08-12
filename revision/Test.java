public class Test {
   public static void main(int [] args)
   {  
      int total = 0;
      for (int i=0; i<args.length; i++){
         total += args[i];
      }
      System.out.println(total);
   }
}
