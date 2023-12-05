import java.io.*;
import java.math.*;
class ResultantPalindrome {  
    static int i = 1;  
    public void addNum(String num)   {    
        BigInteger a, b, c;    
        a = new BigInteger(num);    
        b = new BigInteger(reverse(num));    
        System.out.println("Step " + (i++) + "\t->\t" + a + " + " + b + " = " + (a.add(b)));    
        resultantPalindrome(a.add(b) + "");  
    }  
    public void resultantPalindrome(String num)   {    
        if (num.equals(reverse(num)))     {      
            System.out.println("\nResultant Palindrome : " + num);    
        }    
        else     {      
            addNum(num);    
        }  
    }  
    public String reverse(String num)   {    
        StringBuffer sb = new StringBuffer(num);    
        return sb.reverse().toString();  
    }  
    public static void main(String args[])   {    
        InputStreamReader istream = new InputStreamReader(System.in);    
        BufferedReader num = new BufferedReader(istream);    
        String palindrome = null;    
        System.out.print("Enter number for Resultant Palindrome : ");    
        try     {      
            palindrome = num.readLine();    
        }    
        catch (IOException e)     {      
            System.out.println(e.getMessage());    
        }    
        System.out.println("");    
        ResultantPalindrome rp = new ResultantPalindrome();    
        rp.resultantPalindrome(palindrome);  
    }
}
class FloorValue {  
    public static void main(String a[])   {    
        System.out.println("Floor value of 50: " + Math.floor(50));    
        System.out.println("Floor value of 23.8: " + Math.floor(23.8));    
        System.out.println("Floor value of -46.5: " + Math.floor(-46.5));  
    }
}
import java.util.Scanner;
class Greatest {  
    public static void main(String argn[])   {    
        Scanner data = new Scanner(System.in);    
        int num, i, temp, max;     // Reading numbers want to be read        System.out.print("Enter the range:");        num = data.nextInt();
            
        System.out.println("Enter " + num + " number");     // Reading 1st number        max = data.nextInt();
             // Reading other number        for (i = 1; i < num; i++)        {            temp = data.nextInt();            if (temp < max)                continue;            else                // largest number                max = temp;        }
            
        System.out.println("Largest Number is " + max);  
    }
}
import java.util.Scanner;
class HailStone {  
    static Scanner MyScanner = new Scanner(System.in);  
    public static void main(String[] args)   {    
            System.out.println("This program will generate the HailStone sequence. ");    
            System.out.print("Enter a number: ");    
            int num = MyScanner.nextInt();    
            while (num > 1)     {      
                if (num % 2 == 0)       {        
                    num /= 2; //Dividing num by 2 if it is even                System.out.print(num + "\t");            }            else            {                num = (num * 3) + 1; // Adding num*3 + 1 to num if the num is odd                System.out.print(num + "\t");            }        }    }}import java.io.*;
                    class HappyNumber {  
                        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
                        int n;  
                        HappyNumber()   {    
                            n = 0;  
                        }  
                        void getnum(int num)   {    
                            n = num;  
                        }  
                        int sum_sq_digits(int x)   {    
                            if (x == 0)       return 0;    
                            else     {      
                                int d = x % 10;      
                                return (d * d + sum_sq_digits(x / 10));    
                            }  
                        }  
                        void isHappyNumber()   {    
                            int a = sum_sq_digits(n);    
                            while (a > 9)     {      
                                a = sum_sq_digits(a);    
                            }    
                            if (a == 1)       System.out.print(n + " is a Happy Number");    
                            else       System.out.print(n + " is not a Happy Number");  
                        }  
                        public static void main(String args[]) throws IOException   {    
                            HappyNumber ob = new HappyNumber();    
                            System.out.print("Enter any number: ");    
                            int b = Integer.parseInt(br.readLine());    
                            ob.getnum(b);    
                            ob.isHappyNumber();  
                        }
                    }
                    import java.util.*;
                    class HCFandLCM {  
                        public static void main(String Args[])   {    
                            System.out.println("Enter 2 numbers");    
                            Scanner sc = new Scanner(System.in);    
                            int m = sc.nextInt();    
                            int n = sc.nextInt();    
                            int h = 1;    
                            int p = m * n;    
                            for (int i = 2; i < p; i++)     {      
                                if ((m % i == 0) && (n % i == 0))       {        
                                    h = i;      
                                }    
                            }    
                            int l = p / h;    
                            System.out.println("HCF=" + h + " and LCM=" + l);  
                        }
                    }
                    import java.util.*;
                    class KaprekarNumber {  
                        int digitcount(int x)   {    
                            int digit = 0;    
                            while (x != 0)     {      
                                digit++;      
                                x /= 10;    
                            }    
                            return digit;  
                        }  
                        public static void main(String args[])   {    
                            int n, quo, rem, sq, temp;    
                            int digits;    
                            Scanner sc = new Scanner(System.in);    
                            KaprekarNumber ob = new KaprekarNumber();    
                            System.out.print("Enter number : ");    
                            n = sc.nextInt();    
                            sq = n * n;    
                            digits = ob.digitcount(n * n);    
                            quo = sq / (int) Math.pow(10, digits / 2);    
                            rem = sq % (int) Math.pow(10, digits / 2);    
                            temp = quo + rem;    
                            if (temp == n)       System.out.print("\nIt is a Kaprekar number \n");    
                            else       System.out.print("\nNot a kaprekar number");  
                        }
                    }
                    import java.io.*;
                    class KeithNumber {  
                        public static void main(String args[]) throws IOException   {    
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                System.out.print("Enter the number : ");    
                                int n = Integer.parseInt(br.readLine());    
                                int copy = n;    
                                String s = Integer.toString(n);     //finding the number of digits (d) in the number        int d = s.length();
                                     //array for storing the terms of the series        int arr[] = new int[n];
                                    
                                for (int i = d - 1; i >= 0; i--)     {       //storing the digits of the number in the array            arr[i] = copy % 10;            copy = copy / 10;        }
                                        
                                    int i = d, sum = 0;     //finding the sum till it is less than the number        while (sum < n)        {            sum = 0;            //loop for generating and adding the previous 'd' terms            for (int j = 1; j <= d; j++)            {                sum = sum + arr[i - j];            }            //storing the sum in the array            arr[i] = sum;            i++;        }
                                         //if sum is equal to the number, then it is a Keith number        if (sum == n)            System.out.println(n + " is a Keith Number");        else            System.out.println(n + " is a not a Keith Number");    }}import java.io.*;
                                    class KrishnaMurthyNumber {  
                                        int fact(int n)   {    
                                            int i, fact = 1;    
                                            for (i = 1; i <= n; i++)     {      
                                                fact = fact * i;    
                                            }    
                                            return fact;  
                                        }  
                                        public static void main(String[] arg) throws IOException   {    
                                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                            System.out.print("Enter the number : ");    
                                            int number = Integer.parseInt(br.readLine());    
                                            KrishnaMurthyNumber kmn = new KrishnaMurthyNumber();    
                                            if (kmn.isKrishnaMurthy(number))     {      
                                                System.out.println(number + " is a Krishna Murthy Number");    
                                            }    
                                            else     {      
                                                System.out.println(number + " is not a Krishna Murthy Number");    
                                            }  
                                        }  
                                        boolean isKrishnaMurthy(int number)   {    
                                            int temp, k = 0;    
                                            int n = number;    
                                            while (number > 0)     {      
                                                temp = number % 10;      
                                                k = k + fact(temp);      
                                                number = number / 10;    
                                            }    
                                            if (k == n)     {      
                                                return true;    
                                            }    
                                            else     {      
                                                return false;    
                                            }  
                                        }
                                    }
                                    import java.util.Scanner;
                                    class LargestOfThreeNumbers {  
                                        public static void main(String args[])   {    
                                            int x, y, z;    
                                            System.out.println("Enter three integers ");    
                                            Scanner in = new Scanner(System.in);    
                                            x = in .nextInt();    
                                            y = in .nextInt();    
                                            z = in .nextInt();    
                                            if (x > y && x > z)       System.out.println("First number is largest.");    
                                            else if (y > x && y > z)       System.out.println("Second number is largest.");    
                                            else if (z > x && z > y)       System.out.println("Third number is largest.");    
                                            else       System.out.println("Entered numbers are not distinct.");  
                                        }
                                    }
                                    import java.io.*;
                                    class LargestSmallest {  
                                        public static void main(String args[]) throws Exception   {    
                                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                            System.out.print("\nEnter number of elements: ");    
                                            int num = Integer.parseInt(br.readLine());    
                                            int arr[] = new int[num];    
                                            System.out.println("\nEnter " + num + " elements: ");    
                                            for (int i = 0; i < num; i++)     {      
                                                arr[i] = Integer.parseInt(br.readLine());    
                                            }    
                                            for (int i = 0; i < (num - 1); i++)     {      
                                                for (int j = 0; j <= i; j++)       {        
                                                    if (arr[j] > arr[j + 1])         {          
                                                        int temp = arr[j];          
                                                        arr[j] = arr[j + 1];          
                                                        arr[j + 1] = temp;        
                                                    }      
                                                }    
                                            }    
                                            System.out.print("\nHighest number: " + arr[num - 1]);    
                                            System.out.print("\nSmallest number: " + arr[0]);    
                                            System.out.println();  
                                        }
                                    } /*In Lucas Series, each subsequent number is the sum of the previous two, and here the first two numbers are 2 and 1.*/
                                    import java.util.*;
                                    class LucasSeries {  
                                        public static void main(String[] args)   {    
                                            int num1, num2, limit, add;    
                                            Scanner sc = new Scanner(System.in);    
                                            System.out.println("Enter the limit of elements");    
                                            limit = sc.nextInt();    
                                            num1 = 2;    
                                            num2 = 1;    
                                            System.out.println("\nLucas Series:");    
                                            while (limit >= num1)     {      
                                                System.out.print(num1 + " ");      
                                                add = num1 + num2;      
                                                num1 = num2;      
                                                num2 = add;    
                                            }  
                                        }
                                    }
                                    import java.io.*;
                                    class MagicNumber {  
                                        private int input() throws Exception   {    
                                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                            System.out.print("Enter any number : ");    
                                            return Integer.parseInt(br.readLine());  
                                        }  
                                        public boolean isMagic(int n)   {    
                                            int sum = 0, flag, d = 0;    
                                            do     {      
                                                flag = 0;      
                                                while (n % 10 == 0)       {        
                                                    n /= 10;      
                                                }      
                                                while (n % 10 != 0 || n > 0)       {        
                                                    sum += (n % 10);        
                                                    n /= 10;      
                                                }      
                                                if (sum >= 10)       {        
                                                    n = sum;        
                                                    sum = 0;      
                                                }      
                                                else         flag = 1;    
                                            }     while (flag == 0);    
                                            if (sum == 1)       return true;    
                                            else       return false;  
                                        }  
                                        public static void main(String args[]) throws Exception   {    
                                            MagicNumber mn = new MagicNumber();    
                                            int num = mn.input();    
                                            if (mn.isMagic(num))       System.out.println(num + " is a Magic Number");    
                                            else       System.out.println(num + " is not a Magic Number");  
                                        }
                                    }
                                    import java.io.*;
                                    class NeonNumber {  
                                        public static void main(String args[]) throws IOException   {    
                                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                            int num;    
                                            int square;    
                                            int sum = 0;    
                                            System.out.print("Enter any number : ");    
                                            num = Integer.parseInt(br.readLine());    
                                            square = num * num; //squaring the number 
                                                
                                            String sqs = Integer.toString(square);    
                                            for (int i = 0; i < sqs.length(); i++)     {      
                                                sum += Integer.parseInt(sqs.substring(i, i + 1));    
                                            }    
                                            if (sum == num) //checking if the sum of the square is equal to the number entered             System.out.println(num + " is a Neon Number");        else            System.out.println(num + " is not a Neon number");
                                              
                                        }
                                    }
                                    import java.util.*;
                                    class Niven_number {  
                                        public static void main(String[] args)   {    
                                            Scanner sc = new Scanner(System.in);    
                                            System.out.print("Enter a number : ");    
                                            int n = sc.nextInt();    
                                            int c = n, d, sum = 0;     //finding sum of digits        while (c > 0)        {            d = c % 10;            sum = sum + d;            c = c / 10;        }
                                                
                                            if (n % sum == 0)       System.out.println("\n" + n + " is a Niven Number.");    
                                            else       System.out.println("\n" + n + " is not a Niven Number.");  
                                        }
                                    }
                                    import java.util.Scanner;
                                    class Palindrome {  
                                        public static void main(String args[])   {    
                                            int number = 0;    
                                            int reverse = 0;    
                                            int numCopy = 0;    
                                            System.out.println("Enter a number to check if it is a Palindrome");    
                                            Scanner in = new Scanner(System.in);    
                                            number = in .nextInt();    
                                            numCopy = number;    
                                            while (numCopy > 0)     {      
                                                int digit = numCopy % 10;      
                                                numCopy = numCopy / 10;      
                                                reverse = (reverse * 10) + digit;    
                                            }    
                                            if (number == reverse)       System.out.println("The number " + number + " is a Palindrome.");    
                                            else       System.out.println("The number " + number + " is not a Palindrome.");  
                                        }
                                    }
                                    class PalindromePrime {  
                                        public static void main(String[] args)   {    
                                            int count = 1;    
                                            System.out.println("Palindrome Primes are:\n");    
                                            for (int i = 2;; i++)     {      
                                                if ((isPrime(i)) && (isPalindrome(i)))       {        
                                                    System.out.print(i + " ");        
                                                    if (count % 10 == 0)         {          
                                                        System.out.println();        
                                                    }        
                                                    if (count == 20)         {          
                                                        break;        
                                                    }        
                                                    count++;      
                                                }    
                                            }  
                                        }  
                                        public static boolean isPrime(int num)   {    
                                            if ((num == 1) || (num == 2))     {      
                                                return true;    
                                            }    
                                            for (int i = 2; i <= num / 2; i++)     {      
                                                if (num % i == 0)       {        
                                                    return false;      
                                                }    
                                            }    
                                            return true;  
                                        }  
                                        static int reversal(int num)   {    
                                            int result = 0;    
                                            while (num != 0)     {      
                                                int lastDigit = num % 10;      
                                                result = result * 10 + lastDigit;      
                                                num /= 10;    
                                            }    
                                            return result;  
                                        }  
                                        static boolean isPalindrome(int num)   {    
                                            return num == reversal(num);  
                                        }
                                    }
                                    import java.io.*;
                                    class PerfectNumber {  
                                        public static void main(String args[]) throws IOException   {    
                                            int n, s = 0;    
                                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                            System.out.print("Entre a number : ");    
                                            n = Integer.parseInt(br.readLine());    
                                            for (int x = 1; x < n; x++)     {      
                                                if (n % x == 0)         s = s + x;    
                                            }    
                                            if (s == n)       System.out.println("It is perfect number");    
                                            else       System.out.println("It is not perfect number");  
                                        }
                                    }
                                    import java.io.*;
                                    class PrimeFactors {  
                                        private boolean prime(int a)   {    
                                            boolean b = true;    
                                            for (int i = 2; i <= (a / 2); i++)     {      
                                                if (a % i == 0)         b = false;    
                                            }    
                                            return b;  
                                        }  
                                        public static void main(String args[]) throws IOException   {    
                                            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    
                                            System.out.print("Enter the Number: ");    
                                            int a = Integer.parseInt( in .readLine());    
                                            PrimeFactors o = new PrimeFactors();    
                                            System.out.print("Prime Factors of " + a + " are : ");    
                                            for (int i = 1; i <= (a / 2); i++)     {      
                                                if (a % i == 0)       {        
                                                    boolean b = o.prime(i);        
                                                    if (b == true)           System.out.print(i + " ");      
                                                }    
                                            }  
                                        }
                                    }
                                    import java.util.*;
                                    class PrimeNumbers {  
                                        public static void main(String args[])   {    
                                            int n, status = 1, num = 3;    
                                            Scanner in = new Scanner(System.in);    
                                            System.out.println("Enter the number of prime numbers you want");    
                                            n = in .nextInt();    
                                            if (n >= 1)     {      
                                                System.out.println("First " + n + " prime numbers are :-");      
                                                System.out.println(2);    
                                            }    
                                            for (int count = 2; count <= n;)     {      
                                                for (int j = 2; j <= Math.sqrt(num); j++)       {        
                                                    if (num % j == 0)         {          
                                                        status = 0;          
                                                        break;        
                                                    }      
                                                }      
                                                if (status != 0)       {        
                                                    System.out.println(num);        
                                                    count++;      
                                                }      
                                                status = 1;      
                                                num++;    
                                            }  
                                        }
                                    }
                                    import java.util.Scanner;
                                    class PrimorialNumber {  
                                        public static void main(String[] args)   {    
                                            int num;    
                                            System.out.print("Enter a number : ");    
                                            Scanner in = new Scanner(System.in);    
                                            num = in .nextInt();    
                                            int res = 2, flag = 0;    
                                            String str = "2";    
                                            for (int i = 3; i <= num; i++)     {      
                                                flag = 0;      
                                                for (int j = 2; j < i; j++)       {        
                                                    if (i % j == 0)         {          
                                                        flag = 1;          
                                                        break;        
                                                    }      
                                                }      
                                                if (flag != 1)       {        
                                                    res *= i;        
                                                    str = str + "*" + i;      
                                                }    
                                            }    
                                            System.out.println(num + "#= " + str + "=" + res);  
                                        }
                                    }
                                    import java.util.*;
                                    class RandomNumber {  
                                        public static void main(String args[])   {    
                                                Random r = new Random();     //Printing 10 Random number between 0 to 1000        for (int i = 0; i < 9; i++)        {            System.out.println(r.nextInt(1000));        }    }}import java.util.Scanner;
                                                class ReverseNum {  
                                                    public static void main(String[] args)   {    
                                                        int reverse = 0, number = 0;    
                                                        Scanner sc = new Scanner(System.in);    
                                                        System.out.println("Enter number to Reverse:");    
                                                        number = sc.nextInt();    
                                                        sc.close();    
                                                        while (number != 0)     {      
                                                            reverse = (reverse * 10) + (number % 10);      
                                                            number = number / 10;    
                                                        }    
                                                        System.out.println("Result: " + reverse);  
                                                    }
                                                }
                                                import java.io.*;
                                                class RomanToDecimal {  
                                                    public static void romanToDecimal(java.lang.String romanNumber)   {    
                                                        int decimal = 0;    
                                                        int lastNumber = 0;    
                                                        String romanNumeral = romanNumber.toUpperCase();    
                                                        for (int x = romanNumeral.length() - 1; x >= 0; x--)     {      
                                                            char convertToDecimal = romanNumeral.charAt(x);      
                                                            switch (convertToDecimal)       {        
                                                                case 'M':
                                                                              decimal = processDecimal(1000, lastNumber, decimal);          
                                                                    lastNumber = 1000;          
                                                                    break;        
                                                                case 'D':
                                                                              decimal = processDecimal(500, lastNumber, decimal);          
                                                                    lastNumber = 500;          
                                                                    break;        
                                                                case 'C':
                                                                              decimal = processDecimal(100, lastNumber, decimal);          
                                                                    lastNumber = 100;          
                                                                    break;        
                                                                case 'L':
                                                                              decimal = processDecimal(50, lastNumber, decimal);          
                                                                    lastNumber = 50;          
                                                                    break;        
                                                                case 'X':
                                                                              decimal = processDecimal(10, lastNumber, decimal);
                                                                    lastNumber = 10;          
                                                                    break;        
                                                                case 'V':
                                                                              decimal = processDecimal(5, lastNumber, decimal);          
                                                                    lastNumber = 5;          
                                                                    break;        
                                                                case 'I':
                                                                              decimal = processDecimal(1, lastNumber, decimal);          
                                                                    lastNumber = 1;          
                                                                    break;      
                                                            }    
                                                        }    
                                                        System.out.println("Decimal number : " + decimal);  
                                                    }  
                                                    public static int processDecimal(int decimal, int lastNumber, int lastDecimal)   {    
                                                        if (lastNumber > decimal)     {      
                                                            return lastDecimal - decimal;    
                                                        }    
                                                        else     {      
                                                            return lastDecimal + decimal;    
                                                        }  
                                                    }  
                                                    public static void main(java.lang.String args[])   {    
                                                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                                        System.out.print("Enter Roman Number : ");    
                                                        String roman = null;    
                                                        try     {      
                                                            roman = br.readLine();    
                                                        }    
                                                        catch (IOException e)     {      
                                                            System.out.println(e.getMessage());    
                                                        }    
                                                        romanToDecimal(roman);  
                                                    }
                                                }
                                                import java.io.*;
                                                class SpecialNumber {  
                                                    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
                                                    static int num;  
                                                    private void input() throws Exception   {    
                                                        System.out.print("Enter the Number to check for Special Number : ");    
                                                        num = Integer.parseInt(br.readLine());  
                                                    }  
                                                    public boolean isSpecial(int n)   {    
                                                        int spec = 0, temp = n;    
                                                        while (temp % 10 != 0)     {      
                                                            spec += factorial(temp % 10);      
                                                            temp /= 10;    
                                                        }    
                                                        if (spec == n)       return true;    
                                                        else       return false;  
                                                    }  
                                                    private int factorial(int n)   {    
                                                        if ((n == 1) || (n == 0))       return 1;    
                                                        else       return (n * factorial(n - 1));  
                                                    }  
                                                    public static void main(String args[]) throws Exception   {    
                                                        SpecialNumber obj = new SpecialNumber();    
                                                        obj.input();    
                                                        if (obj.isSpecial(num))       System.out.print(num + " is a Special Number");    
                                                        else       System.out.print(num + " is not a Special Number");  
                                                    }
                                                }
                                                import java.util.Scanner;
                                                class SquareRoot {  
                                                    public static void main(String[] args)   {    
                                                        int n;    
                                                        Scanner sc = new Scanner(System.in);    
                                                        System.out.println("Enter Number");    
                                                        n = sc.nextInt();    
                                                        System.out.println(Math.sqrt(n));  
                                                    }
                                                } //Sunny Number: when 1 is added to a number, then the square root of it will be a whole number.
                                                import java.util.*;
                                                class SunnyNumber {  
                                                    public static void main(String[] args)   {    
                                                        int n, n1;    
                                                        double x;    
                                                        Scanner sc = new Scanner(System.in);    
                                                        System.out.println("Enter number");    
                                                        n = sc.nextInt();    
                                                        n1 = n + 1;    
                                                        x = Math.sqrt(n1);    
                                                        if ((int) x == x)     {      
                                                            System.out.println("Number is a Sunny Number");    
                                                        }    
                                                        else     {      
                                                            System.out.println("Number is not a Sunny Number");    
                                                        }  
                                                    }
                                                }
                                                import java.io.BufferedReader;
                                                import java.io.IOException;
                                                import java.io.InputStreamReader;
                                                class Swapping {  
                                                    public static void main(String ars[]) throws IOException   {    
                                                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                                        int a = 10;    
                                                        int b = 15;    
                                                        System.out.println("Values before swipe :");    
                                                        System.out.println("a=" + a + " and b=" + b);     //------Method 1 Using add and subtract -----
                                                            
                                                        a = a + b;    
                                                        b = a - b;    
                                                        a = a - b;    
                                                        System.out.println("---- Using Method 1 ----");    
                                                        System.out.println("a=" + a + " and b=" + b);     //------Method 2 Using XOR operation------
                                                            
                                                        a = 10;    
                                                        b = 15;    
                                                        a = a ^ b;    
                                                        b = a ^ b;    
                                                        a = a ^ b;    
                                                        System.out.println("---- Using Method 2 ----");    
                                                        System.out.println("a=" + a + " and b=" + b);     //-----Method 3 Using Multiplication and division----
                                                            
                                                        a = 10;    
                                                        b = 15;    
                                                        a = a * b;    
                                                        b = a / b;    
                                                        a = a / b;    
                                                        System.out.println("---- Using Method 3 ----");    
                                                        System.out.println("a=" + a + " and b=" + b);     //-----Method 4 Using formula a=b-a+(b=a) -----
                                                             /*         Working of Formula :         System first evaluates (b=a) expression based on BODMAS rule         then b-a expression         So a=15-10+(10)=15 and b=10         */     
                                                        a = 10;    
                                                        b = 15;    
                                                        a = b - a + (b = a);    
                                                        System.out.println("---- Using Method 4 ----");    
                                                        System.out.println("a=" + a + " and b=" + b);  
                                                    }
                                                }
                                                import java.util.Scanner;
                                                class SwapNumbers {  
                                                    public static void main(String args[])   {    
                                                        int x, y, temp;    
                                                        System.out.println("Enter x and y");    
                                                        Scanner in = new Scanner(System.in);    
                                                        x = in .nextInt();    
                                                        y = in .nextInt();    
                                                        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);    
                                                        temp = x;    
                                                        x = y;    
                                                        y = temp;    
                                                        System.out.println("After Swapping\nx = " + x + "\ny = " + y);  
                                                    }
                                                }
                                                class TopTwoMaxNumber {  
                                                    public void printTwoMaxNumbers(int[] nums)   {    
                                                        int maxOne = 0;    
                                                        int maxTwo = 0;    
                                                        for (int n: nums)     {      
                                                            if (maxOne < n)       {        
                                                                maxTwo = maxOne;        
                                                                maxOne = n;      
                                                            }      
                                                            else if (maxTwo < n)       {        
                                                                maxTwo = n;      
                                                            }    
                                                        }    
                                                        System.out.println("First Max Number: " + maxOne);    
                                                        System.out.println("Second Max Number: " + maxTwo);  
                                                    }  
                                                    public static void main(String args[])   {    
                                                        int num[] = {
                                                            65,
                                                            34,
                                                            27,
                                                            8,
                                                            33,
                                                            10,
                                                            89,
                                                            45
                                                        };    
                                                        TopTwoMaxNumber ttmn = new TopTwoMaxNumber();    
                                                        ttmn.printTwoMaxNumbers(num);  
                                                    }
                                                }
                                                import java.util.*;
                                                import java.io.*;
                                                class Tribonacci {  
                                                    public static void main(String args[])   {    
                                                        Scanner sc = new Scanner(System.in);    
                                                        System.out.print("Enter number till u want Tribonacci series: ");    
                                                        int n = sc.nextInt();    
                                                        int a = 0, b = 0, c = 1;    
                                                        int d = a + b + c;    
                                                        System.out.println("\nTribonacci Series: ");    
                                                        System.out.print(a + "\t" + b + "\t" + c);    
                                                        for (int i = 4; i <= n; i++)     {      
                                                            System.out.print("\t" + d);      
                                                            a = b;      
                                                            b = c;      
                                                            c = d;      
                                                            d = a + b + c;    
                                                        }    
                                                        System.out.println();  
                                                    }
                                                }
                                                class TwinPrimes {  
                                                    public static void main(String args[])   {    
                                                        String primeNo = "";    
                                                        int j = 0;    
                                                        int LastPrime = 1;    
                                                        System.out.println("Twin Primes are:");    
                                                        for (int i = 1; i < 100; i++)     {      
                                                            for (j = 2; j < i; j++)       {        
                                                                if (i % j == 0)         {          
                                                                    break;        
                                                                }      
                                                            }      
                                                            if (i == j)       {        
                                                                primeNo += i + " ";        
                                                                if ((i - LastPrime) == 2)         {          
                                                                    System.out.println("(" + (i - 2) + "," + i + ")");        
                                                                }        
                                                                LastPrime = i;      
                                                            }    
                                                        }    
                                                        System.out.println("Prime Numbers are: " + primeNo);  
                                                    }
                                                }
                                                import java.io.*;
                                                class UniqueNumber {  
                                                    public static void main(String args[]) throws IOException   {    
                                                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                                            System.out.print("Enter any number : ");    
                                                            int n = Integer.parseInt(br.readLine());    
                                                            String s = Integer.toString(n); //converting the number into String form         int l = s.length();        int flag = 0; /* loop for checking whether there are repeated digits */        for (int i = 0; i < l - 1; i++)        {            for (int j = i + 1; j < l; j++)            {                if (s.charAt(i) == s.charAt(j)) //if any digits match, then we know it is not a Unique Number                 {                    flag = 1;                    break;                }            }        }        if (flag == 0)            System.out.println(s + " is a Unique Number");        else            System.out.println(s + " is Not a Unique Number");    }}