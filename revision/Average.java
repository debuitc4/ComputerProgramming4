public class Average {
   public static double averageArea(Shape [] shapes){
      double avg = 0;
      int count = 0;
      for (Shape shape:shapes){
         avg += shape.area();
         count++;
      }
      return avg / count;
   }
}
