import java.util.ArrayList;
import java.util.Iterator;
class ArrayListTest {  
    public static void main(String[] args)   {     //creating arraylist of type String
            
        ArrayList < String > al = new ArrayList < String > ();     //adding object in arraylist  
            
        al.add("Java");    
        al.add("C");    
        al.add("C++");    
        al.add("php");    
        System.out.print("ArrayList :" + al);    
        System.out.println();     //getting Iterator from arraylist to traverse elements
            
        Iterator itr = al.iterator();    
        while (itr.hasNext())     {      
            System.out.print(itr.next() + " ");    
        }    
        System.out.println();     //Using Enhance for-loop
            
        for (String string: al)     {      
            System.out.print(string + " ");    
        }  
    }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections; 
class ArrayListBasics {  
    public static void main(String[] args)   {    
            ArrayList < String > al = new ArrayList < String > ();     // adding object in arraylist  
                
            al.add("Java");    
            al.add("C");    
            al.add("C++");    
            al.add("php");    
            al.add("python");    
            al.add("css");     // add        al.add("html");
                 // add at specific index        al.add(1, "Android");
                
            System.out.print("ArrayList :" + al);    
            System.out.println();     // remove from arraylist        al.remove("php");
                 // Size of ArrayList        System.out.print("Size of ArrayList after removing php :" + al.size());        System.out.println();System.out.println("Is java is in list :" + al.contains("Java"));
                 //get specific element        System.out.print("I want " + al.get(0));        System.out.println();
                 // list to array        Object[] a = al.toArray();
                
            System.out.print("Array :");    
            for (Object object: a)     {      
                System.out.print(object + " ");    
            }    
            System.out.println();     // change element        al.set(6, "Javascript");        System.out.print("ArrayList after replace:" + al);        System.out.println();
                 // sort list using Collections Class        Collections.sort(al);        System.out.print("ArrayList after sort :" + al);        System.out.println();
                 //Index        System.out.println("Index of Android :" + al.indexOf("Android"));
                 //clear whole list        al.clear();        System.out.print(al + " " + "Is list empty after clear :" + al.isEmpty());    }}import java.util.HashMap;
            public class HashMapBasics {  
                public static void main(String[] args)   {    
                    HashMap < Integer, String > hm = new HashMap < Integer, String > ();    
                    hm.put(1, "android");    
                    hm.put(2, "java");    
                    hm.put(3, "php");    
                    hm.put(4, "c++");    
                    hm.put(5, "javascript");    
                    hm.put(6, "html");    
                    System.out.println(hm + " ");    
                    System.out.println();    
                    System.out.println("Value at 1 is android :" + hm.containsKey(1));    
                    System.out.println("Value at 1 :" + hm.get(1));    
                    System.out.println("java is present :" + hm.containsValue("java"));     //remove         hm.remove(2);        hm.remove(6, "html");        System.out.println("Size after remove operation :" + hm.size());
                         //replace        hm.replace(5, "jquery");        hm.replace(4, "c++", "scala");        System.out.println("HashMap after replace " + hm);
                        
                    hm.clear();    
                    System.out.println(hm + " Is Map is empty " + hm.isEmpty());  
                }
            }
            import java.util.HashSet; 
            class HashSetBasic {  
                public static void main(String[] args)   {    
                    HashSet < String > hs = new HashSet < String > ();    
                    hs.add("Java");    
                    hs.add("Android");    
                    hs.add("Php");    
                    hs.add("Ajax");    
                    System.out.println(hs);    
                    hs.add("Python");    
                    System.out.println(hs);     // Can't add duplicate        System.out.println("Is Java added :" + hs.add("Java"));
                         // remove from HashSet        hs.remove("Php");
                         // Size of HashSet        System.out.print("Size of ArrayList after removing Php :" + hs.size());        System.out.println();
                        
                    System.out.println("Is java is in list :" + hs.contains("Java"));     // HashSet to array        Object[] a = hs.toArray();
                        
                    System.out.print("Array :");    
                    for (Object object: a)     {      
                        System.out.print(object + " ");    
                    }    
                    System.out.println();     //clear whole HashSet        hs.clear();        System.out.print(hs + " " + "Is HashSet empty after clear :" + hs.isEmpty());
                      
                }
            }
            import java.util.TreeSet;
            public class TreeSetBasics {  
                public static void main(String[] args)   {    
                        TreeSet < Integer > ts = new TreeSet < Integer > ();    
                        ts.add(12);    
                        ts.add(11);    
                        ts.add(14);    
                        ts.add(15);    
                        ts.add(10);    
                        ts.add(16);    
                        ts.add(17);    
                        System.out.println(ts);     // getting the ceiling value for 13        System.out.println("ceiling value :" + ts.ceiling(13));
                             //getting the floor value for 13        System.out.println("floor value :" + ts.floor(13));
                             //first element        System.out.println("first element :" + ts.first());
                             //last element        System.out.println("last element :" + ts.last());
                            
                        System.out.println("poll first element :" + ts.pollFirst());    
                        System.out.println("poll last element :" + ts.pollLast());    
                        System.out.println("TreeSet after polling :" + ts);     //the greatest element less than 12        System.out.println("lower element of 12 :" + ts.lower(12));System.out.println("higher element of 12 :" + ts.higher(12));
                            
                        System.out.println("Is 12 is present " + ts.contains(12));     //TreeSet to Array        Object[] a = ts.toArray();
                            
                        System.out.print("Array :");    
                        for (Object object: a)     {      
                            System.out.print(object + " ");    
                        }    
                        System.out.println();     // descending Set        System.out.print("descending Set" + ts.descendingSet());        System.out.println();
                             //remove from TreeSet        ts.remove(11);
                             //Size of TreeSet        System.out.println("size of TreeSet after removal of 11 :" + ts.size());
                             //clear whole TreeSet        ts.clear();        System.out.println(ts + " " + "Is TreeSet is empty :" + ts.isEmpty());    }}import java.util.HashMap;import java.util.Iterator;import java.util.Map;import java.util.Map.Entry;
                        public class HashMapTest {  
                            public static void main(String[] args)   {    
                                HashMap < Integer, String > hm = new HashMap < Integer, String > ();    
                                hm.put(1, "android");    
                                hm.put(2, "java");    
                                hm.put(3, "php");    
                                hm.put(4, "c++");    
                                hm.put(5, "javascript");    
                                System.out.println(hm + " ");    
                                System.out.println();     //following are the ways to access the HashMap        Iterator iterator = hm.entrySet().iterator();        while (iterator.hasNext())        {            Map.Entry mapEntry = (Map.Entry) iterator.next();            System.out.println("The key is: " + mapEntry.getKey()                                       + ",value is :" + mapEntry.getValue());        }        System.out.println();
                                    
                                for (Entry < Integer, String > entry: hm.entrySet())     {      
                                    System.out.println("Key : " + entry.getKey() + " Value : "                     + entry.getValue());    
                                }    
                                System.out.println();    
                                for (Object key: hm.keySet())     {      
                                    System.out.println("Key : " + key.toString() + " Value : "                     + hm.get(key));    
                                }  
                            }
                        }
                        import java.util.HashMap;
                        import java.util.Iterator;
                        import java.util.Map;
                        import java.util.Map.Entry;
                        public class HashMapTest {  
                            public static void main(String[] args)   {    
                                HashMap < Integer, String > hm = new HashMap < Integer, String > ();    
                                hm.put(1, "android");    
                                hm.put(2, "java");    
                                hm.put(3, "php");    
                                hm.put(4, "c++");    
                                hm.put(5, "javascript");    
                                System.out.println(hm + " ");    
                                System.out.println();     //following are the ways to access the HashMap        Iterator iterator = hm.entrySet().iterator();        while (iterator.hasNext())        {            Map.Entry mapEntry = (Map.Entry) iterator.next();            System.out.println("The key is: " + mapEntry.getKey()                                       + ",value is :" + mapEntry.getValue());        }        System.out.println();
                                    
                                for (Entry < Integer, String > entry: hm.entrySet())     {      
                                    System.out.println("Key : " + entry.getKey() + " Value : "                     + entry.getValue());    
                                }    
                                System.out.println();    
                                for (Object key: hm.keySet())     {      
                                    System.out.println("Key : " + key.toString() + " Value : "                     + hm.get(key));    
                                }  
                            }
                        }
                        import java.util.HashSet;
                        import java.util.Iterator; 
                        class HashSetTest {  
                            public static void main(String[] args)   {     //Creating HashSet of type String        HashSet<String> al = new HashSet<String>();        al.add("Java");        al.add("Android");        al.add("Php");        al.add("Ajax");
                                        
                                    System.out.println(al);     // Using Iterator        Iterator<String> itr = al.iterator();        while (itr.hasNext())        {            System.out.print(itr.next() + " ");        }
                                        
                                    System.out.println();     // Using enhance for-loop        for (String string : al)        {            System.out.print(string + " ");        }    }}import java.util.Iterator;import java.util.PriorityQueue;
                                    public class PriorityQueueTest {  
                                        public static void main(String[] args)   {    
                                            PriorityQueue < String > queue = new PriorityQueue < String > ();    
                                            queue.add("java");    
                                            queue.add("android");    
                                            queue.add("php");    
                                            queue.add("c++");    
                                            queue.add("css");    
                                            queue.add("javascript");    
                                            queue.add("python");    
                                            queue.add("ajax");    
                                            queue.offer("jquery");     //using iterator        Iterator itr = queue.iterator();        while (itr.hasNext())        {            System.out.print(itr.next() + " ");        }        System.out.println();
                                                 //Retrieves, but does not remove, the head of this queue        //throws Exception if Queue is empty        System.out.println("head:" + queue.element());
                                                 //Retrieves, but does not remove, the head of this queue        System.out.println("head:" + queue.peek());queue.remove();        //Retrieves and removes the head of this queue        queue.poll();        //remove specific value        queue.remove("css");
                                                
                                            System.out.println("Queue After remove and poll operation:" + queue);    
                                            System.out.println("Is python is present :" + queue.contains("python"));    
                                            Object a[] = queue.toArray();    
                                            for (Object object: a)     {      
                                                System.out.print(object + " ");    
                                            }    
                                            System.out.println();    
                                            queue.clear();    
                                            System.out.println(queue + " queue size :" + queue.size());  
                                        }
                                    }
                                    import java.util.ArrayList;
                                    import java.util.Collections;
                                    import java.util.Comparator;
                                    import java.util.HashMap;
                                    import java.util.List;
                                    import java.util.Map;
                                    import java.util.Set;
                                    import java.util.Map.Entry; 
                                    class SortMap {  
                                        public static void main(String a[])   {    
                                            Map < String, Integer > map = new HashMap < String, Integer > ();    
                                            map.put("VB.net", 20);    
                                            map.put("Java", 55);    
                                            map.put("Python", 7);    
                                            map.put("C++", 68);    
                                            map.put("Javascript", 26);    
                                            map.put("C", 86);    
                                            Set < Entry < String, Integer >> set = map.entrySet();    
                                            List < Entry < String, Integer >> list = new ArrayList < Entry < String, Integer >> (set);    
                                            Collections.sort(list, new Comparator < Map.Entry < String, Integer >> ()     {      
                                                public int compare(Map.Entry < String, Integer > o1, Map.Entry < String, Integer > o2)       {        
                                                    return (o2.getValue()).compareTo(o1.getValue());      
                                                }    
                                            });    
                                            System.out.println("In Descending Order:");    
                                            for (Map.Entry < String, Integer > entry: list)     {      
                                                System.out.println(entry.getValue() + ")\t" + entry.getKey());    
                                            }  
                                        }
                                    }
                                    import java.util.Map;
                                    import java.util.TreeMap;
                                    public class TreeMapTest {  
                                        public static void main(String[] args)   {     //TreeMap is sorted         TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
                                                
                                            hm.put(100, "java");    
                                            hm.put(102, "android");    
                                            hm.put(101, "php");    
                                            hm.put(103, "c++");    
                                            hm.put(104, "html");    
                                            System.out.println(hm);  
                                        }
                                    }
                                    import java.util.Iterator;
                                    import java.util.TreeSet;
                                    public class TreeSetTest {  
                                        public static void main(String[] args)   {    
                                                TreeSet < String > ts = new TreeSet < String > ();    
                                                ts.add("java");    
                                                ts.add("php");    
                                                ts.add("android");    
                                                ts.add("css");    
                                                System.out.println(ts);     //using Iterator        Iterator<String> itr = ts.iterator();        while (itr.hasNext())        {            System.out.print(itr.next() + " ");        }
                                                    
                                                System.out.println();     //Using enhanced for-loop        for (String string : ts)        {            System.out.print(string + " ");        }    }}