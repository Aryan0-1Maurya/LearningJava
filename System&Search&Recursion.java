import java.net.*; 
class IPAddress  {   
    public static void main(String args[])  {     
        try   {      
            InetAddress ipAddr = InetAddress.getLocalHost();      
            System.out.println("\nIP address of the machine: " + ipAddr.getHostAddress());    
        }  
        catch (UnknownHostException ex)   {      
            ex.printStackTrace();    
        }  
    }
}
class TowerHonoi {  
    public static void main(String[] args)   {    
        int nDisks = 3;    
        doTowers(nDisks, 'A', 'B', 'C');  
    }  
    public static void doTowers(int topN, char from,                 char inter, char to)   {    
        if (topN == 1)     {      
            System.out.println("Disk 1 from "                     + from + " to " + to);    
        }    
        else     {      
            doTowers(topN - 1, from, to, inter);      
            System.out.println("Disk "                     + topN + " from " + from + " to " + to);      
            doTowers(topN - 1, inter, from, to);    
        }  
    }
}
class TowerHonoi {  
    public static void main(String[] args)   {    
        int nDisks = 3;    
        doTowers(nDisks, 'A', 'B', 'C');  
    }  
    public static void doTowers(int topN, char from,                 char inter, char to)   {    
        if (topN == 1)     {      
            System.out.println("Disk 1 from "                     + from + " to " + to);    
        }    
        else     {      
            doTowers(topN - 1, from, to, inter);      
            System.out.println("Disk "                     + topN + " from " + from + " to " + to);      
            doTowers(topN - 1, inter, from, to);    
        }  
    }
}
import java.util.Scanner;
class LinearSearch {  
    public static void main(String args[])   {    
            int c, n, search, array[];    
            Scanner in = new Scanner(System.in);    
            System.out.println("Enter number of elements");    
            n = in .nextInt();    
            array = new int[n];    
            System.out.println("Enter " + n + " integers");    
            for (c = 0; c < n; c++)     {      
                array[c] = in .nextInt();    
            }    
            System.out.println("Enter value to find");    
            search = in .nextInt();    
            for (c = 0; c < n; c++)     {      
                if (array[c] == search) // Searching element is present             {                System.out.println(search + " is present at location " + (c + 1) + ".");                break;            }        }        if (c == n) // Searching element is absent             System.out.println(search + " is not present in array.");    }}
                    import java.util.*;
                class BinarySearch {  
                    public static void main(String[] args)   {    
                        int[] intArray = new int[10];    
                        int searchValue = 0, index;    
                        System.out.println("Enter 10 numbers");    
                        Scanner input = new Scanner(System.in);    
                        for (int i = 0; i < intArray.length; i++)     {      
                            intArray[i] = input.nextInt();    
                        }    
                        System.out.print("Enter a number to search for: ");    
                        searchValue = input.nextInt();    
                        index = binarySearch(intArray, searchValue);    
                        if (index != -1)     {      
                            System.out.println("Found at index: " + index);    
                        }    
                        else     {      
                            System.out.println("Not Found");    
                        }  
                    }  
                    static int binarySearch(int[] search, int find)   {    
                        int start, end, midPt;    
                        start = 0;    
                        end = search.length - 1;    
                        while (start <= end)     {      
                            midPt = (start + end) / 2;      
                            if (search[midPt] == find)       {        
                                return midPt;      
                            }      
                            else if (search[midPt] < find)       {        
                                start = midPt + 1;      
                            }      
                            else       {        
                                end = midPt - 1;      
                            }    
                        }    
                        return -1;  
                    }
                }