import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {1, 5, 3, 9, 14, 66, 99, 100, 45, 200};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {1, 5, 3, 9, 14, 66, 99, 100, 45, 200};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
