@SuppressWarnings("unchecked")
public class Bag <T>
{
   // Create an array of type T of 100 items (This is quite clumsy in Java)
   private T[] bag = (T[])(new Object[100]);
   private int numElements = 0;
   
   public void add(T x)
   { // put x in bag
      bag[numElements] = x;
      numElements++;
   }

   public void remove(T x)
   {
      int ind = numElements + 1;
      for (int i = 0; i < numElements; i++)
         if (bag[i].equals(x))
         {
            ind = i;
            break;
         }

      if (ind != numElements + 1)
         numElements--;
      
      for (int i = ind; i < numElements; ++i)
         bag[i] = bag[i + 1];
   }
   
   public int count(T x)
   {
      int count = 0;
      for (int i = 0; i < numElements; i++)
         if (bag[i].equals(x)) // .equals because T a class 
            count++;
      return count;
   }

   public int length()
   {
      return numElements;
   }

}