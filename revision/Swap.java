public class Swap {
   public static <T> void swap(T [] arr, int i, int j)
{
   T temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
}
public static void main(String[] args)
{
   Integer [] arr = {1, 2, 3};  // only works on objects
   swap(arr, 0, 1);
   for (int i = 0; i < arr.length; ++i)
      System.out.println(i + ", " + arr[i]);
}
}
