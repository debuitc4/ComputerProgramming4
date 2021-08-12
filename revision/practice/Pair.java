public class Pair <T, U>
{
   // type specified when the object is being created
   T item1;
   U item2;

   public Pair(T i1, U i2)
   {
      item1 = i1;
      item2 = i2;
   }

   public String toString()
   {
      return item1 + " " + item2;
   }

   public static void main(String[] args)
   {     
      Pair<String,Integer> phoneNumber = new Pair<>("Bill's number", 1324);  
      System.out.println(phoneNumber);

      Pair<Double,Double> point = new Pair<>(3.14, 2.32);
      System.out.println(point);
   }
}