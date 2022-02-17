import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int count = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {      
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
        count ++;
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Iterations: " + count);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int count = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {     
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
        count ++;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Iterations: " + count);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int count = 0;
    for (int index = 0; index < words.size() - 1; index++)
    {
      int least = index;
      for (int index2 = index + 1; index2 < words.size(); index2++)
      {
        if (words.get(index2).compareTo(words.get(index)) > 0)
        {
          least = index2;
        }
        count++;
      }
      String stuff = words.get(index);
      words.set(index, words.get(least));
      words.set(least, stuff);
    }
    System.out.println("Iterations: " + count);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {    
    int count = 0;
    for (int index = 1; index < words.size(); index ++)
    {
      String temp = words.get(index);
      int maybe = index;
      while (maybe > 0 && temp.compareTo(words.get(index - 1)) > 0)
      {
        words.set(index, words.get(index - 1));
        maybe --;
        count ++;
      }
      words.set(maybe, temp);
    }
    System.out.println("Iterations: " + count);
  }
}