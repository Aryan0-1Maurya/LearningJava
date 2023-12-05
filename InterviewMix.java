import java.util.*;
class GuessGame {
  public static void main(String[] args) {
    Random r = new Random();
    int numberoftries = 0;
    int numbertoguess = r.nextInt(50);
    boolean f = false;
    int guess;
    Scanner sc = new Scanner(System.in);
    try {
      while (f == false) {
        System.out.println("Guess number between 1-50");
        guess = sc.nextInt();
        numberoftries++;
        if (guess > 1 && guess < 50) {
          if (guess == numbertoguess) {
            f = true;
          } else if (guess > numbertoguess) {
            System.out.println("Guess is too high");
          } else if (guess < numbertoguess) {
            System.out.println("Guess is too low");
          }
        } else {
          throw new Exception();
        }
      }
      System.out.println("\nYou win");
      System.out.println("Number was : " + numbertoguess);
      System.out.println("Number of tries : " + numberoftries);
    } catch (Exception e) {
      System.out.println("Number is either numeric or out of range(1-50)");
    }
  }
}
class MyRintEx {
  public static void main(String args[]) {
    System.out.println("rint value of 13.345 is: " + Math.rint(13.345));
    System.out.println("rint value of 38.482 is: " + Math.rint(38.482));
    System.out.println("rint value of 46.65 is: " + Math.rint(46.65));
  }
}
import java.util.*;
class Marksheet {
  public static void main(String[] args) {
    int marks;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks");
    marks = sc.nextInt();
    if (marks >= 75 && marks <= 100) {
      System.out.println("Your grade is A");
    } else if (marks >= 60 && marks < 75) {
      System.out.println("Your grade is B");
    } else if (marks >= 50 && marks < 60) {
      System.out.println("Your grade is C");
    } else if (marks >= 40 && marks < 50) {
      System.out.println("Your grade is D");
    } else if (marks < 40) {
      System.out.println("Your grade is Fail");
    }
  }
}
import java.io.*;
class LeapYear {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter year : "); //year we want to check        int year = Integer.parseInt(br.readLine());
    //if year is divisible by 4, it is a leap year

    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) System.out.println("Year " + year + " is a leap year");
    else System.out.println("Year " + year + " is not a leap year");
  }
}
import java.util.*;
class LargestNumber {
  public static void main(String args[]) {
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers : ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num1 >= num2) {
      System.out.println("\nLargest Number is : " + num1);
    } else {
      System.out.println("\nLargest Number is : " + num2);
    }
  }
}
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
class KeyboardMacroDemo {
  public static void main(String args[]) {
    final JFrame frame = new JFrame();
    String directions = "<html><b>Ctrl-S</b> to show frame title<br>" + "<b>Ctrl-H</b> to hide it</html>";
    frame.add(new JLabel(directions));
    frame.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S) {
          frame.setTitle("Hello there");
        } else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_H) {
          frame.setTitle("");
        }
      }
    });
    frame.pack();
    frame.setVisible(true);
  }
}
class Animal {}
//Dog inherits Animal  class Dog1 extends Animal{    public static void main(String args[])    {        Dog1 d = new Dog1();

System.out.println("d is instanceof Animal: ");
System.out.println(d instanceof Animal); //true      }}import java.text.SimpleDateFormat;import java.util.Date;
class Main {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("h");
    System.out.println("hour in h format : " + sdf.format(date));
  }
}
class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(String.valueOf(i));
      }
    }
  }
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
class EmailValidation {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter email id : ");
    String email = br.readLine();
    boolean result = isValidEmail(email);
    if (result) {
      System.out.print(email + " is valid email address.");
    } else {
      System.out.print(email + " is not a valid email address.");
    }

  }
  public static boolean isValidEmail(String email) {
    String s = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    Pattern emailPattern = Pattern.compile(s);
    Matcher m = emailPattern.matcher(email);
    return m.matches();
  }
}
import java.awt.*;
import javax.swing.*;
class Pendulum extends JPanel implements Runnable {
  private double angle = Math.PI / 2;
  private int length;
  public Pendulum(int length) {
    this.length = length;
    setDoubleBuffered(true);
  }
  @Override public void paint(Graphics g) {
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, getWidth(), getHeight());
    g.setColor(Color.BLACK);
    int anchorX = getWidth() / 2, anchorY = getHeight() / 4;
    int ballX = anchorX + (int)(Math.sin(angle) * length);
    int ballY = anchorY + (int)(Math.cos(angle) * length);
    g.drawLine(anchorX, anchorY, ballX, ballY);
    g.fillOval(anchorX - 3, anchorY - 4, 7, 7);
    g.fillOval(ballX - 7, ballY - 7, 14, 14);
  }

  public void run() {
    double angleAccel, angleVelocity = 0, dt = 0.1;
    while (true) {
      angleAccel = -9.81 / length * Math.sin(angle);
      angleVelocity += angleAccel * dt;
      angle += angleVelocity * dt;
      repaint();
      try {
        Thread.sleep(15);
      } catch (InterruptedException ex) {}
    }
  }
  @Override public Dimension getPreferredSize() {
    return new Dimension(2 * length + 50, length / 2 * 3);
  }
  public static void main(String[] args) {
    JFrame f = new JFrame("Pendulum");
    Pendulum p = new Pendulum(200);
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
    new Thread(p).start();
  }
}
class MyBooleanConstants {
  public static void main(String a[]) {
    System.out.println("Boolean object corresponding to the primitive value :" + Boolean.FALSE);
    System.out.println("Boolean object corresponding to the primitive value :" + Boolean.TRUE);
  }
}
class Alphabets {
  public static void main(String args[]) {
    char c = 'A';
    do {
      System.out.println(c);
      c++;
    } while (c <= 'Z');
  }
}
import java.util.*;
class PrintCurrentDateandTime {
  public static void main(String args[]) {
    int day, month, year;
    int second, minute, hour;
    GregorianCalendar date = new GregorianCalendar();
    day = date.get(Calendar.DAY_OF_MONTH);
    month = date.get(Calendar.MONTH);
    year = date.get(Calendar.YEAR);
    second = date.get(Calendar.SECOND);
    minute = date.get(Calendar.MINUTE);
    hour = date.get(Calendar.HOUR);
    System.out.println("Current date is " + day + "/" + (month + 1) + "/" + year);
    System.out.println("Current time is " + hour + " : " + minute + " : " + second);
  }
}
import java.util.*;
class RemoveZero {
  public static void main(String args[]) {
    int a, x, b;
    char z;
    String n, k = "", str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    str = sc.next();
    x = str.length();
    for (int i = 0; i < x; i++) {
      z = str.charAt(i);
      if (z == '0') {} else k += z;
    }
    System.out.println("Numbers without zero : " + k);
  }
}
import java.io.*;
class Validation {
  public static void main(String args[]) throws Exception {
    String username, password;
    String user1, pass1;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Login Details");
    System.out.println("Enter username");
    username = br.readLine();
    System.out.println("Enter password");
    password = br.readLine();
    System.out.println("Enter details for validation");
    System.out.println();
    System.out.println("Enter username");
    user1 = br.readLine();
    System.out.println("Enter password");
    pass1 = br.readLine();
    if (user1.equals(username) && pass1.equals(password)) {
      System.out.println("You are a valid user");
    } else {
      System.out.println("You are not a valid user");
    }
  }
}
class TestStatic {
  static class InnerClass {
    public static void InnerMethod() {
      System.out.println("Static Inner Class!");
    }
  }
  public static void main(String args[]) {
    TestStatic.InnerClass.InnerMethod();
  }
}
class MyStringToBoolean {
  public static void main(String a[]) {
    String strBool = "true";
    Boolean bool = Boolean.parseBoolean(strBool);
    System.out.println(bool);
  }
}
import java.util.*;
class StackDemo {
  static void showpush(Stack st, int a) {
    st.push(new Integer(a));
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }
  static void showpop(Stack st) {
    System.out.print("pop -> ");
    Integer a = (Integer) st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  }
  public static void main(String args[]) {
    Stack st = new Stack();
    System.out.println("stack: " + st);
    showpush(st, 42);
    showpush(st, 66);
    showpush(st, 99);
    showpop(st);
    showpop(st);
    showpop(st);
    try {
      showpop(st);
    } catch (EmptyStackException e) {
      System.out.println("empty stack");
    }
  }
}
import java.util.*;
class SquareRootWithoutInbuiltFunction {
  public static void main(String args[]) {
    int number;
    double t, squareroot;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    number = sc.nextInt(); //Logic to find square root of a number without sqrt function      
    squareroot = number / 2;

    do {
      t = squareroot;
      squareroot = (t + (number / t)) / 2;
    } while ((t - squareroot) != 0);
    System.out.println("Square Root of a Number is : " + squareroot);
  }
} //Scanner Class is used to get input from user
import java.util.Scanner;
class ScannerClassExample {
  public static void main(String args[]) {
    int intNum;
    long longNum;
    float floatNum;
    double doubleNum;
    String line;
    String str;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter line ");
    line = in.nextLine();
    System.out.print("Enter string ");
    str = in.next();
    System.out.print("Enter integer ");
    intNum = in.nextInt();
    System.out.print("Enter long ");
    longNum = in.nextLong();
    System.out.print("Enter float ");
    floatNum = in.nextFloat();
    System.out.print("Enter double ");
    doubleNum = in.nextDouble();
    System.out.println("\nEntered details are as follows: ");
    System.out.println("Line: " + line);
    System.out.println("String: " + str);
    System.out.println("Integer: " + intNum);
    System.out.println("Long: " + longNum);
    System.out.println("Float: " + floatNum);
    System.out.println("Double: " + doubleNum);
  }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.text.DateFormat;
class ZodiacSigns {
  public static void main(String[] args) {
    System.out.println(df.format(calendar.getTime()));
    int day = 0;
    int month = 0;
    int year = 0;
    while (true) { // Read in a date   
      System.out.print("Enter the year: ");
      year = readInt();
      while (true) {
        System.out.print("Enter the month number January is 1, December is 12: ");
        month = readInt(); // Change month to zero-based and validate                if (validMonth(--month))                                                            break;            }

        while (true) {
          System.out.print("Enter the day in the month: ");
          day = readInt();
          if (validDay(day, month, year)) break;
        } // determine the sign      
        calendar.set(year, month, day); // Match the year for the sign start dates    
        for (int i = 0; i < signStartDates.length; ++i) {
          signStartDates[i].set(GregorianCalendar.YEAR, year);
        }

        for (int i = 0; i < signStartDates.length; ++i) {
          if (calendar.after(signStartDates[i]) && calendar.before(signStartDates[(i + 1) % signStartDates.length])) {
            System.out.println(df.format(calendar.getTime()) + " is in the sign of " + signs[i]);
            break;
          }
        } // Try another date?    
        System.out.println("Do you want to try another date(Enter Y or N)?");
        if (!yes()) {
          break;
        }
      }
    }
    // Validate the month value  
    private static boolean validMonth(int month) {
      if (month >= 0 && month <= 11) return true;
      else System.out.println("The month value must be from 1 to 12. Try again.");
      return false;
    }
    // Validate the day value for the month and year 
    private static boolean validDay(int day, int month, int year) {
      /* A valid day must be:                 - between 1 and 31                 - less than 31 when the month is April, June, September, or November                 - less than 29 when the month is February and it is not a leap year                 - less than 30 when the month is February and it is a leap year    */
      if (day < 0 || day > 31) {
        System.out.println("Day values must be between 1 and 31. Try again.");
        return false;
      }

      if (day > 30 && (month == 3 || month == 5 || month == 8 || month == 10)) {
        System.out.println("Day values must be less than 31 when the month" + " is " + MONTH_NAMES[month] + ". Try again.");
        return false;
      }
      if (day > 28 && month == 1 && !calendar.isLeapYear(year)) {
        System.out.println(year + " is not a leap year so day values must be less than 29. Try again.");
        return false;
      }
      if (day > 29 && month == 1 && calendar.isLeapYear(year)) {
        return false;
      }
      return true;
    } // Reads an integer from the keyboard  
    private static int readInt() {
      int value = 0;
      while (true) {
        try {
          value = Integer.parseInt(in.readLine().trim());
          return value;
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Try again.");
        } catch (IOException e) {
          System.out.println("Error reading for the keyboard." + e.getMessage());
        }
      }
    }
    private static boolean yes() {
      String str = null;
      while (true) {
        try {
          str = in.readLine().trim();
        } catch (IOException e) {
          System.out.println("Error reading for the keyboard." + e.getMessage());
        }

        if (str.equalsIgnoreCase("Y")) {
          return true;
        } else if (str.equalsIgnoreCase("N")) {
          break;
        } else {
          System.out.print("Invalid input. Try again. Enter Y or N: ");
        }
      }
      return false;
    } // Keyboard input   
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    // Names for Zodiac signs and start dates. Remember - months start at zero.
    private static String[] signs = {
      "Aquarius",
      "Pisces",
      "Aries",
      "Taurus",
      "Gemini",
      "Cancer",
      "Leo",
      "Virgo",
      "Libra",
      "Scorpio",
      "Sagittarius",
      "Capricorn"
    };
    private static GregorianCalendar[] signStartDates = {
      new GregorianCalendar(2002, 0, 20), // Aquarius start date          
      new GregorianCalendar(2002, 1, 19), // Pisces start date      
      new GregorianCalendar(2002, 2, 21), // Aries start date    
      new GregorianCalendar(2002, 3, 20), // Taurus start date      
      new GregorianCalendar(2002, 4, 21), // Gemini start date        
      new GregorianCalendar(2002, 5, 21), // Cancer start date         
      new GregorianCalendar(2002, 6, 23), // Leo start date          
      new GregorianCalendar(2002, 7, 23), // Virgo start date       
      new GregorianCalendar(2002, 8, 23), // Libra start date    
      new GregorianCalendar(2002, 9, 23), // Scorpio start date       
      new GregorianCalendar(2002, 10, 22), // Sagittarius start date   
      new GregorianCalendar(2002, 11, 22), // Capricorn start date  
    };
    private static GregorianCalendar calendar = new GregorianCalendar();
    private static final String[] MONTH_NAMES = {
      "January",
      "February",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December"
    }; // Date formatter for displaying dates   
    private static DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
  }