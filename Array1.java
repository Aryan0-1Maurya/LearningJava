import java.util.*;
class TwoDArray {  
    public static void main(String[] args)   {    
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter # of rows: ");    
        int rows = scanner.nextInt();    
        System.out.print("Enter # of cols: ");    
        int cols = scanner.nextInt();    
        int[][] a = new int[rows][cols];    
        System.out.print("Enter " + rows + "x" + cols + "=" + (rows * cols) + " integers: ");    
        for (int i = 0; i < rows; i++)     {      
            for (int j = 0; j < cols; j++)       {        
                a[i][j] = scanner.nextInt();      
            }    
        }    
        System.out.println("Here are those " + (rows * cols) + " integers in a " + rows + "x" + cols + " 2d-array:");    
        System.out.println(Arrays.deepToString(a));  
    }
}
import java.util.*;
class AddTwoMatrix {  
    int m, n;  
    int first[][] = new int[m][n];  
    int second[][] = new int[m][n];  
    AddTwoMatrix(int[][] first, int[][] second, int m, int n)   {    
        this.first = first;    
        this.second = second;    
        this.m = m;    
        this.n = n;  
    }  
    public static void main(String[] args)   {    
        int m, n, c, d;    
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter the number of rows and columns of matrix");    
        m = in .nextInt();    
        n = in .nextInt();    
        int first[][] = new int[m][n];    
        int second[][] = new int[m][n];    
        System.out.println("Enter the elements of first matrix");    
        for (c = 0; c < m; c++)     {      
            for (d = 0; d < n; d++)       {        
                first[c][d] = in .nextInt();      
            }    
        }    
        System.out.println("Enter the elements of second matrix");    
        for (c = 0; c < m; c++)     {      
            for (d = 0; d < n; d++)       {        
                second[c][d] = in .nextInt();      
            }    
        }
        System.out.println("\nElements of First matrix is : ");    
        for (c = 0; c < m; c++)     {      
            for (d = 0; d < n; d++)       {        
                System.out.print(first[c][d] + "\t");      
            }      
            System.out.println();    
        }    
        System.out.println("\nElements of Second matrix is : ");    
        for (c = 0; c < m; c++)     {      
            for (d = 0; d < n; d++)       {        
                System.out.print(second[c][d] + "\t");      
            }      
            System.out.println();    
        }    
        AddTwoMatrix a = new AddTwoMatrix(first, second, m, n);     //call by reference        a.addmatrix(a); //Passing Object    }
           //Function for Adding two matrix and storing in third matrix     public void addmatrix(AddTwoMatrix a)    {        int c, d;        int sum[][] = new int[a.m][a.n];
            
        for (c = 0; c < a.m; c++)     {      
            for (d = 0; d < a.n; d++)       {        
                sum[c][d] = a.first[c][d] + a.second[c][d];      
            }    
        }    
        System.out.println("\nSum of the two matrices is : ");    
        for (c = 0; c < a.m; c++)     {      
            for (d = 0; d < a.n; d++)       {        
                System.out.print(sum[c][d] + "\t");      
            }      
            System.out.println();    
        }  
    }
}
class ArrayCopyExample {  
    public static void main(String[] args)   {    
        char[] copyFrom = {
            'd',
            'e',
            'c',
            'a',
            'f',
            'f',
            'e',
            'i',
            'n',
            'a',
                          't',
            'e',
            'd'
        };    
        char[] copyTo = new char[7];    
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);    
        System.out.println(new String(copyTo));  
    }
}
class ArrayCopyOfRangeExample { 
    public static void main(String[] args) { 
        char[] copyFrom = {
            'd',
            'e',
            'c',
            'a',
            'f',
            'f',
            'e',
            'i',
            'n',
            'a',
              't',
            'e',
            'd'
        }; 
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); 
        System.out.println(new String(copyTo)); 
    }
}
class ArrayExample {  
    public static void main(String[] args)   {     // declares an array of integers        int[] anArray;
             // allocates memory for 10 integers        anArray = new int[10];
             // initialize first element        anArray[0] = 100;        // initialize second element        anArray[1] = 200;        // and so forth        anArray[2] = 300;        anArray[3] = 400;        anArray[4] = 500;        anArray[5] = 600;        anArray[6] = 700;        anArray[7] = 800;        anArray[8] = 900;        anArray[9] = 1000;
            
        System.out.println("Element at index 0: " + anArray[0]);    
        System.out.println("Element at index 1: " + anArray[1]);    
        System.out.println("Element at index 2: " + anArray[2]);    
        System.out.println("Element at index 3: " + anArray[3]);    
        System.out.println("Element at index 4: " + anArray[4]);    
        System.out.println("Element at index 5: " + anArray[5]);    
        System.out.println("Element at index 6: " + anArray[6]);    
        System.out.println("Element at index 7: " + anArray[7]);    
        System.out.println("Element at index 8: " + anArray[8]);    
        System.out.println("Element at index 9: " + anArray[9]);  
    }
}
class ArrayOfArraysAnimalDemo {  
    public static void main(String[] args)   {    
        String[][] animals = {
            {
                "DanaDog",
                "WallyDog",
                "JessieDog",
                "AlexisDog",
                "LuckyDog"
            },
            {
                "BibsCat",
                "DoodleCat",
                "MillieCat",
                "SimonCat"
            },
            {
                "ElyFish",
                "CloieFish",
                "GoldieFish",
                "OscarFish",
                "ZippyFish",
                "TedFish"
            },
            {
                "RascalMule",
                "GeorgeMule",
                "GracieMule",
                "MontyMule",
                "BuckMule",
                "RosieMule"
            }
        };    
        for (int i = 0; i < animals.length; i++)     {      
            System.out.print(animals[i][0] + ": ");      
            for (int j = 1; j < animals[i].length; j++)       {        
                System.out.print(animals[i][j] + " ");      
            }      
            System.out.println();    
        }  
    }
}
class ArrayOperations {  
    public static void main(String[] args)   {    
        double[] myList = {
            1.9,
            2.9,
            3.4,
            3.5
        };     // Print all the array elements        for (int i = 0; i < myList.length; i++)        {            System.out.println(myList[i] + " ");        }        // Summing all elements        double total = 0;        for (int i = 0; i < myList.length; i++)        {            total += myList[i];        }
            
        System.out.println("Total is " + total);     // Finding the largest element        double max = myList[0];        for (int i = 1; i < myList.length; i++)        {            if (myList[i] > max)                max = myList[i];        }
            
        System.out.println("Max is " + max);  
    }
}
import java.util.Arrays;
class ArraySort {   // This program is the example of array sorting    public static void main(String[] args)    {        // TODO Auto-generated method stub        // initializing unsorted array        String iArr[] = {"Programming", "Hub", "Alice", "Wonder", "Land"};
         // sorting array        Arrays.sort(iArr);
         // let us print all the elements available in list        System.out.println("The sorted array is:");        for (int i = 0; i < iArr.length; i++)        {            System.out.println(iArr[i]);        }    }}import java.io.*;
    class ArrayAverage {  
        public static void main(String[] args)   {     //define an array        int[] numbers = new int[]{10, 20, 15, 25, 16, 60, 100};
                
            int sum = 0;    
            for (int i = 0; i < numbers.length; i++)     {      
                sum = sum + numbers[i];    
            }    
            double average = sum / numbers.length;    
            System.out.println("Sum of array elements is : " + sum);    
            System.out.println("Average value of array elements is : " + average);  
        }
    }
    import java.util.*;
    class ArrayBasic {  
        public static void main(String[] args)   {    
            int[] arr;    
            int size, i;    
            Scanner sc = new Scanner(System.in);    
            System.out.println("Enter size of array");    
            size = sc.nextInt();    
            arr = new int[size];    
            System.out.println("\nEnter array elements");    
            for (i = 0; i < size; i++)     {      
                arr[i] = sc.nextInt();    
            }    
            System.out.println("\nElements in the Array are : ");    
            for (i = 0; i < size; i++)     {      
                System.out.print(arr[i] + " ");    
            }  
        }
    }
    import java.util.Scanner;  
    class Matrix_Create { 
        Scanner scan; 
        int matrix[][]; 
        int row, column;  
        void create() {   
            scan = new Scanner(System.in);   
            System.out.println("Matrix Creation");   
            System.out.println("\nEnter number of rows :"); 
            row = Integer.parseInt(scan.nextLine());   
            System.out.println("Enter number of columns :"); 
            column = Integer.parseInt(scan.nextLine());   
            matrix = new int[row][column]; 
            System.out.println("Enter the data :");  
            for (int i = 0; i < row; i++) {    
                for (int j = 0; j   < column; j++) {     
                    matrix[i][j] = scan.nextInt();   
                } 
            } 
        } 
        void display() {   
            System.out.println("\nThe Matrix is :");   
            for (int i = 0; i < row; i++) {    
                for (int j = 0; j < column; j++) {     
                    System.out.print("\t" + matrix[i][j]);  
                }  
                System.out.println(); 
            } 
        }
    }  
    class CreateAndDisplayMatrix { 
        public static void main(String    args[]) {   
            Matrix_Create obj = new Matrix_Create();   
            obj.create(); 
            obj.display(); 
        }
    }
    class DisplayArrayForEach {  
        public static void main(String[] args)   {    
                double[] myList = {
                    1.9,
                    2.9,
                    3.4,
                    3.5
                };     // Print all the array elements        for (double element : myList)        {            System.out.println(element);        }    }}