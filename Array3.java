import java.util.*;
class MirrorMatrix {  
    public static void main(String[] args)   {    
        int row, column;    
        Scanner in = new Scanner(System.in);    
        System.out.print("Enter number of rows for matrix :");    
        row = in .nextInt();    
        System.out.print("Enter number of rows for matrix :");    
        column = in .nextInt();    
        int matrix[][] = new int[row][column];    
        System.out.println("Enter matrix : ");    
        for (int i = 0; i < row; i++)     {      
            for (int j = 0; j < column; j++)       {        
                matrix[i][j] = in .nextInt();      
            }    
        }    
        System.out.println("Mirror matrix : ");    
        for (int i = 0; i < row; i++)     {      
            for (int j = column - 1; j >= 0; j--)       {        
                System.out.print(matrix[i][j] + "\t");      
            }      
            System.out.println("");    
        }  
    }
}
class MissingNumberArray {  
    public static int count = 0;  
    public static int position = 0;  
    public static boolean flag = false;  
    public static void main(String[] args)   {    
        int a[] = {
            0,
            1,
            2,
            3,
            4,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            14,
            15,
            18,
            20,
            21,
            23
        };    
        findMissingNumbers(a, position);  
    }  
    private static void findMissingNumbers(int a[], int position)   {    
        if (position == a.length - 1)       return;    
        for (; position < a[a.length - 1]; position++)     {      
            if ((a[position] - count) != position)       {        
                System.out.println("Missing Number: " + (position + count));        
                flag = true;        
                count++;        
                break;      
            }    
        }    
        if (flag)     {      
            flag = false;      
            findMissingNumbers(a, position);    
        }  
    }
}
class MultiDimArrayExample {  
    public static void main(String[] args)   {    
            String[][] names = {
                {
                    "Mr. ",
                    "Mrs. ",
                    "Ms. "
                },
                {
                    "Smith",
                    "Jones"
                }
            };     // Mr. Smith        System.out.println(names[0][0] + names[1][0]);        // Ms. Jones        System.out.println(names[0][2] + names[1][1]);    }}int t = 0;        for (int x = 0; x < m; x++)        {            for (int y = 0; y < n; y++)            {                for (int i = 0; i < m; i++)                {                    for (int j = 0; j < n; j++)                    {                        if (A[i][j] > A[x][y])                        {                            t = A[x][y];                            A[x][y] = A[i][j];                            A[i][j] = t;                        }                    }                }            }        }
                 //Printing the sorted 2D Array        System.out.println("\nThe Sorted Array:");        for (int i = 0; i < m; i++)        {            for (int j = 0; j < n; j++)            {                System.out.print(A[i][j] + "\t");            }            System.out.println();        }    }}import java.io.*;
            class Employee {  
                String name;  
                int emp_id;  
                int salary;  
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
                public void get_data()   {    
                    try     {      
                        System.out.print("\nEnter name: ");      
                        name = br.readLine();      
                        System.out.print("\nEnter emp id: ");      
                        emp_id = Integer.parseInt(br.readLine());      
                        System.out.print("\nEnter salary: ");      
                        salary = Integer.parseInt(br.readLine());    
                    }    
                    catch (Exception e)     {      
                        System.out.print("\n" + e);    
                    }  
                }  
                public void display()   {    
                    System.out.print("\nName: " + name);    
                    System.out.print("\nEmp id: " + emp_id);    
                    System.out.print("\nSalary: " + salary);  
                }
            }
            class ObjectArray {  
                public static void main(String args[]) throws Exception   {    
                    int i;    
                    Employee emp[] = new Employee[5];    
                    for (i = 0; i < 5; i++)     {      
                        emp[i] = new Employee();    
                    }    
                    for (i = 0; i < 5; i++)     {      
                        System.out.print("\nEnter Employee Detail for employee " + (i + 1));      
                        emp[i].get_data();    
                    }    
                    for (i = 0; i < 5; i++)     {      
                        System.out.print("\nEmployee Details for employee " + (i + 1));      
                        emp[i].display();    
                    }  
                }
            }
            import java.io.*;
            class Employee {  
                String name;  
                int emp_id;  
                int salary;  
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
                public void get_data()   {    
                    try     {      
                        System.out.print("\nEnter name: ");      
                        name = br.readLine();      
                        System.out.print("\nEnter emp id: ");      
                        emp_id = Integer.parseInt(br.readLine());      
                        System.out.print("\nEnter salary: ");      
                        salary = Integer.parseInt(br.readLine());    
                    }    
                    catch (Exception e)     {      
                        System.out.print("\n" + e);    
                    }  
                }  
                public void display()   {    
                    System.out.print("\nName: " + name);    
                    System.out.print("\nEmp id: " + emp_id);    
                    System.out.print("\nSalary: " + salary);  
                }
            }
            class ObjectArray {  
                public static void main(String args[]) throws Exception   {    
                    int i;    
                    Employee emp[] = new Employee[5];    
                    for (i = 0; i < 5; i++)     {      
                        emp[i] = new Employee();    
                    }    
                    for (i = 0; i < 5; i++)     {      
                        System.out.print("\nEnter Employee Detail for employee " + (i + 1));      
                        emp[i].get_data();    
                    }    
                    for (i = 0; i < 5; i++)     {      
                        System.out.print("\nEmployee Details for employee " + (i + 1));      
                        emp[i].display();    
                    }  
                }
            }
            import java.io.*;
            class SortArray {  
                public static void main(String args[]) throws Exception   {    
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                        System.out.print("\nEnter the no. of rows: "); //enter number of rows        int m = Integer.parseInt(br.readLine());        System.out.print("\nEnter the no. of columns: "); //enter number of columns        int n = Integer.parseInt(br.readLine());
                            
                        int A[][] = new int[m][n]; //creating a 2D array
                             //enter elements in 2D Array        System.out.println();        for (int i = 0; i < m; i++)        {            for (int j = 0; j < n; j++)            {                System.out.print("Enter the elements: ");                A[i][j] = Integer.parseInt(br.readLine());            }        }
                             //Printing the original 2D Array        System.out.println("\nThe original array: ");        for (int i = 0; i < m; i++)        {            for (int j = 0; j < n; j++)            {                System.out.print(A[i][j] + "\t");            }            System.out.println();        }import java.util.*;
                        class ArraySortingDemo {  
                            public static void main(String[] args)   {    
                                    Scanner in = new Scanner(System.in);    
                                    System.out.print("Enter no. of elements to sort : ");    
                                    int size = in .nextInt();     // initializing unsorted int array        int iArr[] = new int[size];        System.out.println("Enter " + size + " integer(s) :");        for (int i = 0; i < size; i++)        {            iArr[i] = in.nextInt();        }
                                         // let us print all the elements available in list        for (int number : iArr)        {            System.out.println("Number = " + number);        }
                                         // sorting array        Arrays.sort(iArr);
                                         // let us print all the elements available in list        System.out.println("The sorted int array is:");        for (int number : iArr)        {            System.out.println("Number = " + number);        }    }}import java.io.*;import java.util.*;
                                    class SymmetricMatrix {  
                                        public static void main(String args[]) throws IOException   {    
                                            int m, n, c, d;    
                                            int matrix[][], transpose[][];    
                                            Scanner in = new Scanner(System.in);    
                                            System.out.println("Enter the number of rows and columns of matrix");    
                                            m = in .nextInt();    
                                            n = in .nextInt();    
                                            if (m == n)     {      
                                                matrix = new int[m][n];      
                                                System.out.println("Enter the elements of matrix");      
                                                for (c = 0; c < m; c++)       {        
                                                    for (d = 0; d < n; d++)         {          
                                                        matrix[c][d] = in .nextInt();        
                                                    }      
                                                }      
                                                transpose = new int[n][m];      
                                                for (c = 0; c < m; c++)       {        
                                                    for (d = 0; d < n; d++)         {          
                                                        transpose[d][c] = matrix[c][d];        
                                                    }      
                                                }
                                                System.out.println("Transpose of entered matrix:-");      
                                                for (c = 0; c < n; c++)       {        
                                                    for (d = 0; d < m; d++)         {          
                                                        System.out.print(transpose[c][d] + "\t");        
                                                    }        
                                                    System.out.print("\n");      
                                                }      
                                                for (c = 0; c < n; c++)       {        
                                                    for (d = 0; d < m; d++)         {          
                                                        if (matrix[c][d] != transpose[c][d])             break;        
                                                    }        
                                                    if (d != m)           break;      
                                                }      
                                                if (c == n)         System.out.println("Symmetric matrix.");    
                                            }    
                                            else       System.out.println("Please enter Sqare matrix");  
                                        }
                                    }
                                    import java.util.*;
                                    class TransposeMatrix {  
                                        public static void main(String s[])   {    
                                            int i, j;    
                                            Scanner sc = new Scanner(System.in);    
                                            System.out.print("\nEnter number of rows : ");    
                                            int r = sc.nextInt();    
                                            System.out.print("\nEnter number of columns : ");    
                                            int c = sc.nextInt();    
                                            int a[][] = new int[r][c];     // take input from user        System.out.println("\nEnter matrix elements : ");        for(i=0;i<r;i++)        {            for(j=0;j<c;j++)            {                a[i][j] = sc.nextInt();            }        }
                                                 // Logic for Transpose        for(i=0;i<r;i++)        {            for(j=0;j<c;j++)            {                if(i<j)                {                    int temp = a[j][i];                    a[j][i] = a[i][j];                    a[i][j] = temp;                }            }        }
                                                 // print Transpose matrix         System.out.println("\nTranspose Matrix :");        for(i=0;i<r;i++)        {            System.out.print("\n");            for(j=0;j<c;j++)            {                System.out.print(a[i][j] + "\t");            }        }
                                              
                                        }
                                    }