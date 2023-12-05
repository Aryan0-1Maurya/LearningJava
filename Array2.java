import java.util.*;
import java.text.DecimalFormat;
class DoubleMatrix {  
    public static void main(String[] args)   {    
        double[][] a;    
        double[] s;    
        int row, col, k = 0, i, j;    
        double sum = 0.0;    
        DecimalFormat f = new DecimalFormat("##.####");    
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter size of row and column");    
        row = sc.nextInt();    
        col = sc.nextInt();    
        a = new double[row][col];    
        s = new double[col];    
        System.out.println("Enter elements of matrix");    
        for (i = 0; i < row; i++)     {      
            for (j = 0; j < col; j++)       {        
                a[i][j] = sc.nextDouble();      
            }    
        }    
        System.out.println("Double Matrix is : ");    
        for (i = 0; i < row; i++)     {      
            for (j = 0; j < col; j++)       {        
                System.out.print(" " + a[i][j]);      
            }      
            System.out.println();    
        }     //sum of the elements of double matrix
            
        for (i = 0; i < col; i++)     {      
            for (j = 0; j < row; j++)       {        
                sum = sum + a[j][i];      
            }      
            s[k] = sum;      
            k++;      
            sum = 0;    
        }    
        for (i = 0; i < col; i++)     {      
            System.out.println("Sum of Column " + (i + 1) + " is : " + f.format(s[i]));    
        }  
    }
} //Sum of Numbers in an Array
import java.util.*;
class PassingArraystoFunction  {  
    public static void main(String[] args)    {    
        int[] a;    
        int size;         
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter size of array");    
        size = sc.nextInt();         
        a = new int[size];         
        System.out.println("Enter elements in the array");    
        for (int i = 0; i < size; i++)     {      
            a[i] = sc.nextInt();    
        }    
        System.out.println("The Elements of the array are : ");    
        for (int i = 0; i < size; i++)     {      
            System.out.print(a[i] + " ");    
        }     //Passing array to the function        addElements(a, size);    }        public static void addElements(int[] a , int size)    {        int sum = 0;                for(int i = 0; i < size; i++)        {            sum += a[i];        }
            
        System.out.println("\nSum of the elements of arrays is : " + sum);  
    }
}
import java.util.*;
class ClosestValue {  
    public static void main(String[] args)   {    
        int a[];    
        int find;    
        int closest = 0;    
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter size of array");    
        int size = sc.nextInt();    
        a = new int[size];    
        System.out.println("Enter numbers in array");    
        for (int i = 0; i < size; i++)     {      
            a[i] = sc.nextInt();    
        }    
        System.out.println("Numbers are : ");    
        for (int i = 0; i < size; i++)     {      
            System.out.print(a[i] + " ");    
        }    
        System.out.println();    
        System.out.println("Enter Number to find closest value");    
        find = sc.nextInt();    
        int distance = Math.abs(closest - find);    
        for (int i: a)     {      
            int distanceI = Math.abs(i - find);      
            if (distance > distanceI)       {        
                closest = i;        
                distance = distanceI;      
            }    
        }    
        System.out.println("Closest Value is : " + closest);  
    }
}
import java.io.*;
class MagicMatrix {  
    public static void main(String args[]) throws IOException   {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.print("Enter the size of the matrix : ");    
        int n = Integer.parseInt(br.readLine());    
        if (n > 5)       System.out.println("Enter a number between 1 to 5 ");    
        else     {      
            int A[][] = new int[n][n]; // Creating the Magic Matrix            int i, j, k, t;                     /*Initializing every cell of the matrix with 0 */            for (i = 0; i < n; i++)            {                for (j = 0; j < n; j++)                {                    A[i][j] = 0;                }            }
                   /* When the size of the matrix is Odd */       
            if (n % 2 != 0)       {        
                i = 0;        
                j = n / 2;        
                k = 1;        
                while (k <= n * n)         {          
                    A[i][j] = k++;          
                    i--; // Making one step upward                    j++; // Moving one step to the right
                              
                    if (i < 0 && j > n - 1) // Condition for the top-right corner element                    {                        i = i + 2;                        j--;                    }
                                  
                        if (i < 0)
                            i = n - 1;          
                    if (j > n - 1) // Wrapping around the column if it goes out of boundary                        j = 0;
                                  
                        if (A[i][j] > 0) // Condition when the cell is already filled                    {                        i = i + 2;                        j--;                    }                }            }            /* When the size of the matrix is even */            else            {                k = 1;                             /* Filling the matrix with natural numbers from 1 till n*n */                for (i = 0; i < n; i++)                {                    for (j = 0; j < n; j++)                    {                        A[i][j] = k++;                    }                }
                                     j = n - 1;
                    for (i = 0; i < n / 2; i++)         {           /* swapping corner elements of primary diagonal */           
                        t = A[i][i];          
                        A[i][i] = A[j][j];          
                        A[j][j] = t;                    /* swapping corner elements of secondary diagonal */           
                        t = A[i][j];          
                        A[i][j] = A[j][i];          
                        A[j][i] = t;          
                        j--;        
                    }      
                }       /* Printing the Magic matrix */       
                System.out.println("The Magic Matrix of size " + n + "x" + n + " is:");      
                for (i = 0; i < n; i++)       {        
                    for (j = 0; j < n; j++)         {          
                        System.out.print(A[i][j] + "\t");        
                    }        
                    System.out.println();      
                }    
            }  
        }
    }
    import java.util.Scanner;  
    class MatrixAddition {  
        Scanner scan; 
        int matrix1[][], matrix2[][], sum[][]; 
        int row, column;  
        void create() {  
            scan = new Scanner(System.in);  
            System.out.println("Matrix Addition");   // First Matrix Creation..  System.out.println("\nEnter number of rows & columns");  row = Integer.parseInt(scan.nextLine());  column = Integer.parseInt(scan.nextLine());    matrix1 = new int[row][column];  matrix2 = new int[row][column];  sum = new int[row][column];   System.out.println("Enter the data for first matrix :");   for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        matrix1[i][j] = scan.nextInt();   }  }    // Second Matrix Creation..  System.out.println("Enter the data for second matrix :");   for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        matrix2[i][j] = scan.nextInt();   }  } }void display() {    System.out.println("\nThe First Matrix is :");    for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        System.out.print("\t" + matrix1[i][j]);   }   System.out.println();  }    System.out.println("\n\nThe Second Matrix is :");    for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        System.out.print("\t" + matrix2[i][j]);   }   System.out.println();  } }  void add() {    for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        sum[i][j] = matrix1[i][j] + matrix2[i][j];   }  }System.out.println("\n\nThe Sum is :");    for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        System.out.print("\t" + sum[i][j]);   }   System.out.println();  } }} class MatrixAdditionExample {  public static void main(String args[]) {    MatrixAddition obj = new MatrixAddition();    obj.create();  obj.display();  obj.add(); }}import java.util.Scanner;
            class MatrixMultiplication {  
                public static void main(String args[])   {    
                    int m, n, p, q, sum = 0, c, d, k;    
                    Scanner in = new Scanner(System.in);    
                    System.out.println("Enter the number of rows and columns of first matrix");    
                    m = in .nextInt();    
                    n = in .nextInt();    
                    int first[][] = new int[m][n];    
                    System.out.println("Enter the elements of first matrix");    
                    for (c = 0; c < m; c++)     {      
                        for (d = 0; d < n; d++)       {        
                            first[c][d] = in .nextInt();      
                        }    
                    }    
                    System.out.println("Enter the number of rows and columns of second matrix");    
                    p = in .nextInt();    
                    q = in .nextInt();    
                    if (n != p)       System.out.println("Matrices with entered orders can't be multiplied with each other.");    
                    else     {      
                        int second[][] = new int[p][q];      
                        int multiply[][] = new int[m][q];      
                        System.out.println("Enter the elements of second matrix");      
                        for (c = 0; c < p; c++)       {        
                            for (d = 0; d < q; d++)         {          
                                second[c][d] = in .nextInt();        
                            }      
                        }
                        for (c = 0; c < m; c++)       {        
                            for (d = 0; d < q; d++)         {          
                                for (k = 0; k < p; k++)           {            
                                    sum = sum + first[c][k] * second[k][d];          
                                }          
                                multiply[c][d] = sum;          
                                sum = 0;        
                            }      
                        }      
                        System.out.println("Product of entered matrices:-");      
                        for (c = 0; c < m; c++)       {        
                            for (d = 0; d < q; d++)         {          
                                System.out.print(multiply[c][d] + "\t");        
                            }        
                            System.out.print("\n");      
                        }    
                    }  
                }
            }
            import java.util.Scanner;
            public class Matrices {  
                public static void main(String[] args) {      
                    Scanner scanner = new Scanner(System.in);        
                    System.out.print("Enter number of rows: ");    
                    int rows = scanner.nextInt();        
                    System.out.print("Enter number of columns: ");    
                    int columns = scanner.nextInt();        
                    System.out.println();    
                    System.out.println("Enter first matrix");    
                    int[][] a = readMatrix(rows, columns);        
                    System.out.println();    
                    System.out.println("Enter second matrix");    
                    int[][] b = readMatrix(rows, columns);        
                    int[][] sum = add(a, b);    
                    int[][] difference1 = subtract(a, b);    
                    int[][] difference2 = subtract(b, a);        
                    System.out.println();    
                    System.out.println("A + B =");    
                    printMatrix(sum);        
                    System.out.println();    
                    System.out.println("A - B =");    
                    printMatrix(difference1);        
                    System.out.println();    
                    System.out.println("B - A =");    
                    printMatrix(difference2);  
                }  
                public static int[][] readMatrix(int rows, int columns) {      
                    int[][] result = new int[rows][columns];    
                    Scanner s = new Scanner(System.in);        
                    for (int i = 0; i < rows; i++) {          
                        for (int j = 0; j < columns; j++) {              
                            result[i][j] = s.nextInt();
                        }    
                    }    
                    return result;  
                }  
                public static int[][] add(int[][] a, int[][] b) {      
                    int rows = a.length;    
                    int columns = a[0].length;    
                    int[][] result = new int[rows][columns];        
                    for (int i = 0; i < rows; i++) {          
                        for (int j = 0; j < columns; j++) {              
                            result[i][j] = a[i][j] + b[i][j];              
                        }    
                    }    
                    return result;  
                }  
                public static int[][] subtract(int[][] a, int[][] b) {      
                    int rows = a.length;    
                    int columns = a[0].length;    
                    int[][] result = new int[rows][columns];        
                    for (int i = 0; i < rows; i++) {          
                        for (int j = 0; j < columns; j++) {              
                            result[i][j] = a[i][j] - b[i][j];              
                        }    
                    }    
                    return result;  
                }  
                public static void printMatrix(int[][] matrix) {      
                    int rows = matrix.length;    
                    int columns = matrix[0].length;        
                    for (int i = 0; i < rows; i++) {          
                        for (int j = 0; j < columns; j++) {              
                            System.out.print(matrix[i][j] + " ");              
                        }      
                        System.out.println();    
                    }  
                }
            }
            import java.util.Scanner;  
            class Matrix_Subtraction {  
                Scanner scan; 
                int matrix1[][], matrix2[][], sub[][]; 
                int row, column;  
                void create() {  
                    scan = new Scanner(System.in);  
                    System.out.println("Matrix Subtraction");   // First Matrix Creation..  System.out.println("\nEnter number of rows & columns");  row = Integer.parseInt(scan.nextLine());  column = Integer.parseInt(scan.nextLine());    matrix1 = new int[row][column];  matrix2 = new int[row][column];  sub = new int[row][column];   System.out.println("Enter the data for first matrix :");   for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        matrix1[i][j] = scan.nextInt();   }  }    // Second Matrix Creation..  System.out.println("Enter the data for second matrix :");   for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        matrix2[i][j] = scan.nextInt();   }  } }  void display() {    System.out.println("\nThe First Matrix is :");    for(int i=0; i &lt row; i++) {      for(int j=0; j &lt column; j++) {        System.out.print("\t" + matrix1[i][j]);
                }  
                System.out.println(); 
            }  
            System.out.println("\n\nThe Second Matrix is :");  
            for (int i = 0; i & lt row; i++) {    
                for (int j = 0; j & lt column; j++) {    
                    System.out.print("\t" + matrix2[i][j]);  
                }  
                System.out.println(); 
            } 
        }  
        void sub() {  
            for (int i = 0; i & lt row; i++) {    
                for (int j = 0; j & lt column; j++) {    
                    sub[i][j] = matrix1[i][j] - matrix2[i][j];  
                } 
            }  
            System.out.println("\n\nThe Subtraction is :");  
            for (int i = 0; i & lt row; i++) {    
                for (int j = 0; j & lt column; j++) {    
                    System.out.print("\t" + sub[i][j]);  
                }  
                System.out.println(); 
            } 
        }
    } 
    class MatrixSubtractionExample {  
        public static void main(String args[]) {  
            Matrix_Subtraction obj = new Matrix_Subtraction();  
            obj.create(); 
            obj.display(); 
            obj.sub(); 
        }
    }
    class MergeArrayDemo { 
        public static void main(String args[])  { 
            Integer a[] = {
                1,
                2,
                3,
                4
            }; 
            Integer b[] = {
                5,
                6,
                7,
                0
            }; 
            Integer[] both = concat(a, b);   
            System.out.print("\nFirst Array : "); 
            for (int i = 0; i < a.length; i++)  {  
                System.out.print(a[i] + "\t"); 
            } 
            System.out.print("\nSecond Array : "); 
            for (int i = 0; i < b.length; i++)  {  
                System.out.print(b[i] + "\t"); 
            } 
            System.out.print("\nMerged Array : "); 
            for (int i = 0; i < both.length; i++)  {  
                System.out.print(both[i] + "\t"); 
            } 
        } 
        public static Integer[] concat(Integer[] a, Integer[] b)  { 
            int aLen = a.length; 
            int bLen = b.length; 
            Integer[] c = new Integer[aLen + bLen]; 
            System.arraycopy(a, 0, c, 0, aLen); 
            System.arraycopy(b, 0, c, aLen, bLen); 
            return c; 
        }
    }
    import java.util.*;
    class MiddleValue {  
        public static void main(String args[])   {    
            int[] a;    
            int i, j, n, sum = 0, swap, size;    
            double t;    
            Scanner sc = new Scanner(System.in);    
            System.out.println("Enter size of array");    
            size = sc.nextInt();    
            a = new int[size];    
            System.out.println("Enter numbers ");    
            for (i = 0; i < size; i++)     {      
                a[i] = sc.nextInt();    
            }    
            System.out.println("Numbers are : ");    
            for (i = 0; i < size; i++)     {      
                System.out.print(a[i] + " ");    
            }     //Sorting        for (i = 0; i < (size - 1); i++)        {            for (j = 0; j < (size - i - 1); j++)            {                if (a[j] > a[j + 1])                {                    swap = a[j];                    a[j] = a[j + 1];                    a[j + 1] = swap;                }            }        }
                
            System.out.println("\nNumbers in sorted order : ");    
            for (i = 0; i < size; i++)     {      
                System.out.print(a[i] + " ");    
            }     //Finding the Middle Value        if (size % 2 == 0)        {            n = (size + 1) / 2;            t = (a[n] + a[n - 1]) / 2.0;            System.out.println("\nMiddle Value is : " + t);        }
                
            else     {      
                System.out.println("\nMiddle Value is : " + a[size / 2]);    
            }  
        }
    }