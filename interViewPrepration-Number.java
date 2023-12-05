import java.util.*;
import java.io.*;
class AdamNumber {  
    int CountNumberOfDigits(int n)   {    
        int numdigits = 0;    
        do     {      
            n = n / 10;      
            numdigits++;    
        }     while (n > 0);    
        return numdigits;  
    }  
    int ReverseNumber(int n)   {    
        int i = 0, result = 0;    
        int numdigits = CountNumberOfDigits(n);    
        for (i = 0; i < numdigits; i++)     {      
            result *= 10;      
            result += n % 10;      
            n = n / 10;    
        }    
        return result;  
    }  
    public static void main(String args[]) throws Exception   {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.print("\nEnter the minimum number of range: ");    
        int min = Integer.parseInt(br.readLine());    
        System.out.print("\nEnter the maximum number of range: ");    
        int max = Integer.parseInt(br.readLine());    
        AdamNumber an = new AdamNumber();    
        System.out.println("\nAdam Numbers: ");    
        for (int i = min; i < max; i++)     {      
            int n = i;      
            int rn = an.ReverseNumber(i);      
            if (n == rn)       {        
                continue;      
            }      
            int sqrn = n * n;      
            int sqrm = rn * rn;      
            int revsqrm = an.ReverseNumber(sqrm);      
            if (revsqrm == sqrn)       {        
                System.out.print(n + "\n");      
            }    
        }    
        System.out.println();  
    }
}
import java.util.Scanner;
class AmicableNumber {  
    public static void main(String[] args)   {    
        int a, b;    
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter two Numbers:");    
        a = in .nextInt();    
        b = in .nextInt();    
        boolean flag = check(a, b);    
        if (flag)     {      
            System.out.println("The numbers are amicable");    
        }    
        else     {      
            System.out.println("The numbers are not amicable");    
        }  
    }  
    static boolean check(int a, int b)   {    
        int s = 0, i;    
        for (i = 1; i < a; i++)     {      
            if (a % i == 0)       {        
                s = s + i;      
            }    
        }    
        if (s == b)     {      
            s = 0;      
            for (i = 1; i < b; i++)       {        
                if (b % i == 0)         {          
                    s = s + i;        
                }      
            }      
            if (s == a)         return true;      
            else         return false;    
        }    
        return false;  
    }
}
import java.util.*;
class ArmstrongNumber {  
    public static void main(String args[])   {    
        int n, sum = 0, temp, r;    
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter a number to check if it is an armstrong number");    
        n = in .nextInt();    
        temp = n;    
        while (temp != 0)     {      
            r = temp % 10;      
            sum = sum + r * r * r;      
            temp = temp / 10;    
        }    
        if (n == sum)       System.out.println("Entered number is an armstrong number.");    
        else       System.out.println("Entered number is not an armstrong number.");  
    }
}
import java.util.Scanner;
class AutomorphicNumber {  
    public static void main(String[] args)   {    
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter a number: ");    
        int input = scanner.nextInt();    
        int square = input * input;    
        String inputAsString = input + "";    
        String squareAsString = square + "";    
        if (squareAsString.endsWith(inputAsString))     {      
            System.out.println(input + " is Automorphic Number");    
        }    
        else     {      
            System.out.println(input + " is Not an Automorphic number");    
        }  
    }
} /*Buzz number is such a number which is either completely divisible by 7 or extreme right side digit of the number is 7*/
import java.io.*;
class BuzzNumber {  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    int a;  
    public void show() throws Exception   {    
        System.out.print("Enter the number:");    
        a = Integer.parseInt(br.readLine());       /*Checks if the entered number is divisible  by 7 or extreme right is 7*/     
        if (a % 10 == 7 || a % 7 == 0)       System.out.println("Entered number is a Buzz number.");    
        else       System.out.println("Entered number is not a Buzz number.");  
    }  
    public static void main(String args[]) throws Exception   {    
        BuzzNumber bn = new BuzzNumber();    
        bn.show();  
    }
}
import java.util.*;
class Prime {  
    public static void main(String args[])   {    
        int n, i, res;    
        boolean flag = true;    
        Scanner sc = new Scanner(System.in);    
        System.out.println("Please Enter a No.");    
        n = sc.nextInt();    
        for (i = 2; i <= n / 2; i++)     {      
            res = n % i;      
            if (res == 0)       {        
                flag = false;        
                break;      
            }    
        }    
        if (flag)       System.out.println(n + " is Prime Number");    
        else       System.out.println(n + " is not Prime Number");  
    }
}
import java.io.*;
class AmicableNumber {  
    static boolean check(int a, int b)   {    
        int s = 0, i;    
        for (i = 1; i < a; i++)     {      
            if (a % i == 0)       {        
                s = s + i;      
            }    
        }    
        if (s == b)     {      
            s = 0;      
            for (i = 1; i < b; i++)       {        
                if (b % i == 0)         {          
                    s = s + i;        
                }      
            }      
            if (s == a)         return true;      
            else         return false;    
        }    
        return false;  
    }  
    public static void main(String[] args) throws Exception   {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.print("Enter 1st no. : ");    
        int a = Integer.parseInt(br.readLine());    
        System.out.print("Enter 2nd no. : ");    
        int b = Integer.parseInt(br.readLine());    
        if (check(a, b))     {      
            System.out.print(a + " and " + b + " are Amicable Number");    
        }    
        else     {      
            System.out.print(a + " and " + b + " are not Amicable Number");    
        }  
    }
}
class CommnElements {  
    public static void main(String args[])   {    
        int[] arr1 = {
            1,
            3,
            7,
            8
        };    
        int[] arr2 = {
            9,
            5,
            7,
            2,
            1,
            4,
            8
        };    
        System.out.println("Common Elements are:");    
        for (int i = 0; i < arr1.length; i++)     {      
            for (int j = 0; j < arr2.length; j++)       {        
                if (arr1[i] == arr2[j])         {          
                    System.out.println(arr1[i]);        
                }      
            }    
        }  
    }
}
import java.util.Scanner;
class CompareStrings {  
    public static void main(String args[])   {    
        String s1, s2;    
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter the first string");    
        s1 = in .nextLine();    
        System.out.println("Enter the second string");    
        s2 = in .nextLine();    
        if (s1.compareTo(s2) > 0)       System.out.println("First string is greater than second.");    
        else if (s1.compareTo(s2) < 0)       System.out.println("First string is smaller than second.");    
        else       System.out.println("Both strings are equal.");  
    }
}
import java.io.*;
import java.util.*;
class NumberToWord {  
    private static final String[] specialNames = {      
        "",
        " thousand",
        " million",
        " billion",
              " trillion",
        " quadrillion",
        " quintillion"
    };  
    private static final String[] tensNames = {      
        "",
              " ten",
        " twenty",
        " thirty",
        " forty",
        " fifty",
              " sixty",
        " seventy",
        " eighty",
        " ninety"
    };  
    private static final String[] numNames = {      
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
              " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
              " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
              " seventeen",
        " eighteen",
        " nineteen"
    };  
    private String convertLessThanOneThousand(int number)   {    
        String current;    
        if (number % 100 < 20)     {      
            current = numNames[number % 100];      
            number /= 100;    
        }    
        else     {      
            current = numNames[number % 10];      
            number /= 10;      
            current = tensNames[number % 10] + current;      
            number /= 10;    
        }    
        if (number == 0)       return current;
        return numNames[number] + " hundred" + current;  
    }  
    public String convert(int number)   {    
        if (number == 0)     {      
            return "zero";    
        }    
        String prefix = "";    
        if (number < 0)     {      
            number = -number;      
            prefix = "negative";    
        }    
        String current = "";    
        int place = 0;    
        do     {      
            int n = number % 1000;      
            if (n != 0)       {        
                String s = convertLessThanOneThousand(n);        
                current = s + specialNames[place] + current;      
            }      
            place++;      
            number /= 1000;    
        }     while (number > 0);    
        return (prefix + current).trim();  
    }  
    public static void main(String[] args)   {    
        System.out.print("Enter a number: ");    
        Scanner sc = new Scanner(System.in);    
        int num = sc.nextInt();    
        System.out.println();    
        NumberToWord obj = new NumberToWord();    
        System.out.println(num + " = " + obj.convert(num));  
    }
}
import java.text.DecimalFormat;
import java.io.*;
class EnglishNumberToWords {  
    private static final String[] tensNames = {      
        "",
              " ten",
              " twenty",
              " thirty",
              " forty",
              " fifty",
              " sixty",
              " seventy",
              " eighty",
              " ninety"  
    };  
    private static final String[] numNames = {      
        "",
              " one",
              " two",
              " three",
              " four",
              " five",
              " six",
              " seven",
              " eight",
              " nine",
              " ten",
              " eleven",
              " twelve",
              " thirteen",
              " fourteen",
              " fifteen",
              " sixteen",
              " seventeen",
              " eighteen",
              " nineteen"  
    };  
    private static String convertLessThanOneThousand(int number)   {    
        String soFar;    
        if (number % 100 < 20)     {      
            soFar = numNames[number % 100];      
            number /= 100;    
        }    
        else     {      
            soFar = numNames[number % 10];      
            number /= 10;
            soFar = tensNames[number % 10] + soFar;      
            number /= 10;    
        }    
        if (number == 0)       return soFar;    
        return numNames[number] + " hundred" + soFar;  
    }

      
    public static String convert(long number)   {     // 0 to 999 999 999 999        if (number == 0)        {            return "zero";        }
            
        String snumber = Long.toString(number);     // pad with "0"        String mask = "000000000000";        DecimalFormat df = new DecimalFormat(mask);        snumber = df.format(number);
             // XXXnnnnnnnnn        int billions = Integer.parseInt(snumber.substring(0, 3));        // nnnXXXnnnnnn        int millions = Integer.parseInt(snumber.substring(3, 6));        // nnnnnnXXXnnn        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));        // nnnnnnnnnXXX        int thousands = Integer.parseInt(snumber.substring(9, 12));
            
        String tradBillions;    
        switch (billions)     {      
            case 0:
                        tradBillions = "";        
                break;      
            case 1:
                        tradBillions = convertLessThanOneThousand(billions)             + " billion ";        
                break;      
            default:
                        tradBillions = convertLessThanOneThousand(billions)             + " billion ";    
        }    
        String result = tradBillions;    
        String tradMillions;    
        switch (millions)     {      
            case 0:
                        tradMillions = "";        
                break;      
            case 1:
                        tradMillions = convertLessThanOneThousand(millions)             + " million ";        
                break;      
            default:
                        tradMillions = convertLessThanOneThousand(millions)             + " million ";    
        }    
        result = result + tradMillions;    
        String tradHundredThousands;    
        switch (hundredThousands)     {      
            case 0:
                        tradHundredThousands = "";        
                break;      
            case 1:
                        tradHundredThousands = "one thousand ";        
                break;      
            default:
                        tradHundredThousands = convertLessThanOneThousand(hundredThousands)             + " thousand ";    
        }    
        result = result + tradHundredThousands;    
        String tradThousand;    
        tradThousand = convertLessThanOneThousand(thousands);    
        result = result + tradThousand;     // remove extra spaces!        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");    }
          
        public static void main(String[] args) throws Exception   {    
            String number = null;    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            System.out.print("Enter number to display in words : ");    
            number = br.readLine();    
            System.out.println("\n\t" + number + " IN WORDS\n\n" + EnglishNumberToWords.convert(Integer.parseInt(number)));  
        }
    }
    import java.io.*;
    class Disarium {  
        public void show(int n)   {    
            int c = 1, rev, sum, x;    
            x = n;    
            sum = 0;    
            rev = 0;    
            while (n > 0)     {      
                rev = rev * 10 + n % 10;      
                n = n / 10;    
            }    
            while (rev > 0)     {      
                sum = sum + (int) Math.pow(rev % 10, c);      
                c++;      
                rev = rev / 10;    
            }    
            if (sum == x)       System.out.println(x + " is DISARIUM number");    
            else       System.out.println(x + " is not DISARIUM number");  
        }  
        public static void main(String args[]) throws Exception   {    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            System.out.print("Enter number to check its DISARIUM no. or not : ");    
            Disarium ob = new Disarium();    
            ob.show(Integer.parseInt(br.readLine()));  
        }
    }
    import java.io.*;
    class DuckNumber {  
        public static void main(String args[]) throws IOException   {    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            System.out.print("Enter any number : ");    
            String n = br.readLine();    
            int l = n.length();    
            int c = 0;    
            char ch;    
            for (int i = 1; i < l; i++)     {      
                ch = n.charAt(i);      
                if (ch == '0')         c++;    
            }    
            char f = n.charAt(0);    
            if (c > 0 && f != '0')       System.out.println("It is a duck number");    
            else       System.out.println("It is not a duck number");  
        }
    }
    import java.util.Scanner;
    class Factorial {  
        public static void main(String args[])   {    
            int fact = 1;    
            int number = 0;    
            System.out.println("Enter a number to print its factorial");    
            Scanner in = new Scanner(System.in);    
            number = in .nextInt();    
            for (int i = 1; i <= number; i++)     {      
                fact = i * fact;    
            }    
            System.out.println("The factorial of " + number + " is " + fact);  
        }
    }
    import java.util.*;
    class FactorialExample {  
        public static void main(String args[])   {    
            int a;    
            Scanner scanner = new Scanner(System.in);    
            System.out.print("Enter no. for factorial : ");    
            a = scanner.nextInt();    
            System.out.println("Factorial of " + a + " is " + fact(a));  
        }  
        static int fact(int n)   {    
            int result;    
            if (n == 0 || n == 1)       return 1;    
            result = fact(n - 1) * n;    
            return result;  
        }
    }
    import java.io.*;
    class Factors {  
        public static void main(String args[]) throws IOException   {    
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));    
            int a, i;    
            System.out.print("Enter the number : ");    
            a = Integer.parseInt(buf.readLine());    
            System.out.print("\n");    
            System.out.print("The factors are : ");    
            for (i = 1; i <= a / 2; i++)     {      
                if (a % i == 0)         System.out.print(i + ",");    
            }    
            System.out.print(a);  
        }
    }
    import java.io.*;
    import java.lang.*;
    class Fibonacci {  
        public static void main(String args[]) throws IOException   {    
            if (args.length == 1)     {      
                int n = Integer.parseInt(args[0]);      
                int a = 0, b = 1, c = 0, i = 0;      
                while (i < n)       {        
                    System.out.print(c + "\t");        
                    a = b;        
                    b = c;        
                    c = a + b;        
                    i++;      
                }    
            }    
            else     {      
                System.out.println("You havent supplied the arguments: {Usage : java fibonacci 34 } to print the first 34 fibonacci numbers.");    
            }  
        }
    }
    import java.util.Scanner;
    class Fibonacci {  
        static int fibo(int n)   {    
            if (n == 0)       return 0;    
            if (n == 1)       return 1;    
            else       return fibo(n - 1) + fibo(n - 2);  
        }  
        public static void main(String[] args)   {    
            Scanner sc = new Scanner(System.in);    
            System.out.print("Enter fibonacci Term :");    
            int n = sc.nextInt();    
            System.out.println("Fibonacci Series is :\n");    
            for (int i = 0; i < n; i++)     {      
                System.out.print(fibo(i) + "\t");    
            }  
        }
    }
    import java.util.Scanner;
    class OddOrEven {  
        public static void main(String args[])   {    
            int x;    
            System.out.println("Enter an integer to check if it is odd or even ");    
            Scanner in = new Scanner(System.in);    
            x = in .nextInt();    
            if (x % 2 == 0)       System.out.println("You entered an even number.");    
            else       System.out.println("You entered an odd number.");  
        }
    }
    import java.util.*;
    class PerfectSquare {  
        public static void main(String[] args)   {    
            int start, end, n, sum = 0;    
            float s;    
            Scanner sc = new Scanner(System.in);    
            System.out.println("Enter starting value of the range");    
            start = sc.nextInt();    
            System.out.println("Enter ending value of the range");    
            end = sc.nextInt();    
            System.out.println("The Perfect Square numbers present in the range " + start + " to " + end + " are : ");    
            for (int i = start; i < end; i++)     {      
                s = (float) Math.sqrt(i);      
                n = (int) Math.floor(s);      
                if (s == n)       {        
                    System.out.print(" " + i);        
                    sum += i;      
                }    
            }    
            System.out.println(        "\nSum of the perfect square numbers between the range " + start + " to " + end + " are : " + sum);  
        }
    }