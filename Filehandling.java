import java.io.*;
class CopyFile {  
    public static void main(String args[]) throws IOException   {    
        FileInputStream in = null;    
        FileOutputStream out = null;    
        try     {       in = new FileInputStream("input.txt");      
            out = new FileOutputStream("output.txt");      
            int c;      
            while ((c = in .read()) != -1)       {        
                out.write(c);      
            }    
        }    
        finally     {      
            if ( in != null)       {         in .close();      
            }      
            if (out != null)       {        
                out.close();      
            }    
        }  
    }
}
import java.io.*;
class CopyFile {  
    public static void main(String args[]) throws IOException   {    
        FileReader in = null;    
        FileWriter out = null;    
        try     {       in = new FileReader("input.txt");      
            out = new FileWriter("output.txt");      
            int c;      
            while ((c = in .read()) != -1)       {        
                out.write(c);      
            }    
        }    
        finally     {      
            if ( in != null)       {         in .close();      
            }      
            if (out != null)       {        
                out.close();      
            }    
        }  
    }
}
import java.io.*;
class CreateDirectoryTest {  
    public static void main(String args[])   {    
        if (new File("docs").mkdir())       System.out.println("Successfully created directory.");    
        else       System.out.println("Failed to create directory.");  
    }
}
import java.io.*;
class CreateFileTest {  
    public static void main(String args[])   {    
        try     {      
            if (new File("output.txt").createNewFile())         System.out.println("Successfully created File.");      
            else         System.out.println("Failed to create file.");    
        }    
        catch (IOException e)     {      
            System.err.println(e.getMessage());    
        }  
    }
}
import java.io.File;
public class DirectoryDeleteTest { 
    public static boolean deleteFile(String filename)   { 
        boolean exists = new File(filename).delete(); 
        return exists; 
    } 
    public static void test(String type, String filename)   {      
        System.out.println("The following " + type +   " called " + filename + (deleteFile(filename) ?   " was deleted." : " does not exist.")); 
    } 
    public static void main(String args[])  { 
        test("directory", File.seperator + "docs" + File.seperator);     
    }
}
import java.io.File;
class FileDeleteTest {  
    public static boolean deleteFile(String filename)   {    
        boolean exists = new File(filename).delete();    
        return exists;  
    }  
    public static void test(String type, String filename)   {    
        System.out.println("The following " + type + " called " + filename + (deleteFile(filename) ? " was deleted." : " does not exist."));  
    }  
    public static void main(String args[])   {    
        test("file", "Main.java");  
    }
}
import java.io.*;
class ReadBinaryFile {  
    public static void main(String[] args)   {     // The name of the file to open.        String fileName = "file.txt";
                
            FileInputStream inputStream = null;    
            try     {       // Use this for reading the data.            byte[] buffer = new byte[1000];
                      
                inputStream = new FileInputStream(fileName);       // read fills buffer with data and returns            // the number of bytes read (which of course            // may be less than the buffer size, but            // it will never be more).            int total = 0;            int nRead = 0;
                      
                while ((nRead = inputStream.read(buffer)) != -1)       {         // Convert to String so we can display it.                // Of course you wouldn't want to do this with                // a 'real' binary file.                System.out.println(new String(buffer));                total += nRead;            }
                          
                    System.out.println("Read " + total + " bytes");    
                }    
                catch (FileNotFoundException ex)     {      
                    System.out.println("Unable to open file '" + fileName + "'");    
                }    
                catch (IOException ex)     {      
                    System.out.println("Error reading file '" + fileName + "'");       // Or we could just do this:            // ex.printStackTrace();        }        finally        {            // Always close files.            try            {              if (inputStream != null)                {                    inputStream.close();                }            }            catch (IOException e)            {            }        }    }}import java.io.*;
                    class ReadFile {  
                        public static void main(String[] args)   {     // The name of the file to open.        String fileName = "file.txt";
                                     // This will reference one line at a time        String line = null;
                                    
                                BufferedReader bufferedReader = null;    
                                try     {       // FileReader reads text files in the default encoding.            FileReader fileReader = new FileReader(fileName);
                                           // Always wrap FileReader in BufferedReader.            bufferedReader = new BufferedReader(fileReader);
                                          
                                    while ((line = bufferedReader.readLine()) != null)       {        
                                        System.out.println(line);      
                                    }    
                                }    
                                catch (FileNotFoundException ex)     {      
                                    System.out.println("Unable to open file '" + fileName + "'");    
                                }    
                                catch (IOException ex)     {      
                                    System.out.println("Error reading file '" + fileName + "'");       // Or we could just do this:            // ex.printStackTrace();        }        finally        {            // Always close files.            try            {                if (bufferedReader != null)                {                    bufferedReader.close();                }            }            catch (IOException e)            {            }        }    }}import java.io.*;
                                    class Employee implements java.io.Serializable {  
                                            public String name;  
                                            public String address;   // transient variable are not serialized    public transient int id;    public int number;}
                                            class SerializeDemo {  
                                                public static void main(String[] args)   {    
                                                    Employee e = new Employee();    
                                                    e.name = "Andy Rubin";    
                                                    e.address = "Chappaqua, New York, United States";    
                                                    e.id = 007;    
                                                    e.number = 5893254;    
                                                    try     {      
                                                        FileOutputStream fileOut = new FileOutputStream("employee.txt");      
                                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);      
                                                        out.writeObject(e);      
                                                        out.close();      
                                                        fileOut.close();      
                                                        System.out.printf("Serialized data is saved in /employee.ser");    
                                                    }    
                                                    catch (IOException i)     {      
                                                        i.printStackTrace();    
                                                    }  
                                                }
                                            }
                                            import java.io.*;
                                            class WriteBinaryFile {  
                                                public static void main(String[] args)   {     // The name of the file to open.        String fileName = "file.txt";
                                                            
                                                        BufferedWriter bufferedWriter = null;    
                                                        try     {       // Assume default encoding.            FileWriter fileWriter = new FileWriter(fileName);
                                                                   // Always wrap FileWriter in BufferedWriter.            bufferedWriter = new BufferedWriter(fileWriter);
                                                                   // Note that write() does not automatically            // append a newline character.            bufferedWriter.write("Hello there,");            bufferedWriter.write(" here is some text.");            bufferedWriter.newLine();            bufferedWriter.write("We are writing");            bufferedWriter.write(" the text to the file.");
                                                                   // Always close files.            bufferedWriter.close();        }        catch (IOException ex)        {            System.out.println("Error writing to file '" + fileName + "'");
                                                                   // Or we could just do this:            // ex.printStackTrace();        }        finally        {            // Always close files.            try            {                if (bufferedWriter != null)                {                    bufferedWriter.close();                }            }            catch (IOException e)            {                            }        }    }}import java.io.*;
                                                            class WriteFile {  
                                                                public static void main(String[] args)   {     // The name of the file to open.        String fileName = "file.txt";
                                                                            
                                                                        BufferedWriter bufferedWriter = null;    
                                                                        try     {       // Assume default encoding.            FileWriter fileWriter = new FileWriter(fileName);
                                                                                   // Always wrap FileWriter in BufferedWriter.            bufferedWriter = new BufferedWriter(fileWriter);
                                                                                   // Note that write() does not automatically            // append a newline character.            bufferedWriter.write("Hello there,");            bufferedWriter.write(" here is some text.");            bufferedWriter.newLine();            bufferedWriter.write("We are writing");            bufferedWriter.write(" the text to the file.");        }        catch (IOException ex)        {            System.out.println("Error writing to file '" + fileName + "'");            // Or we could just do this:            // ex.printStackTrace();        }        finally        {            // Always close files.            try            {                if (bufferedWriter != null)                {                    bufferedWriter.close();                }            }            catch (IOException e)            {                            }        }    }}