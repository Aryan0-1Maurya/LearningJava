import java.util.Scanner;
class AddNumbers {  
    public static void main(String args[])   {    
        int x, y, z;    
        System.out.print("Enter two integers to calculate their sum : ");    
        Scanner in = new Scanner(System.in);    
        x = in .nextInt();    
        y = in .nextInt();    
        z = x + y;    
        System.out.println("Sum of entered integers = " + z);  
    }
}
import java.io.*;
class BufferedReaderExample {  
    public static void main(String[] args) throws Exception   {    
        String str;    
        int i;    
        float f;    
        double d;    
        long l;    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.println("Enter String");    
        str = br.readLine();    
        System.out.println("Enter Integer");    
        i = Integer.parseInt(br.readLine());    
        System.out.println("Enter float");    
        f = Float.parseFloat(br.readLine());    
        System.out.println("Enter double");    
        d = Double.parseDouble(br.readLine());    
        System.out.println("String : " + str);    
        System.out.println("Integer : " + i);    
        System.out.println("Float : " + f);    
        System.out.println("Double : " + d);  
    }
}
class CommandLineArgs  {  
    public static void main(String args[])    {    
        int a, b, c;         
        a = Integer.parseInt(args[0]);    
        b = Integer.parseInt(args[1]);    
        c = Integer.parseInt(args[2]);    
        if (a > b && a > c) {      
            System.out.println("Largest Number is : " + a);    
        } else if (b > c) {      
            System.out.println("Largest Number is : " + b);    
        } else {      
            System.out.println("Largest Number is : " + c);    
        }  
    }
}
class IfElseDemo {  
    public static void main(String args[])   {    
        int x = 30;    
        if (x == 10)     {      
            System.out.print("Value of X is 10");    
        }    
        else if (x == 20)     {      
            System.out.print("Value of X is 20");    
        }    
        else if (x == 30)     {      
            System.out.print("Value of X is 30");    
        }    
        else     {      
            System.out.print("This is else statement");    
        }  
    }
}
class SwitchCaseDemo {  
    public static void main(String args[])   {    
        char grade = 'C';    
        switch (grade)     {      
            case 'A':
                        System.out.println("Excellent!");        
                break;      
            case 'B':
                        System.out.println("Good");        
                break;      
            case 'C':
                        System.out.println("Well done");        
                break;      
            case 'D':
                        System.out.println("You passed");      
            case 'F':
                        System.out.println("Better try again");        
                break;      
            default:
                        System.out.println("Invalid grade");    
        }    
        System.out.println("Your grade is " + grade);  
    }
}
class HelloWorld {  
    public static void main(String args[])   {    
        System.out.println("Hello World!!");  
    }
}
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