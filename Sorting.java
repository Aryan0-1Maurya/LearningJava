import java.util.Scanner;
class BubbleSort {  public static void main(String[] args)   {    int n,
    c,
    d,
    swap;    Scanner in =new Scanner(System. in );    System.out.println("Input number of integers to sort");    n = in.nextInt();    int array[] = new int[n];    System.out.println("Enter " + n + " integers");    
    for (c = 0; c < n; c++)     {      array[c] = in.nextInt();    
    }    
    for (c = 0; c < (n - 1); c++)     {      
      for (d = 0; d < n - c - 1; d++)       {        
        if (array[d] > array[d + 1])
        /* For descending order use < */
                 {          swap = array[d];          array[d] = array[d + 1];          array[d + 1] = swap;        
        }      
      }    
    }    System.out.println("Sorted list of numbers");    
    for (c = 0; c < n; c++)     {      System.out.println(array[c]);    
    }  
  }
}
import java.util. * ;
class BubbleSortInDescendingOrder {  public static void main(String args[])   {    int n,
    c,
    d,
    swap;    Scanner in =new Scanner(System. in );    System.out.println("Input number of integers to sort");    n = in.nextInt();    int array[] = new int[n];    System.out.println("Enter " + n + " integers");    
    for (c = 0; c < n; c++)     {      array[c] = in.nextInt();    
    }    
    for (c = 0; c < (n - 1); c++)     {      
      for (d = 0; d < n - c - 1; d++)       {        
        if (array[d] < array[d + 1])         {          swap = array[d];          array[d] = array[d + 1];          array[d + 1] = swap;        
        }      
      }    
    }    System.out.println("Sorted list of numbers");    
    for (c = 0; c < n; c++)     {      System.out.println(array[c]);    
    }  
  }
}
import java.util. * ; class EnumerationSort {  public static void main(String[] args) {    
    /*         Creates random data for sorting source. Will use java.util.Vector         to store the random integer generated.        */
        Random random = new Random();    Vector < Integer > data = new Vector < Integer > ();    
    for (int i = 0; i < 10; i++) {      data.add(Math.abs(random.nextInt()));    
    }     
    /*         Get the enumeration from the vector object and convert it into         a java.util.List. Finally we sort the list using         Collections.sort() method.        */
        Enumeration enumeration = data.elements();    List < Integer > list = Collections.list(enumeration);    Collections.sort(list);      //        // Prints out all generated number after sorted.        //
        
    for (Integer number: list) {      System.out.println("number = " + number);    
    }  
  }
} //The exchange sort compares the first element with each element of the array, making a swap where is necessary.
import java.util. * ;
class ExchangeSort {  public static void main(String[] args)   {    int[] array;    int i,
    j,
    temp,
    size;    Scanner sc = new Scanner(System. in );    System.out.println("Enter the size of array");    size = sc.nextInt();    array = new int[size];    System.out.println("Enter the elements of array : ");    
    for (i = 0; i < size; i++)     {      array[i] = sc.nextInt();    
    }     //Exchange sort        for (i = 0; i < (size - 1); i++)        {            for (j = (i + 1); j < size; j++)            {                if (array[i] > array[j])                {                    temp = array[i];                    array[i] = array[j];                    array[j] = temp;                }            }        }
        System.out.println("Sorted Array is : ");    
    for (i = 0; i < size; i++)     {      System.out.print(array[i] + " ");    
    }  
  }
}
class HeapSort {  public static void main(String a[])   {    int i;    int arr[] = {
      1,
      3,
      4,
      5,
      2
    };    System.out.println("\nHeap Sort\n---------------");    System.out.println("\nUnsorted Array\n---------------");    
    for (i = 0; i < arr.length; i++)     {      System.out.print(" " + arr[i]);    
    }    
    for (i = arr.length; i > 1; i--)     {      fnSortHeap(arr, i - 1);    
    }    System.out.println("\n\nSorted array\n---------------");    
    for (i = 0; i < arr.length; i++)     {      System.out.print(" " + arr[i]);    
    }  
  }  public static void fnSortHeap(int array[], int arr_ubound)   {    int i,
    o;    int lChild,
    rChild,
    mChild,
    root,
    temp;    root = (arr_ubound - 1) / 2;    
    for (o = root; o >= 0; o--)     {      
      for (i = root; i >= 0; i--)       {        lChild = (2 * i) + 1;        rChild = (2 * i) + 2;        
        if ((lChild <= arr_ubound) && (rChild <= arr_ubound))         {          
          if (array[rChild] >= array[lChild])            mChild = rChild;          
          else            mChild = lChild;        
        }        
        else         {          
          if (rChild > arr_ubound)            mChild = lChild;          
          else            mChild = rChild;        
        }        
        if (array[i] < array[mChild]) {          temp = array[i];          array[i] = array[mChild];          array[mChild] = temp;        
        }      
      }    
    }    temp = array[0];    array[0] = array[arr_ubound];    array[arr_ubound] = temp;    
    return;  
  }
}
class InsertionSortExample {  static int step = 1;  public static void main(String[] args)   {    int[] input = {
      7,
      21,
      91,
      43,
      23,
      17,
      34,
      9,
      1
    };    insertionSort(input);  
  }  private static void printNumbers(int[] input)   {    System.out.println("Step " + step);    System.out.println("-----------------------------");    step++;    
    for (int i = 0; i < input.length; i++)     {      System.out.print(input[i] + ", ");    
    }    System.out.println("\n");  
  }  public static void insertionSort(int array[])   {    int n = array.length;    
    for (int j = 1; j < n; j++)     {      int key = array[j];      int i = j - 1;      
      while ((i > -1) && (array[i] > key))       {        array[i + 1] = array[i];        i--;      
      }      array[i + 1] = key;      printNumbers(array);    
    }  
  }
}
class MergeSort {  private int[] array;  private int[] tempMergArr;  private int length;  public static void main(String a[])   {    int[] inputArr = {
      32,
      27,
      51,
      89,
      1,
      98,
      9,
      28,
      65,
      0
    };    MergeSort mms = new MergeSort();    mms.sort(inputArr);    
    for (int i: inputArr)     {      System.out.print(i);      System.out.print(" ");    
    }  
  }  public void sort(int inputArr[])   {    this.array = inputArr;    this.length = inputArr.length;    this.tempMergArr = new int[length];    doMergeSort(0, length - 1);  
  }  private void doMergeSort(int lowerIndex, int higherIndex)   {    
    if (lowerIndex < higherIndex)     {      int middle = lowerIndex + (higherIndex - lowerIndex) / 2;       // Below step sorts the left side of the array            doMergeSort(lowerIndex, middle);            // Below step sorts the right side of the array            doMergeSort(middle + 1, higherIndex);            // Now merge both sides            mergeParts(lowerIndex, middle, higherIndex);        }    }
        private void mergeParts(int lowerIndex, int middle, int higherIndex)   {    
        for (int i = lowerIndex; i <= higherIndex; i++)     {      tempMergArr[i] = array[i];    
        }
        int i = lowerIndex;    int j = middle + 1;    int k = lowerIndex;    
        while (i <= middle && j <= higherIndex)     {      
          if (tempMergArr[i] <= tempMergArr[j])       {        array[k] = tempMergArr[i];        i++;      
          }      
          else       {        array[k] = tempMergArr[j];        j++;      
          }      k++;    
        }    
        while (i <= middle)     {      array[k] = tempMergArr[i];      k++;      i++;    
        }  
      }
    }
    import java.util.Comparator;
    import java.util.Arrays;
    class SortFruitObject {  public static void main(String args[])   {    Fruit[] fruits = new Fruit[4];    Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);    Fruit apple = new Fruit("Apple", "Apple description", 100);    Fruit orange = new Fruit("Orange", "Orange description", 80);    Fruit banana = new Fruit("Banana", "Banana description", 90);    fruits[0] = pineappale;    fruits[1] = apple;    fruits[2] = orange;    fruits[3] = banana;    Arrays.sort(fruits);    int i = 0;    
        for (Fruit temp: fruits)     {      System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity " + "\t: " + temp.getQuantity());    
        }  
      }
    }
    class Fruit implements Comparable < Fruit > {  private String fruitName;  private String fruitDesc;  private int quantity;  public Fruit(String fruitName, String fruitDesc, int quantity)   {    super();    this.fruitName = fruitName;    this.fruitDesc = fruitDesc;    this.quantity = quantity;  
      }  public String getFruitName()   {    
        return fruitName;  
      }  public void setFruitName(String fruitName)   {    this.fruitName = fruitName;  
      }
      public String getFruitDesc()   {    
        return fruitDesc;  
      }  public void setFruitDesc(String fruitDesc)   {    this.fruitDesc = fruitDesc;  
      }  public int getQuantity()   {    
        return quantity;  
      }  public void setQuantity(int quantity)   {    this.quantity = quantity;  
      }  public int compareTo(Fruit compareFruit)   {    int compareQuantity = ((Fruit) compareFruit).getQuantity();     //ascending order        return this.quantity - compareQuantity;
             //descending order        //return compareQuantity - this.quantity;    }
          public static Comparator < Fruit > FruitNameComparator       = new Comparator < Fruit > ()   {    public int compare(Fruit fruit1, Fruit fruit2)     {      String fruitName1 = fruit1.getFruitName().toUpperCase();      String fruitName2 = fruit2.getFruitName().toUpperCase();       //ascending order            return fruitName1.compareTo(fruitName2);
                   //descending order            //return fruitName2.compareTo(fruitName1);        }    };}
            class QuickSort {  public static void main(String a[])   {    int i;    int array[] = {
                  12,
                  9,
                  4,
                  99,
                  120,
                  1,
                  3,
                  10,
                  13
                };    System.out.println("Quick Sort\n\n");    System.out.println("Values Before the sort:\n");    
                for (i = 0; i < array.length; i++)     {      System.out.print(array[i] + " ");    
                }    System.out.println();    quick_srt(array, 0, array.length - 1);    System.out.print("\nValues after the sort:\n\n");    
                for (i = 0; i < array.length; i++)     {      System.out.print(array[i] + " ");    
                }    System.out.println();  
              }  public static void quick_srt(int array[], int low, int n)   {    int lo = low;    int hi = n;    
                if (lo >= n)     {      
                  return;    
                }    int mid = array[(lo + hi) / 2];    
                while (lo < hi)     {      
                  while (lo < hi && array[lo] < mid)       {        lo++;      
                  }      
                  while (lo < hi && array[hi] > mid)       {        hi--;      
                  }      
                  if (lo < hi)       {        int T = array[lo];        array[lo] = array[hi];        array[hi] = T;      
                  }    
                }    
                if (hi < lo)     {      int T = hi;      hi = lo;      lo = T;    
                }    quick_srt(array, low, lo);    quick_srt(array, lo == low ? lo + 1 : lo, n);  
              }
            }
            class SelectionSortExample {  public static int[] doSelectionSort(int[] arr)   {    
                for (int i = 0; i < arr.length - 1; i++)     {      int index = i;      
                  for (int j = i + 1; j < arr.length; j++)       {        
                    if (arr[j] < arr[index])         {          index = j;        
                    }      
                  }      int smallerNumber = arr[index];      arr[index] = arr[i];      arr[i] = smallerNumber;    
                }    
                return arr;  
              }  public static void main(String a[])   {    int[] arr1 = {
                  102,
                  34,
                  2,
                  56,
                  76,
                  5,
                  88,
                  42
                };    int[] arr2 = doSelectionSort(arr1);    
                for (int i: arr2)     {      System.out.print(i);      System.out.print(", ");    
                }  
              }
            }
            import java.util. * ;
            class SelectionSortDesc {  public static void main(String[] args)   {    int[] num;    int size;    Scanner scanner = new Scanner(System. in );    System.out.print("No. of elements to sort :");    size = scanner.nextInt();    num = new int[size];    
                for (int i = 0; i < size; i++)     {      num[i] = scanner.nextInt();    
                }    int sorted_array[] = sort(num);    System.out.println("Selection Sort in Descending order : ");    
                for (int i = 0; i < sorted_array.length; i++)     {      System.out.print(sorted_array[i] + "\t");    
                }  
              }  public static int[] sort(int[] num)   {    int i,
                j,
                first,
                temp;    
                for (i = num.length - 1; i > 0; i--)     {      first = 0; //initialize to subscript of first element            for (j = 1; j <= i; j++) //locate smallest element between positions 1 and i.            {                if (num[j] < num[first])                    first = j;            }            temp = num[first]; //swap smallest found with element in position i.            num[first] = num[i];            num[i] = temp;        }        return num;    }}class ShellSort{    private long[] data;    private int len;
                    public ShellSort(int max)   {    data = new long[max];    len = 0;  
                  }  public void insert(long value)   {    data[len] = value;    len++;  
                  }  public void display()   {    
                    for (int j = 0; j < len; j++)     {      System.out.print(data[j] + " ");    
                    }    System.out.println("");  
                  }  public void shellSort()   {    int inner,
                    outer;    long temp;     // find initial value of h
                        int h = 1;    
                    while (h <= len / 3)     {      h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)        }
                          
                      while (h > 0) // decreasing h, until h=1        {            // h-sort the file            for (outer = h; outer < len; outer++)            {                temp = data[outer];                inner = outer;
                               // one subpass (eg 0, 4, 8)                while (inner > h - 1 && data[inner - h] >= temp)                {                    data[inner] = data[inner - h];                    inner -= h;                }
                              data[inner] = temp;      
                    }      h = (h - 1) / 3; // decrease h        }    }
                      public static void main(String[] args)   {    int maxSize = 10;    ShellSort arr = new ShellSort(maxSize);    
                      for (int j = 0; j < maxSize; j++)     {      long n = (int)(java.lang.Math.random() * 99);      arr.insert(n);    
                      }  System.out.print("Unsorted List:\n");    arr.display();    arr.shellSort();    System.out.print("-------------------------\n");    System.out.print("Sorted List:\n");    arr.display();  
                    }
                  }
                  import java.util.Scanner;
                  /* Class SkipListTest */
                  class SkipList {  public static void main(String[] args)   {    int n;    Scanner scan = new Scanner(System. in );    
                      /* Creating object of SkipList */
                          SkipList1 sl = new SkipList1(100000000);    System.out.println("Enter no of elements to enter");    n = scan.nextInt();    
                      /* Perform list operations */
                          do     {      System.out.println("Enter integer element to insert");      sl.insert(scan.nextInt());         
                        /* Display List */
                              sl.printList();      n--;    
                      }     while ( n > 0 );  
                    }
                  }
                  /* Class SkipNode */
                  class SkipNode {  int element;  SkipNode right;  SkipNode down;  
                    /* Constructor */
                      public SkipNode(int x)   {    this(x, null, null);  
                    }  
                    /* Constructor */
                      public SkipNode(int x, SkipNode rt, SkipNode dt)   {    element = x;    right = rt;    down = dt;  
                    }
                  }
                  /* Class SkipList */
                  class SkipList1 {  private SkipNode header;  private int infinity;  private SkipNode bottom = null;  private SkipNode tail = null;  
                    /* Constructor */
                    public SkipList1(int inf)   {    infinity = inf;    bottom = new SkipNode(0);    bottom.right = bottom.down = bottom;    tail = new SkipNode(infinity);    tail.right = tail;    header = new SkipNode(infinity, tail, bottom);  
                    }  
                    /* Function to insert element */
                      public void insert(int x)   {    SkipNode current = header;    bottom.element = x;    
                      while (current != bottom)     {      
                        while (current.element < x)       {        current = current.right;      
                        }      
                        /* If gap size is 3 or at bottom level and must insert, then promote middle element */
                              
                        if (current.down.right.right.element < current.element)       {        current.right = new SkipNode(current.element, current.right, current.down.right.right);        current.element = current.down.right.element;      
                        }      
                        else        current = current.down;    
                      }    
                      /* Raise height of skiplist if necessary */
                          
                      if (header.right != tail)      header = new SkipNode(infinity, tail, header);  
                    }  
                    /* Function to get node at a position */
                      private int elementAt(SkipNode t)   {    
                      return t == bottom ? 0 : t.element;  
                    }  
                    /* Function to print list */
                      public void printList()   {    System.out.print("\nSkiplist = ");    SkipNode current = header;    
                      while (current.down != bottom)     {      current = current.down
                      }    
                      while (current.right != tail)     {      System.out.print(current.element + " ");      current = current.right;    
                      }    System.out.println();  
                    }
                  }
                  import java.util. * ;
                  class Sorting {  public static void main(String[] args)   {    int num,
                      i,
                      j,
                      temp;    int[] asc;    int[] des;    Scanner sc = new Scanner(System. in );    System.out.println("Enter the number of elements:");    num = sc.nextInt();    asc = new int[num];    des = new int[num];    System.out.println("Enter " + num + " numbers: ");     //Sorting numbers in ascending order         for (i = 0; i < num; i++)        {            asc[i] = sc.nextInt();            des[i] = asc[i];        }                for (i = 0; i < (num - 1); i++)        {            for (j = 0; j < (num - i - 1); j++)            {                if (asc[j] > asc[j + 1])                {                    temp = asc[j];                    asc[j] = asc[j + 1];                    asc[j + 1] = temp;                }            }        }
                           //Sorting numbers in descending order        for (i = 0; i < (num - 1); i++)        {            for (j = 0; j < (num - i - 1); j++)            {                if (des[j] < des[j + 1])                {                    temp = des[j];                    des[j] = des[j + 1];                    des[j + 1] = temp;                }            }        }
                          System.out.println("Sorted list of numbers in ascending order:");    
                      for (i = 0; i < num; i++)     {      System.out.print(" " + asc[i]);    
                      }    System.out.println("\n \nSorted list of numbers in descending order:");    
                      for (i = 0; i < num; i++)     {      System.out.print(" " + des[i]);    
                      }  
                    }
                  }