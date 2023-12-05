class ArrayIndexOutOfBounds
{

    public static void main(String[] args)
    {

        String languages[] = {"C", "C++", "Java", "Perl", "Python"};

        try
        {

            for (int c = 1; c <= 5; c++)
            {

                System.out.println(languages[c]);

            }

        }
        catch (Exception e)
        {

            System.out.println(e);

        }
    }
}class MyOwnException
{

    public static void main(String[] a)
    {

        try
        {

            MyOwnException.myTest(null);

        }
        catch (MyAppException mae)
        {

            System.out.println("Inside catch block: " + mae.getMessage());

        }
    }

    static void myTest(String str) throws MyAppException
    {

        if (str == null)
        {

            throw new MyAppException("String val is null");

        }
    }
}

class MyAppException extends Exception
{

    private String message = null;

    public MyAppException()
    {
        super();
    }

    public MyAppException(String message)
    {

        super(message);
        this.message = message;

    }

    public MyAppException(Throwable cause)
    {

        super(cause);

    }

    @Override
    public String toString()
    {

        return message;

    }

    @Override
    public String getMessage()
    {

        return message;

    }
}import java.util.Scanner;

class DivisionByZero
{

    public static void main(String[] args)
    {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        // try block

        try
        {

            result = a / b;
            System.out.println("Result = " + result);

        }

        // catch block

        catch (ArithmeticException e)
        {

            System.out.println("Exception caught: Division by zero.");

        }
    }
}import java.net.MalformedURLException;
import java.net.URL;

class MyMultipleCatchBlocks
{

    public static void main(String a[])
    {

        MyMultipleCatchBlocks mmcb = new MyMultipleCatchBlocks();
        mmcb.execute(1);
        mmcb.execute(2);

    }

    public void execute(int i)
    {

        try
        {

            if (i == 1)
            {

                getIntValue("7u");

            }
            else
            {

                getUrlObj("www.junksite.com");

            }

        }
        catch (NumberFormatException nfe)
        {

            System.out.println("Inside NumberFormatException... "
                                       + nfe.getMessage());

        }
        catch (MalformedURLException mue)
        {

            System.out.println("Inside MalformedURLException... "
                                       + mue.getMessage());

        }
        catch (Exception ex)
        {

            System.out.println("Inside Exception... " + ex.getMessage());

        }
    }

    public int getIntValue(String num)
    {

        return Integer.parseInt(num);

    }

    public URL getUrlObj(String urlStr) throws MalformedURLException
    {

        return new URL(urlStr);

    }
}class MyExplicitThrow
{

    public static void main(String a[])
    {

        try
        {

            MyExplicitThrow met = new MyExplicitThrow();
            System.out
                    .println("length of JUNK is " + met.getStringSize("JUNK"));

            System.out.println("length of WRONG is "
                                       + met.getStringSize("WRONG"));

            System.out.println("length of null string is "
                                       + met.getStringSize(null));

        }
        catch (Exception ex)
        {

            System.out.println("Exception message: " + ex.getMessage());

        }
    }

    public int getStringSize(String str) throws Exception
    {

        if (str == null)
        {

            throw new Exception("String input is null");

        }

        return str.length();
    }
}class UsingFinally
{

    public static void main(String[] args)
    {

        try
        {

            int a = 3 / 0;
            System.out.println(a);

        }
        catch (Exception e)
        {

            System.out.println(e);

        }
        finally
        {

            System.out.println("finally block will execute always.");

        }
    }
}import java.net.MalformedURLException;
import java.net.URL;

class MyTryBlockOnly
{

    public static void main(String a[]) throws MalformedURLException
    {

        try
        {

            URL url = new URL("http://www.google.com");

        }
        finally
        {

            System.out.println("In finally block");

        }
    }
}import java.io.IOException;

class UsingThrows
{

    void m() throws IOException
    {

        throw new IOException("device error");// checked exception

    }

    void n() throws IOException
    {

        m();

    }

    void p()
    {

        try
        {

            n();

        }
        catch (Exception e)
        {

            System.out.println("exception handled");

        }
    }

    public static void main(String args[])
    {

        UsingThrows obj = new UsingThrows();
        obj.p();
        System.out.println("normal flow...");

    }
}