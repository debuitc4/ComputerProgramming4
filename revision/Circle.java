import static java.lang.Math.*;

public class Circle extends Shape
{  
   private double rad;
   public Circle(String s, double r){
      super(s);
      rad = r;
   }
   double area(){
      double area;
      area = Math.PI * (rad * rad);
      return area;
   }
}