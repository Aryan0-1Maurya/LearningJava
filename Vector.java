import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class AddListToVector {

  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    System.out.println("Actual vector:" + vct);
    List < String > list = new ArrayList < String > ();
    list.add("one");
    list.add("two");
    vct.addAll(list);
    System.out.println("After Copy: " + vct);
  }
}
import java.util.Vector;

class BasicVectorOperations {

  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    System.out.println(vct);
    //adding element at specified index
    vct.add(2, "Random");
    System.out.println(vct);
    //getting elements by index
    System.out.println("Element at index 3 is: " + vct.get(3));
    //getting first element
    System.out.println("The first element of this vector is: " + vct.firstElement());
    //getting last element
    System.out.println("The last element of this vector is: " + vct.lastElement());
    //how to check vector is empty or not
    System.out.println("Is this vector empty? " + vct.isEmpty());
  }
}
import java.util.Vector;

class VectorClone {
  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    System.out.println("Actual vector:" + vct);
    Vector < String > copy = (Vector < String > ) vct.clone();
    System.out.println("Cloned vector:" + copy);
  }
}
import java.util.Vector;

class CopyVectorToArray {

  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    System.out.println("Actual vector:" + vct);
    String[] copyArr = new String[vct.size()];
    vct.copyInto(copyArr);
    System.out.println("Copied Array content:");
    for (String str: copyArr) {
      System.out.println(str);
    }
  }
}
import java.util.Vector;

class ClearVector {
  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    System.out.println("Actual vector:" + vct);
    vct.clear();
    System.out.println("After clear vector:" + vct);
  }
}
import java.util.Enumeration;
import java.util.Vector;

class VectorEnumeration {

  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    Enumeration < String > enm = vct.elements();
    while (enm.hasMoreElements()) {
      System.out.println(enm.nextElement());
    }
  }
}
import java.util.Iterator;
import java.util.Vector;

class VectorIterator {

  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    Iterator < String > itr = vct.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
import java.util.Vector;
import java.util. * ;

class VectorExample {
  public static void main(String[] args) {
    int n,
    index;
    Vector v = new Vector();

    Scanner sc = new Scanner(System. in );

    System.out.println("Enter the size of vector ");
    n = sc.nextInt();

    //Add Elements in the vector

    System.out.println("Enter the elements in the vector");
    for (index = 0; index < n; index++) {
      v.add(sc.nextInt());
    }

    //Displaying the elements 
    System.out.println("The elements are: ");
    for (index = 0; index < n; index++) {
      System.out.print(v.get(index) + " ");
    }

    //Removing element from vector
    System.out.println("\nEnter the index of the element to remove");
    v.remove(sc.nextInt());

    System.out.println("After removing, the remaining elements in the vector are:");

    //display elements of Vector
    for (index = 0; index < v.size(); index++) {
      System.out.print(v.get(index) + " ");
    }
  }
}
import java.util.List;
import java.util.Vector;

class VectorSubRange {

  public static void main(String a[]) {
    Vector < String > vct = new Vector < String > ();
    //adding elements to the end
    vct.add("First");
    vct.add("Second");
    vct.add("Third");
    vct.add("Random");
    vct.add("Click");
    System.out.println("Actual vector:" + vct);
    List < String > list = vct.subList(2, 4);
    System.out.println("Sub List: " + list);
  }
}