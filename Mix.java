class Brackets {  
    public static boolean checkBrackets(String str)   {    
        int mismatchedBrackets = 0;    
        for (char ch: str.toCharArray())     {      
            if (ch == '[')       {        
                mismatchedBrackets++;      
            }      
            else if (ch == ']')       {        
                mismatchedBrackets--;      
            }      
            else       {        
                return false; //non-bracket chars            }
                      
                if (mismatchedBrackets < 0)       {         //close bracket before open bracket
                            
                    return false;      
                }    
            }    
            return mismatchedBrackets == 0;  
        }  
        public static String generate(int n)   {    
            if (n % 2 == 1)     {       //if n is odd we can't match brackets
                      
                return null;    
            }    
            String ans = "";    
            int openBracketsLeft = n / 2;    
            int unclosed = 0;    
            while (ans.length() < n)     {      
                if (Math.random() >= .5 && openBracketsLeft > 0 || unclosed == 0)       {        
                    ans += '[';        
                    openBracketsLeft--;        
                    unclosed++;      
                }      
                else       {        
                    ans += ']';        
                    unclosed--;      
                }    
            }    
            return ans;  
        }  
        public static void main(String[] args)   {    
            String[] tests = {
                "",
                "[]",
                "][",
                "[][]",
                "][][",
                "[[][]]",
                "[]][[]"
            };    
            for (int i = 0; i <= 16; i += 2)     {      
                String bracks = generate(i);      
                System.out.println(bracks + ": " + checkBrackets(bracks));    
            }    
            for (String test: tests)     {      
                System.out.println(test + ": " + checkBrackets(test));    
            }  
        }
    }
    import java.math.*;
    import java.io.*;
    class BigIntegerDemo {  
        public static int f = 0;  
        public static void main(String[] args) throws Exception   {    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            System.out.print("Enter any number to find its factorial : ");    
            f = Integer.parseInt(br.readLine());    
            BigInteger fact = fact(f);    
            System.out.println("fact(" + f + ") = " + fact);    
            System.out.println("fact(" + f + ").longValue() = " + fact.longValue());    
            System.out.println("fact(" + f + ").intValue() = " + fact.intValue());    
            int powerOfTwoCount = 0;    
            BigInteger two = BigInteger.valueOf(2);    
            while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO))     {      
                powerOfTwoCount++;      
                fact = fact.divide(two);    
            }         
            System.out.println("fact(" + f + ") powers of two = " + powerOfTwoCount);  
        }  
        private static BigInteger fact(long n)   {    
            BigInteger result = BigInteger.ONE;    
            for (long i = 2; i <= n; i++)       result = result.multiply(BigInteger.valueOf(i));    
            return result;  
        }
    }
    class Bike {  
        String name;  
        int cc, model, days, r;  
        Bike(String name, int cc, int model, int days)   {    
            this.name = name;    
            this.cc = cc;    
            this.model = model;    
            this.days = days;  
        }  
        public void rent()   {    
            if (name == "abc" && cc == 100 && model == 1)     {      
                if (days == 1)       {        
                    r = 500;        
                    System.out.println(r);      
                }      
                else if (days == 2)       {        
                    r = 400;        
                    System.out.println(r);      
                }      
                else if (days >= 3)       {        
                    r = 350;        
                    System.out.println(r);      
                }    
            }    
            else if (name == "xyz" && cc == 125 && model == 2)     {      
                if (days == 1)       {        
                    r = 600;        
                    System.out.println(r);      
                } else if (days == 2)       {        
                    r = 500;        
                    System.out.println(r);      
                }      
                else if (days >= 3)       {        
                    r = 500;        
                    System.out.println(r);      
                }    
            }    
            else if (name == "pqr" && cc == 150 && model == 3)     {      
                if (days == 1)       {        
                    r = 800;        
                    System.out.println(r);      
                }      
                else if (days == 2)       {        
                    r = 700;        
                    System.out.println(r);      
                }      
                else if (days >= 3)       {        
                    r = 850;        
                    System.out.println(r);      
                }    
            }  
        }  
        public static void main(String[] args)   {    
            Bike b = new Bike("pqr", 150, 3, 4);    
            System.out.print("Rent is : ");    
            b.rent();  
        }
    }
    import java.io.*;
    class BinaryAddition {  
        public static void main(String s[]) throws Exception   {    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            System.out.print("\nEnter number1: ");    
            int num1 = Integer.parseInt(br.readLine());    
            int num4 = num1;    
            System.out.print("\nEnter number2: ");    
            int num2 = Integer.parseInt(br.readLine());    
            int num5 = num2;    
            int k = 1;    
            int dec1 = 0, dec2 = 0;    
            while (num1 != 0)     {      
                dec1 = dec1 + (num1 % 10) * k;      
                k = k * 2;      
                num1 = num1 / 10;    
            }    
            k = 1;    
            while (num2 != 0)     {      
                dec2 = dec2 + (num2 % 10) * k;      
                k = k * 2;      
                num2 = num2 / 10;    
            }    
            int num3 = dec1 + dec2;    
            String str1 = Integer.toBinaryString(num3);    
            System.out.print("\nAddition of " + num4 + " + " + num5 + " = " + str1);    
            System.out.println();  
        }
    }
    class MyBasicBoolean {   
        public static void main(String a[])  {     //create Boolean using boolean primitive type        boolean b1 = true;
                
            Boolean bObj1 = new Boolean(b1);    
            System.out.println("Wrapper class Boolean output: " + bObj1);     //create Boolean using string value        Boolean bObj2 = new Boolean("false");        System.out.println("Wrapper class Boolean output: "+bObj2);
                 //how to get primitive boolean value from wrapper class        System.out.println(bObj1.booleanValue());    }}import java.util.*;import java.text.*;class CalendarTask{    public static void main(String args[]) throws Exception    {        printCalendar(2016, 2);    }
              
            static void printCalendar(int year, int nCols)   {    
                if (nCols < 1 || nCols > 12)       throw new IllegalArgumentException("Illegal column width.");    
                Calendar date = new GregorianCalendar(year, 0, 1);    
                int nRows = (int) Math.ceil(12.0 / nCols);    
                int offs = date.get(Calendar.DAY_OF_WEEK) - 1;    
                int w = nCols * 24;    
                String[] monthNames = new DateFormatSymbols(Locale.US).getMonths();    
                String[][] mons = new String[12][8];    
                for (int m = 0; m < 12; m++)     {      
                    String name = monthNames[m];      
                    int len = 11 + name.length() / 2;      
                    String format = MessageFormat.format("%{0}s%{1}s", len, 21 - len);      
                    mons[m][0] = String.format(format, name, "");      
                    mons[m][1] = " Su Mo Tu We Th Fr Sa";      
                    int dim = date.getActualMaximum(Calendar.DAY_OF_MONTH);      
                    for (int d = 1; d < 43; d++)       {        
                        boolean isDay = d > offs && d <= offs + dim;        
                        String entry = isDay ? String.format(" %2s", d - offs) : " ";        
                        if (d % 7 == 1)           mons[m][2 + (d - 1) / 7] = entry;
                        else           mons[m][2 + (d - 1) / 7] += entry;      
                    }      
                    offs = (offs + dim) % 7;      
                    date.add(Calendar.MONTH, 1);    
                }    
                System.out.printf("%" + (w / 2 + 10) + "s%n", "[Snoopy Picture]");    
                System.out.printf("%" + (w / 2 + 4) + "s%n%n", year);    
                for (int r = 0; r < nRows; r++)     {      
                    for (int i = 0; i < 8; i++)       {        
                        for (int c = r * nCols; c < (r + 1) * nCols && c < 12; c++)         {          
                            System.out.printf(" %s", mons[c][i]);        
                        }        
                        System.out.println();      
                    }      
                    System.out.println();    
                }  
            }
        }
        class Number {  
            int x;
        }
        class CallByValue {  
            public static void main(String[] args)   {    
                int y = 4;     //call by value        increase(y);        //call by reference         Number n = new Number();        n.x = 3;        System.out.println("Value of x before increment " + n.x);        increment(n);        System.out.println("Value of x after increment " + n.x);    }
                  
                private static void increase(int y)   {    
                    System.out.println("pass by value and increment result : " + y++);  
                }  
                public static void increment(Number n)   {    
                    n.x = n.x + 1;  
                }
            }
            class CommandLineExample {   // arugments entered in command line are     // passed in main(String args[]) method    public static final void main(String args[])    {        for (int i = 0; i < args.length; i++)        {            System.out.println("args[" + i + "] -> " + args[i]);        }    }}import java.io.*;
                class VowelsConsonants {  
                    public static void main(String[] args) throws Exception   {    
                        String str;    
                        int vowels = 0, num = 0, blanks = 0, cons = 0;    
                        char ch;    
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
                        System.out.print("Enter a String : ");    
                        str = br.readLine();    
                        for (int i = 0; i < str.length(); i++)     {      
                            ch = str.charAt(i);      
                            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')         vowels++;      
                            else if (Character.isDigit(ch))         num++;      
                            else if (Character.isWhitespace(ch))         blanks++;      
                            else       {        
                                cons++;      
                            }    
                        }    
                        System.out.println("Vowels : " + vowels);    
                        System.out.println("Numbers : " + num);    
                        System.out.println("Blanks : " + blanks);    
                        System.out.println("Consonants : " + cons);  
                    }
                }
                class StaticExample {  
                    static int st = 0;  
                    int ns = 0;  
                    StaticExample()   {    
                        ns++;    
                        System.out.println(ns);  
                    }  
                    public static void main(String args[])   {     //Non-Static variables requires object to get accessed in Static method        System.out.println("Counter with non-static variable:");
                            
                        StaticExample s = new StaticExample();    
                        StaticExample s1 = new StaticExample();    
                        StaticExample s2 = new StaticExample();     //Static variables can be accessed without reference(object) in Static method        System.out.println("\nCounter with static variable:");
                            
                        for (int i = 0; i < 3; i++)     {      
                            st++;      
                            System.out.println(st);    
                        }  
                    }
                }
                import java.util.*;
                import java.text.DecimalFormat;
                class CurrencyConverter {  
                    public static void main(String[] args)   {    
                        double rupee, dollar, pound, code, euro, yen;    
                        DecimalFormat f = new DecimalFormat("##.###");    
                        Scanner sc = new Scanner(System.in);    
                        System.out.println("Enter the currency code 1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Yen");    
                        code = sc.nextInt();     //For Rupees Conversion        if (code == 1)        {            System.out.println("Enter amount in rupees");            rupee = sc.nextFloat();
                              
                        dollar = rupee / 66;      
                        System.out.println("Dollar : " + f.format(dollar));      
                        pound = rupee / 98;      
                        System.out.println("Pound : " + f.format(pound));      
                        euro = rupee / 72;      
                        System.out.println("Euro : " + f.format(euro));      
                        yen = rupee / 0.55;      
                        System.out.println("Yen : " + f.format(yen));    
                    }     //For Dollar Conversion        else if (code == 2)        {            System.out.println("Enter amount in dollar");            dollar = sc.nextFloat();
                          
                    rupee = dollar * 66;      
                    System.out.println("Rupees : " + f.format(rupee));
                    pound = dollar * 0.67;      
                    System.out.println("Pound : " + f.format(pound));      
                    euro = dollar * 0.92;      
                    System.out.println("Euro : " + f.format(euro));      
                    yen = dollar * 120.90;      
                    System.out.println("Yen : " + f.format(yen));    
                }     //For Pound Conversion        else if (code == 3)        {            System.out.println("Enter amount in Pound");            pound = sc.nextFloat();
                      
                rupee = pound * 98;      
                System.out.println("Rupees : " + f.format(rupee));      
                dollar = pound * 1.49;      
                System.out.println("Dollar : " + f.format(dollar));      
                euro = pound * 1.36;      
                System.out.println("Euro : " + f.format(euro));      
                yen = pound * 179.89;      
                System.out.println("Yen : " + f.format(yen));    
            }     //For Euro Conversion        else if (code == 4)        {            System.out.println("Enter amount in Euro");euro = sc.nextFloat();
                  
            rupee = euro * 72;      
            System.out.println("Rupees : " + f.format(rupee));      
            dollar = euro * 1.09;      
            System.out.println("Dollar : " + f.format(dollar));      
            pound = euro * 0.73;      
            System.out.println("Pound : " + f.format(pound));      
            yen = euro * 131.84;      
            System.out.println("Yen : " + f.format(yen));    
        }     //For Yen Conversion        else if (code == 5)        {            System.out.println("Enter amount in Yen");            yen = sc.nextFloat();
              
        rupee = yen * 0.55;      
        System.out.println("Rupees : " + f.format(rupee));      
        dollar = yen * 0.01;      
        System.out.println("Dollar : " + f.format(dollar));      
        pound = yen * 0.01;      
        System.out.println("Pound : " + f.format(pound));      
        euro = yen * 0.01;      
        System.out.println("Euro : " + f.format(euro));    
    }    
    else       System.out.println("Invalid Code");  
}
}
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class Dates {  
    public static void main(final String[] args)   {    
            Calendar now = new GregorianCalendar(); //months are 0 indexed, dates are 1 indexed        DateFormatSymbols symbols = new DateFormatSymbols(); //names for our months and weekdays
                 //plain numbers way        System.out.println(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE));
                 //words way        System.out.print(symbols.getWeekdays()[now.get(Calendar.DAY_OF_WEEK)] + ", ");        System.out.print(symbols.getMonths()[now.get(Calendar.MONTH)] + " ");        System.out.println(now.get(Calendar.DATE) + ", " + now.get(Calendar.YEAR));
                 //using DateFormat        Date date = new Date();        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");        System.out.println(format1.format(date));        DateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");        System.out.println(format2.format(date));    }}import java.util.TimeZone;import java.util.concurrent.TimeUnit;
            class TimeZoneExample {  
                public static void main(String[] args)   {    
                    String[] ids = TimeZone.getAvailableIDs();    
                    for (String id: ids)     {      
                        System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));    
                    }    
                    System.out.println("\nTotal TimeZone ID " + ids.length);  
                }  
                private static String displayTimeZone(TimeZone tz)   {    
                    long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());    
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())         - TimeUnit.HOURS.toMinutes(hours);     // avoid -4:-30 issue        minutes = Math.abs(minutes);
                        
                    String result = "";    
                    if (hours > 0)     {      
                        result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());    
                    }    
                    else     {      
                        result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());    
                    }    
                    return result;  
                }
            }