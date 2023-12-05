import java.io. * ;
class Anagrams {  public static void main(String args[]) throws Exception   {    Anagrams a = new Anagrams();    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    System.out.print("Enter first string: ");    String str1 = br.readLine();    System.out.print("Enter second string: ");    String str2 = br.readLine();    int flag = a.Anagram(str1, str2);    
    if (flag == 0)     {      System.out.print("\nResult: " + str1 + " and " + str2 + " are anagrams.");    
    }    
    else     {      System.out.print("\nResult: " + str1 + " and " + str2 + " are not anagrams.");    
    }    System.out.println();  
  }  public int Anagram(String str1, String str2)   {    
    if (str1.equals(str2))     {      
      return 0;    
    }    
    return 1;  
  }
}
class CharToASCII {  public static int CharToASCII(final char character)   {    
    return (int) character;  
  }  public static char ASCIIToChar(final int ascii)   {    
    return (char) ascii;  
  }  public static void main(String args[])   {    char a = 'a';    int i = 65;    System.out.println("Char to ASCII : " + a + " ascii is " + CharToASCII(a));    System.out.println("ASCII to char : " + i + " char is " + ASCIIToChar(i));  
  }
}
class StringCase {  public static void main(String args[])   {    String str = "Java Programs With Output";     //toUpperCase() method converts the complete string in upper case        String strUpper = str.toUpperCase();
         //toLowerCase() method converts the complete string in lower case        String strLower = str.toLowerCase();
         //printing changed case string        System.out.println("Upper Case: " + strUpper);        System.out.println("Lower Case: " + strLower);    }}import java.util.*;
    class Palindrome {  public static void main(String args[])   {    String original,
        reverse = "";    Scanner in =new Scanner(System. in );    System.out.print("Enter a string : ");    original = in.nextLine();    int length = original.length();    
        for (int i = length - 1; i >= 0; i--)     {      reverse = reverse + original.charAt(i);    
        }    
        if (original.equals(reverse))      System.out.println("Entered string is a palindrome.");    
        else      System.out.println("Entered string is not a palindrome.");  
      }
    }
    import java.util.Scanner;
    class PigLatin {  public static void main(String[] args)   {    Scanner sc = new Scanner(System. in );    final String vowels = "aeiouAEIOU";    System.out.println("Enter done to exit...");    System.out.print("Enter your word : ");    String word = sc.nextLine();    
        while (!word.equalsIgnoreCase("done"))     {      String beforVowel = "";      int cut = 0;      
          while (cut < word.length() && !vowels.contains("" + word.charAt(cut)))       {        beforVowel += word.charAt(cut);        cut++;      
          }      
          if (cut == 0)       {        cut = 1;        word += word.charAt(0) + "w";      
          }      System.out.println("PigLatin : " + word.substring(cut) + beforVowel + "ay");      System.out.print("Enter your word : ");      word = sc.nextLine();    
        }  
      }
    }
    import java.io. * ;
    class PunctuationMark {  public static void main(String[] args) throws Exception   {    String str;    int i,
        punct = 0,
        letter = 0,
        spaces = 0;    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    System.out.println("Enter String : ");    str = br.readLine();    
        for (i = 0; i < str.length(); i++)     {      char ch = str.charAt(i);      
          if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')       {        letter++;      
          }      
          else if (ch == ' ' || ch == '\t')       {        spaces++;      
          }      
          else       {        punct++;      
          }    
        }    System.out.println("Number of letter in the string is : " + letter);    System.out.println("Number of spaces in the string is : " + spaces);    System.out.println("Number of punctuation marks in the string is : " + punct);  
      }
    }
    import java.util. * ;
    class Demo {  public static void main(String s[])   {    Scanner sc = new Scanner(System. in );    System.out.print("\nEnter string: ");    String s1 = sc.nextLine();    System.out.print("\nEnter char: ");    char c = sc.next(".").charAt(0);    int count = 0;    char strarr[] = s1.toCharArray();    
        for (int i = 0; i < strarr.length; i++)     {      
          if (strarr[i] == c)       {        count++;      
          }    
        }    System.out.println("\nNo of Occurence found: " + count);  
      }
    }
    import java.util.Scanner;
    class CountWords {  public static int countWords(String str)   {    String words[] = str.split(" ");    int count = words.length;    
        return count;  
      }  public static void main(String[] args)   {    Scanner in =new Scanner(System. in );    System.out.print("Enter a sentence: ");    String sentence = in.nextLine();    System.out.print("Your sentence has " + countWords(sentence)                  + " words.");     //Close Scanner to avoid memory leak        in.close();    }}
        import java.util.Scanner;
        class SubstringsOfAString {  public static void main(String args[])   {    String string,
            sub;    int i,
            c,
            length;    Scanner in =new Scanner(System. in );    System.out.println("Enter a string to print it's all substrings");    string = in.nextLine();    length = string.length();    System.out.println("Substrings of \"" + string + "\" are :-");    
            for (c = 0; c < length; c++)     {      
              for (i = 1; i <= length - c; i++)       {        sub = string.substring(c, c + i);        System.out.println(sub);      
              }    
            }  
          }
        }
        class StringConcat {  public static void main(String args[])   {    String s1 = "Hello";    String s2 = "FreeIT";     //Concatenation        String s3 = s1.concat(s2);
                System.out.println("s1 = " + s1);    System.out.println("s2 = " + s2);    System.out.println("s3 = " + s3);    String s4 = "Hello";     //checking equals        if (s4.equals(s1))        {            System.out.println("s4 is equal to s1");        }        else        {            System.out.println("s4 is not equal to s1");        }    }}import java.util.*;
            class AlphabeticalOrder {  public static void main(String[] args)   {    int n;    String temp;    Scanner s = new Scanner(System. in );         System.out.print("Enter number of names you want to enter : ");    n = s.nextInt();    String names[] = new String[n];    Scanner s1 = new Scanner(System. in );    System.out.println("Enter all the names:");    
                for (int i = 0; i < n; i++)     {      names[i] = s1.nextLine();    
                }    
                for (int i = 0; i < n; i++)      {      
                  for (int j = i + 1; j < n; j++)        {        
                    if (names[i].compareTo(names[j]) > 0)          {          temp = names[i];          names[i] = names[j];          names[j] = temp;        
                    }      
                  }    
                }    System.out.println("Names in Sorted Order : ");    
                for (int i = 0; i < n; i++)      {      System.out.println(names[i]);    
                }  
              }
            }
            import java.util.Arrays;
            class SingleStringSort {  public static void main(String[] args)   {    String original = "edcba";    char[] chars = original.toCharArray();    Arrays.sort(chars);    String sorted = new String(chars);    System.out.println("Pre-sorting string : " + original);    System.out.println("Sorted string : " + sorted);  
              }
            }
            import java.io. * ;
            class ReverseWordIntheSentence {  public static void main(String[] args) throws Exception   {    int strLen,
                i,
                j;    String str;    String reverse = "",
                temp = "";    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    System.out.print("Enter string: ");    str = br.readLine();    strLen = str.length() - 1;    
                for (i = 0; i <= strLen; i++)     {      temp += str.charAt(i);      
                  if ((str.charAt(i) == ' ') || (i == strLen))       {        
                    for (j = temp.length() - 1; j >= 0; j--)         {          reverse += temp.charAt(j);          
                      if ((j == 0) && (i != strLen))            reverse += " ";        
                    }        temp = "";      
                  }    
                }    System.out.println("\nReverse of " + str + " : " + reverse);  
              }
            }
            import java.util.ArrayList;
            import java.io. * ;
            class ReverseSentence {  public static void main(String args[]) throws Exception   {    System.out.print("Enter sentence : ");    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    String sentence = br.readLine();    ArrayList al = new ArrayList();    al = recursiveReverseMethod(sentence, al);    al.trimToSize();    StringBuilder sb = new StringBuilder();    
                for (int i = al.size() - 1; i >= 0; i--)     {      sb.append(al.get(i) + " ");    
                }    System.out.println("Reverse of Sentence : " + sb);  
              }  public static ArrayList recursiveReverseMethod(String sentence, ArrayList al)   {    int index = sentence.indexOf(" ");    al.add(sentence.substring(0, index));    sentence = sentence.substring(index + 1);    
                if (sentence.indexOf(" ") == -1)     {      al.add(sentence.substring(0));      
                  return al;    
                }    
                return recursiveReverseMethod(sentence, al);  
              }
            }
            import java.io. * ;
            class ReverseSentence {  public static void main(String[] args) throws Exception   {    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    System.out.print("Enter sentence : ");    String str = br.readLine();    String words[] = str.split(" ");    System.out.println("Reverse Sentence : ");    
                for (int i = words.length - 1; i >= 0; i--)     {      System.out.print(words[i] + " ");    
                }  
              }
            }
            import java.util. * ;
            class ReverseString {  public static void main(String args[])   {    String original,
                reverse = "";    Scanner in =new Scanner(System. in );    System.out.println("Enter a string to reverse");    original = in.nextLine();    int length = original.length();    
                for (int i = length - 1; i >= 0; i--)     {      reverse = reverse + original.charAt(i);    
                }    System.out.println("Reverse of entered string is: " + reverse);  
              }
            }
            class StringRecursiveReversal {  String reverse = "";  public String reverseString(String str)   {    
                if (str.length() == 1)     {      
                  return str;    
                }    
                else     {      reverse += str.charAt(str.length() - 1)           + reverseString(str.substring(0, str.length() - 1));      
                  return reverse;    
                }  
              }  public static void main(String a[])   {    StringRecursiveReversal srr = new StringRecursiveReversal();    System.out.println("Result: " + srr.reverseString("Java Programs With Output"));  
              }
            }
            import java.io. * ;
            class RepeatStringName {  public static void main(String args[]) throws Exception   {    int i,
                n;    String strName = "";    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    System.out.println("Enter your name: ");    strName = br.readLine();    System.out.println("\nEnter the number of times you want to print your name: ");    n = Integer.parseInt(br.readLine());    System.out.println();    
                for (i = 0; i < n; i++)     {      System.out.print(strName + " ");    
                }  
              }
            }
            import java.util.Scanner;
            class Permutation {  public static void main(String args[])   {    System.out.print("Please enter the string for permutation : ");    Scanner in =new Scanner(System. in );    String original = in.nextLine();    System.out.println("\nResults are :");    permute(original);  
              }  public static void permute(String input)   {    int inputLength = input.length();    boolean[] used = new boolean[inputLength];    StringBuffer outputString = new StringBuffer();    char[] in =input.toCharArray();    doPermute( in , outputString, used, inputLength, 0);  
              }  public static void doPermute(char[] in , StringBuffer outputString,                  boolean[] used, int inputLength, int level)   {    
                if (level == inputLength)     {      System.out.println(outputString.toString());      
                  return;    
                }    
                for (int i = 0; i < inputLength; ++i)     {      
                  if (used[i])        
                  continue;      outputString.append( in [i]);      used[i] = true;      doPermute( in , outputString, used, inputLength, level + 1);      used[i] = false;      outputString.setLength(outputString.length() - 1);    
                }  
              }
            }
            import java.io. * ;
            class VowelsInString {  public static void main(String[] args) throws Exception   {    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));    System.out.print("Enter String : ");    String str = br.readLine();    int noofvowels = 0;    
                for (int i = 0; i < str.length(); i++)     {      
                  if ((str.toLowerCase().charAt(i) == 'a') || (str.toLowerCase().charAt(i) == 'e') || (str.toLowerCase().charAt(i) == 'i') || (str.toLowerCase().charAt(i) == 'o') || (str.toLowerCase().charAt(i) == 'u'))       {        noofvowels++;      
                  }    
                }    System.out.print("Number of vowels in " + str + " : " + noofvowels);  
              }
            }
            import java.util.Scanner;
            class LongestWord {  public static void main(String[] args)   {    Scanner sc = new Scanner(System. in );    System.out.print("Enter the string : ");    String str = sc.nextLine();    String maxword = null;    str = str + ' ';    int l = str.length();    String word = "";    int maxlength = 0;    
                for (int i = 0; i < l; i++)     {      word = word + str.charAt(i);      
                  if (str.charAt(i + 1) == ' ')       {        
                    if (word.length() > maxlength)         {          maxword = new String(word);          maxlength = word.length();        
                    }        word = "";        i++;      
                  }    
                }    System.out.println("longest word is " + maxword);  
              }
            }
            class HtmlTagRemover {  public static void main(String a[])   {    String text = "<p>This tags going to disappear.</p>";    System.out.println(text);    text = text.replaceAll("\\<.*?\\>", "");    System.out.println(text);  
              }
            }
            class FormatString {  public static void main(String a[])   {    String str = "This is formatted %s example.";    System.out.println(String.format(str, "string"));    String str1 = "We are adding number %d to string.";    System.out.println(String.format(str1, 10));  
              }
            }
            class Test {  public static void main(String[] args)   {    int sum = 0;    String str = "sha12bhu467";     //replace all character to "" except decimals
                    str = str.replaceAll("\\D+", "");    System.out.println(str);    char c[] = str.toCharArray();    
                for (int i = 0; i < c.length; i++)     {      sum += Character.getNumericValue(c[i]);    
                }    System.out.println("Your sum :)" + " " + sum);  
              }
            }
            import java.util.Arrays;
            import java.io. * ;
            class SortString {  public static void main(String args[]) throws IOException   {    BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));     // create a Java String array        String[] names = null;        System.out.print("How many names you want to sort : ");        int size = Integer.parseInt(br.readLine());
                    names = new String[size];    
                for (int i = 0; i < size; i++)     {      System.out.print("Enter " + (i + 1) + " name : ");      names[i] = br.readLine();    
                }     // sort the array, using the sort method of the Arrays class        Arrays.sort(names);
                    System.out.println("Sorted names -> ");     // print the sorted results        for (String name : names)        {            System.out.println("\t" + name);        }    }}class StringBuilderDemo{    public static void main(String args[])    {        StringBuilder sb = new StringBuilder("java ");
                     //now original string is changed        sb.append("is best");        System.out.println(sb);        System.out.println(sb.length());
                     //allocated capacity        System.out.println(sb.capacity());
                    StringBuilder sb1 = new StringBuilder("Android");    sb1.insert(7, " is cool");    System.out.println(sb1);    StringBuilder sb2 = new StringBuilder("He is Superstar");    sb2.replace(3, 5, "was");    System.out.println(sb2);    StringBuilder sb3 = new StringBuilder("Hello");    sb3.delete(1, 3);     //prints Hlo          System.out.println(sb3);        sb3.deleteCharAt(0);        System.out.println(sb3);
                    StringBuilder sb4 = new StringBuilder("java");    sb4.reverse();    System.out.println(sb4);    StringBuilder sb5 = new StringBuilder("java ");    System.out.println(sb5.charAt(0));    sb5.setCharAt(0, 'k');    System.out.println(sb5);    StringBuilder sb6 = new StringBuilder("He is Superstar");    String s = sb6.substring(6, 11);    System.out.println(s);    s = sb6.substring(6);    System.out.println(s);  
              }
            }
            /*  String Tokenizer example  This example shows how a Java StringTokenizer can be used to break a string  into tokens.*/
            import java.util.StringTokenizer;
            class StringTokenizerExample {  public static void main(String[] args)   {     //create StringTokenizer object        StringTokenizer st = new StringTokenizer("Java StringTokenizer Example");
                     //iterate through tokens        while (st.hasMoreTokens())        {            System.out.println(st.nextToken());        }    }}class StringStartWith{    public static void main(String a[])    {        String str = "This is a Demo.";        System.out.println("Is this string starts with \"This\"? " + str.startsWith("This"));
                    System.out.println("Is this string starts with \"Demo\"? " + str.startsWith("Demo"));  
              }
            }
            class StringReverse {  public static void main(String args[])   {    String s = "abcdef";    char c[] = s.toCharArray();    System.out.print("Reverse String : ");

                    
                for (int i = c.length - 1; i >= 0; i--)     {      System.out.print(c[i]);    
                }  
              }
            }
            class StringExampleTwo {  public static void main(String args[])   {    String s1 = " Universe ";    System.out.println("s1 = " + s1);     //Display String Length        System.out.println("The length of s1 is: " + s1.length());
                     //Removing extra spaces from s1        String s2 = s1.trim();
                    System.out.println("s2 = " + s2);    System.out.println("The length of s2 is: " + s2.length());  
              }
            }
            class StringLength {  static int i,
              c,
              res;  static int length(String s)   {    
                try     {      
                  for (i = 0, c = 0; 0 <= i; i++, c++)       {        s.charAt(i);      
                  }    
                }    
                catch(Exception e)     //Array index out of bounds and array index out of range are different exceptions        {            System.out.print("length is ");            // we can not put return statement in catch        }        return c;    }
                  public static void main(String args[])   {    System.out.println("Original String is : Programming Hub");    res = StringLength.length("Programming Hub");    System.out.println(res);  
                }
              }
              class StringEqualsTest { public static void main(String[] args) { String s1 = "abc"; String s2 = s1; String s5 = "abc"; String s3 = new String("abc"); String s4 = new String("abc");   System.out.println("== comparison : " + (s1 == s5)); System.out.println("== comparison : " + (s1 == s2)); System.out.println("Using equals method : " + s1.equals(s2)); System.out.println("== comparison : " + (s3 == s4)); System.out.println("Using equals method : " + s3.equals(s4)); 
                }
              }
              class StringConcatWithPlus {  public static void main(String[] args)   {    String s1 = "Hi ";    String s2 = "Programming Hub";    String s3 = null;    String s4 = null;     //Concatenating two String Objects        s3 = s1 + s2;
                       //Concatenating Strings Dynamically   
                       s4 = "This is " + "New String";
                      System.out.println("s3 = " + s3);    System.out.println("s4 = " + s4);  
                }
              }