import java.util.Scanner;
class AreaCalculator {  
    float l, b, h, r, ba, s, c;  
    float result = 0 f;  
    float pi = 3.14 f;  
    int
    var;  
    public static void main(String[] args)   {    
        AreaCalculator ar = new AreaCalculator();    
        ar.options();  
    }  
    public void options()   {    
        Scanner a = new Scanner(System.in);    
        System.out.println("Enter the Object of which Area is to be calculated \n1:square \n2:rectangle \n3:Triangle\n4:circle\n5:Trapezoid\n6:Repeat\n7:Exit");    
        var = a.nextInt();    
        Area a1 = new Area();    
        if (var == 1)     {      
            System.out.println("Enter the Side of Square");      
            s = a.nextFloat();      
            a1.square(s);      
            options();    
        }    
        else if (var == 2)     {      
            System.out.println("Enter the Length of Rectangle");      
            l = a.nextFloat();      
            System.out.println("Enter the Breadth of Rectangle");      
            b = a.nextFloat();      
            a1.rectangle(l, b);      
            options();    
        }    
        else if (var == 3)     {      
            System.out.println("Enter the Height of Triangle");      
            h = a.nextFloat();      
            System.out.println("Enter the Base of Triangle");      
            ba = a.nextFloat();      
            a1.triangle(h, ba);      
            options();    
        } else if (var == 4)     {      
            System.out.println("Enter the Radius of Circle");      
            r = a.nextFloat();      
            a1.circle(r);      
            options();    
        }    
        else if (var == 5)     {      
            System.out.println("Enter the A side of Trapezoid");      
            b = a.nextFloat();      
            System.out.println("Enter the B side of Trapezoid");      
            c = a.nextFloat();      
            System.out.println("Enter the Height of Trapezoid");      
            h = a.nextFloat();      
            a1.trapezoid(b, c, h);      
            options();    
        }  
    }
}
class Area {  
    public void square(float s)   {    
        float result = 0 f;    
        result = s * s;    
        System.out.println("The Area of Square is :" + result);  
    }  
    public void rectangle(float l, float b)   {    
        float result = 0 f;    
        result = l * b;    
        System.out.println("The Area of Rectangle is :" + result);  
    }  
    public void triangle(float h, float ba)   {    
        float result = 0 f;    
        result = 0.5 f * h * ba;    
        System.out.println("The Area of Triangle is :" + result);  
    }  
    public void circle(float r)   {    
        float result = 0 f;    
        result = 3.14 f * (r * r);    
        System.out.println("The Area of Circle is :" + result);  
    }  
    public void trapezoid(float b, float c, float h)   {    
        float result = 0 f;    
        result = (((b + c) / 2) * h);    
        System.out.println("The Area of Trapezoid is :" + result);  
    }
}
class CalculateCircleAreaExample {  
    public static void main(String[] args)   {    
        int radius = 3;    
        System.out.println("The radius of the circle is " + radius);  /*         * Area of a circle is pi * r * r where r is a radius of a circle.  */      // NOTE : use Math.PI constant to get value of pi        double area = Math.PI * radius * radius;
            
        System.out.println("Area of a circle is " + area);  
    }
}
import java.util.Scanner;
class AreaOfRectangle {  
    public static void main(String[] args)   {    
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Enter the length of Rectangle:");    
        double length = scanner.nextDouble();    
        System.out.println("Enter the width of Rectangle:");    
        double width = scanner.nextDouble();     //Area = length*width;        double area = length * width;
            
        System.out.println("Area of Rectangle is:" + area);  
    }
}
import java.util.*;
class AreaOfSquare {  
    public static void main(String args[])   {    
        int side, area;    
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter value of the sides of square");    
        side = sc.nextInt();    
        area = side * side;    
        System.out.println("Area of Square : " + area);  
    }
}
import java.util.*;
class BinaryCalculator {  
    public static void main(String[] args)   {    
        Scanner in = new Scanner(System.in);    
        System.out.print("First Binary: ");    
        String binOne = in .next();    
        System.out.print("Second Binary: ");    
        String binTwo = in .next();    
        int left = Integer.parseInt(binOne, 2);    
        int right = Integer.parseInt(binTwo, 2);    
        System.out.println("Sum of the binary numbers : " + Integer.toBinaryString(left + right));    
        System.out.println("Difference of the binary numbers : " + Integer.toBinaryString(left - right));    
        System.out.println("Product of the binary numbers : " + Integer.toBinaryString(left * right));    
        System.out.println("Quotient of the binary numbers : " + Integer.toBinaryString(left / right));  
    }
}
import java.io.*;
class BinaryToDecimal {  
    public static void main(String[] args) throws Exception   {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.print("Enter Binary no. to convert in Decimal : ");    
        String number = br.readLine();             /*          to convert Binary number to decimal number use,          int parseInt method of Integer wrapper class.                   Pass 2 as redix second argument.         */     
        int decimalNumber = Integer.parseInt(number, 2);    
        System.out.println("Binary number converted to decimal number");    
        System.out.println("Decimal number is : " + decimalNumber);  
    }
}
import java.io.*;
class BinaryToOctal {  
    public static void main(String[] args) throws Exception   {    
        String num = null;    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.print("Enter binary number : ");    
        num = br.readLine();    
        int dec = Integer.parseInt(num, 2);    
        String oct = Integer.toOctalString(dec);    
        System.out.println("Binary " + num + " in Octal is " + oct);  
    }
}
import java.util.Scanner;
class CalculateMean {  
    public static void main(String[] args)   {    
        int sum = 0, inputNum;    
        int counter;    
        float mean;    
        Scanner NumScanner = new Scanner(System.in);    
        System.out.println("Enter the total number of terms whose mean you want to calculate");    
        counter = NumScanner.nextInt();    
        System.out.println("Please enter " + counter + " numbers:");    
        for (int x = 1; x <= counter; x++)     {      
            inputNum = NumScanner.nextInt();      
            sum = sum + inputNum;      
            System.out.println();    
        }    
        mean = sum / counter;    
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);  
    }
}
import java.lang.*;
import java.util.Scanner;
class CalculateInterest {  
    public static void main(String[] args)   {    
        double p, n, r, si, ci;    
        Scanner s = new Scanner(System.in);    
        System.out.print("Enter the amount : ");    
        p = s.nextDouble();    
        System.out.print("Enter the No.of years : ");    
        n = s.nextDouble();    
        System.out.print("Enter the Rate of interest : ");    
        r = s.nextDouble();    
        si = (p * n * r) / 100;    
        ci = p * Math.pow(1.0 + r / 100.0, n) - p;    
        System.out.println("\nAmount : " + p);    
        System.out.println("No. of years : " + n);    
        System.out.println("Rate of interest : " + r);    
        System.out.println("Simple Interest : " + si);    
        System.out.println("Compound Interest : " + ci);  
    }
}
import java.util.Scanner;
import java.io.*;
class Calculator {  
    public static void main(String[] args)   {    
        int choice;    
        int x = 0;    
        int y = 0;    
        int sum;    
        PrintStream out;    
        Scanner input;    
        Calculator calc = new Calculator();    
        try     {      
            out = new PrintStream("calclog.txt");      
            do       {        
                System.out.println("Calculator Program");        
                System.out.println("--------------------\n");        
                System.out.println("1. Add");        
                System.out.println("2. Subtract");        
                System.out.println("3. Multiply");        
                System.out.println("4. Divide");        
                System.out.println("5. Mod");        
                System.out.println("6. Power");        
                System.out.println("99. End Program\n");        
                System.out.println("Enter Choice: ");        
                input = new Scanner(System.in);        
                choice = input.nextInt();        
                while ((choice < 1 || choice > 6) && choice != 99)         {          
                    System.out.println("Please enter 1, 2, 3, 4, 5, or 6: ");          
                    choice = input.nextInt();        
                }        
                if (choice != 99)         {
                    System.out.println("Please enter 2 numbers only: ");          
                    x = input.nextInt();          
                    y = input.nextInt();        
                }        
                switch (choice)         {          
                    case 1:
                                    sum = calc.add(x, y);            
                        System.out.printf("The sum is %d\n\n", sum);            
                        out.println(x + "+" + y + "=" + sum);            
                        break;          
                    case 2:
                                    sum = calc.sub(x, y);            
                        System.out.printf("The answer is %d\n\n", sum);            
                        out.println(x + "-" + y + "=" + sum);            
                        break;          
                    case 3:
                                    sum = calc.multi(x, y);            
                        System.out.printf("The answer is %d\n\n", sum);            
                        out.println(x + "*" + y + "=" + sum);            
                        break;          
                    case 4:
                                    try             {              
                            sum = calc.div(x, y);              
                            System.out.printf("The answer is %d\n\n", sum);              
                            out.println(x + "/" + y + "=" + sum);
                        }            
                        catch (Exception e)             {              
                            System.out                  .println("\nError: Cannot Divide by zero\n\n");            
                        }            
                        break;          
                    case 5:
                                    sum = calc.mod(x, y);            
                        System.out.printf("The mod is %d\n\n", sum);            
                        out.println(x + "%" + y + "=" + sum);            
                        break;          
                    case 6:
                                    sum = calc.pow(x, y);            
                        System.out.printf("The answer is %d\n\n", sum);            
                        out.println(x + "^" + y + "=" + sum);            
                        break;        
                }

                      
            }       while (choice != 99);      
            input.close();      
            System.out.println("Ending program...");    
        }    
        catch (Exception e)     {      
            System.out.println("ERROR: Some error occured");      
            e.printStackTrace();    
        }  
    }  
    public int add(int num1, int num2)   {    
        int sum;    
        sum = num1 + num2;
        return sum;  
    }  
    public int sub(int num1, int num2)   {    
        int sum;    
        sum = num1 - num2;    
        return sum;  
    }  
    public int multi(int num1, int num2)   {    
        int sum;    
        sum = num1 * num2;    
        return sum;  
    }  
    public int div(int num1, int num2)   {    
        int sum;    
        sum = num1 / num2;    
        return sum;  
    }  
    public int mod(int num1, int num2)   {    
        int sum;    
        sum = num1 % num2;    
        return sum;  
    }  
    public int pow(int base, int exp)   {    
        int sum = 1;    
        if (exp == 0)     {      
            sum = 1;    
        }    
        while (exp > 0)     {      
            sum = sum * base;      
            exp--;    
        }    
        return sum;  
    }
}
import java.util.*;
class CelsiustoFahrenheit {  
    public static void main(String[] args)   {    
        double temperature;    
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter temperature in Celsius");    
        temperature = in .nextInt();    
        temperature = (temperature * 9 / 5.0) + 32;    
        System.out.println("Temperature in Fahrenheit = " + temperature);  
    }
}
import java.util.Scanner;
class DecimalToBinary {  
    public String toBinary(int n)   {    
        if (n == 0)     {      
            return "0";    
        }    
        String binary = "";    
        while (n > 0)     {      
            int rem = n % 2;      
            binary = rem + binary;      
            n = n / 2;    
        }    
        return binary;  
    }  
    public static void main(String[] args)   {    
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter a number: ");    
        int decimal = scanner.nextInt();    
        DecimalToBinary decimalToBinary = new DecimalToBinary();    
        String binary = decimalToBinary.toBinary(decimal);    
        System.out.println("The binary representation is " + binary);  
    }
}
import java.util.*;
class FahrenheitToCelsius {  
    public static void main(String[] args)   {    
        float temperature;    
        Scanner in = new Scanner(System.in);    
        System.out.print("Enter temperature in Fahrenheit : ");    
        temperature = in .nextInt();    
        temperature = (temperature - 32) * 5 / 9;    
        System.out.println("Temperature in Celsius = " + temperature);  
    }
}
import java.util.*;
class FractionAdding {  
    public static void main(String args[])   {    
            float a, b, c, d;    
            Scanner scanner = new Scanner(System.in);    
            System.out.print("Enter a : ");    
            a = scanner.nextFloat();    
            System.out.print("Enter b : ");    
            b = scanner.nextFloat();    
            System.out.print("Enter c : ");    
            c = scanner.nextFloat();    
            System.out.print("Enter d : ");    
            d = scanner.nextFloat();     // fraction addition formula ((a*d)+(b*c))/(b*d)        System.out.print("Fraction Addition : [( " + a + " * " + d + " )+( " + b + " * " + c + " ) / ( " + b + " * " + d + " )] = " + (((a * d) + (b * c)) / (b * d)));    }}import java.util.*;
            class FractionSubtraction { 
                public static void main(String args[])  { 
                    float a, b, c, d; 
                    Scanner scanner = new Scanner(System.in); 
                    System.out.print("Enter a : "); 
                    a = scanner.nextFloat(); 
                    System.out.print("Enter b : "); 
                    b = scanner.nextFloat(); 
                    System.out.print("Enter c : "); 
                    c = scanner.nextFloat(); 
                    System.out.print("Enter d : "); 
                    d = scanner.nextFloat();  // fraction addition formula ((a*d)-(b*c))/(b*d)  System.out.print("Fraction subtraction : [( "+a+" * "+d+" )-( "+b+" * "+c+" ) / ( "+b+" * "+d+" )] = "+(((a*d)-(b*c))/(b*d))); }}import java.util.*;
                    class GCDExample {  
                        public static void main(String args[])   {     //Enter two number whose GCD needs to be calculated.              Scanner scanner = new Scanner(System.in);        System.out.print("Enter first number to find GCD : ");        int number1 = scanner.nextInt();        System.out.print("Enter second number to find GCD : ");        int number2 = scanner.nextInt();
                                
                            System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD(number1, number2));  
                        }   //find GCD of two number using Euclid's method    private static int findGCD(int number1, int number2)    {        //base case        if (number2 == 0)            return number1;
                            
                        return findGCD(number2, number1 % number2);  
                    }
                }
                import java.util.Scanner;
                class GCDLCM {  
                    public static void main(String args[])   {    
                        int x, y;    
                        Scanner sc = new Scanner(System.in);    
                        System.out.println("Enter the two numbers: ");    
                        x = sc.nextInt();    
                        y = sc.nextInt();    
                        System.out.println("GCD of two numbers is : " + gcd(x, y));    
                        System.out.println("LCM of two numbers is : " + lcm(x, y));  
                    }  
                    static int gcd(int x, int y)   {    
                        int r = 0, a, b;    
                        a = (x > y) ? x : y; // a is greater number        b = (x < y) ? x : y; // b is smaller number
                            
                        r = b;    
                        while (a % b != 0)     {      
                            r = a % b;      
                            a = b;      
                            b = r;    
                        }    
                        return r;  
                    }  
                    static int lcm(int x, int y)   {    
                            int a;    
                            a = (x > y) ? x : y; // a is greater number        while (true)        {            if (a % x == 0 && a % y == 0)            {                return a;            }            ++a;        }    }}import java.util.*;
                            class HarmonicSeries {  
                                public static void main(String args[])   {    
                                    int num, i = 1;    
                                    double rst = 0.0;    
                                    Scanner in = new Scanner(System.in);    
                                    System.out.println("Enter the number for length of series");    
                                    num = in .nextInt();    
                                    while (i <= num)     {      
                                        System.out.print("1/" + i + " +");      
                                        rst = rst + (double) 1 / i;      
                                        i++;    
                                    }    
                                    System.out.println("\n\nSum of Harmonic Series is " + rst);  
                                }
                            }
                            import java.io.*;
                            class HexToDecimal {  
                                public static void main(String[] args) throws Exception   {    
                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                    System.out.print("Enter hex no. to convert in Decimal : ");    
                                    String strHexNumber = br.readLine();             /*         * to convert hexadecimal number to decimal number use,         * int parseInt method of Integer wrapper class.         *         * Pass 16 as redix second argument.         */     
                                    int decimalNumber = Integer.parseInt(strHexNumber, 16);    
                                    System.out.println("Hexadecimal number converted to decimal number");    
                                    System.out.println("Decimal number is : " + decimalNumber);  
                                }
                            }
                            import java.util.Scanner;
                            class MultiplicationTable {  
                                public static void main(String args[])   {    
                                    int n, c;    
                                    System.out        .println("Enter an integer to print it's multiplication table");    
                                    Scanner in = new Scanner(System.in);    
                                    n = in .nextInt();    
                                    System.out.println("Multiplication table of " + n + " is :-");    
                                    for (c = 1; c <= 10; c++)     {      
                                        System.out.println(n + "*" + c + " = " + (n * c));    
                                    }  
                                }
                            }
                            import java.util.Scanner;
                            class Tables {  
                                public static void main(String args[]) {  
                                    int a, b, c, d; 
                                    System.out  .println("Enter range of numbers to print their multiplication table"); 
                                    Scanner in = new Scanner(System.in); 
                                    a = in .nextInt(); 
                                    b = in .nextInt(); 
                                    for (c = a; c <= b; c++) {  
                                        System.out.println("Multiplication table of " + c);  
                                        for (d = 1; d <= 10; d++) {  
                                            System.out.println(c + "*" + d + " = " + (c * d));    
                                        } 
                                    } 
                                }
                            }
                            import java.io.*;
                            class OctalToDecimal {  
                                public static void main(String[] args) throws Exception   {    
                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                    System.out.print("Enter Octal no. to convert in Decimal : ");    
                                    String number = br.readLine();             /*          to convert Octal number to decimal number use,          int parseInt method of Integer wrapper class.                   Pass 8 as redix second argument.         */     
                                    int decimalNumber = Integer.parseInt(number, 8);    
                                    System.out.println("Octal number converted to decimal number");    
                                    System.out.println("Decimal number is : " + decimalNumber);  
                                }
                            } /*Pythagorean Triplet: c*c = a*a + b*b*/
                            class PythagoreanTriplet {  
                                public static void main(String s[]) throws Exception   {    
                                    System.out.println("Pythagorean Triplet: ");    
                                    for (int a = 1; a <= 50; a++)     {      
                                        for (int b = 1; b <= 50; b++)       {        
                                            int csquared = a * a + b * b;        
                                            double croot = Math.sqrt(csquared);        
                                            if (croot == Math.ceil(croot))         {          
                                                System.out.println(a + " " + b + " " + (int) croot);        
                                            }      
                                        }    
                                    }  
                                }
                            }
                            class QuadraticEquation {  
                                public static void main(String[] args)   {     /*  * Suppose our Quadratic Equation to be solved is 2x2 + 6x + 4 = 0 .  * (Assuming that both roots are real valued)  *   * General form of a Quadratic Equation is ax2 + bx + c = 0 where 'a' is  * not equal to 0  *   * Hence a = 2, b = 6 and c = 4.  */     
                                    int a = 2;    
                                    int b = 6;    
                                    int c = 4;     // Finding out the roots        double temp1 = Math.sqrt(b * b - 4 * a * c);
                                        
                                    double root1 = (-b + temp1) / (2 * a);    
                                    double root2 = (-b - temp1) / (2 * a);    
                                    System.out        .println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are "                  + root1 + " and " + root2);  
                                }
                            }
                            import java.io.BufferedReader;
                            import java.io.IOException;
                            import java.io.InputStreamReader;
                            class SquareRoot {  
                                public static void main(String[] args) throws IOException   {    
                                    int number = 0;    
                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                                    System.out.println("Enter a number");     //read a string entered by user        String line = br.readLine();
                                         //Handle exception when a string does not contain a number        try        {            //Convert a string into number            number = Integer.parseInt(line);        }        catch (NumberFormatException exception)        {
                                          
                                    System.out.println("Please enter a valid number");    
                                }     //Find square root of a number        double squareRoot = Math.sqrt(number);
                                     //print square root        System.out.println("Square root of a number " + number + "=" + squareRoot);    }}import java.util.*;
                                class Cylinder {  
                                    public static void main(String[] args)   {    
                                        double PI = 3.14;    
                                        Scanner sc = new Scanner(System.in);    
                                        System.out.print("Enter Radius: ");    
                                        double r = sc.nextDouble();    
                                        System.out.print("Enter Height: ");    
                                        double h = sc.nextDouble();    
                                        double volume = PI * r * r * h;    
                                        double area = 2 * PI * r * (r + h);    
                                        System.out.println("Volume of Cylinder: " + volume);    
                                        System.out.println("Area of Cylinder: " + area);  
                                    }
                                }