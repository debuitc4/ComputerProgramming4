public class Test
{
   // generics
   public static <T extends Order> T max(T a, T b)
   {
      if (a.greaterThan(b))
         return a;
      else
         return b;
   }
}