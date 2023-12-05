import java.util.Scanner;
// Class BSTNode class BSTNode{    BSTNode left, right;    int data;
   // Constructor     public BSTNode()    {        left = null;        right = null;        data = 0;    }
   // Constructor     public BSTNode(int n)    {        left = null;        right = null;        data = n;    }
   // Function to set left node     public void setLeft(BSTNode n)    {        left = n;    }
   // Function to set right node      public void setRight(BSTNode n)    {        right = n;    }
   // Function to get left node     public BSTNode getLeft()    {        return left;    }
   // Function to get right node     public BSTNode getRight()    {        return right;    }
   // Function to set data to node     public void setData(int d)    {        data = d;    }// Function to get data from node     public int getData()    {        return data;    }}
// Class BST class BST{    private BSTNode root;
   // Constructor     public BST()    {        root = null;    }
   // Function to check if tree is empty     public boolean isEmpty()    {        return root == null;    }
   // Functions to insert data     public void insert(int data)    {        root = insert(root, data);    }
   // Function to insert data recursively     private BSTNode insert(BSTNode node, int data)    {        if (node == null)            node = new BSTNode(data);        else        {            if (data <= node.getData())                node.left = insert(node.left, data);            else                node.right = insert(node.right, data);        }        return node;    }
   // Functions to delete data     public void delete(int k)    {        if (isEmpty())            System.out.println("Tree Empty");        else if (search(k) == false)            System.out.println("Sorry " + k + " is not present");        else        {            root = delete(root, k);            System.out.println(k + " deleted from the tree");        }    }private BSTNode delete(BSTNode root, int k)    {        BSTNode p, p2, n;        if (root.getData() == k)        {            BSTNode lt, rt;            lt = root.getLeft();            rt = root.getRight();            if (lt == null && rt == null)                return null;            else if (lt == null)            {                p = rt;                return p;            }            else if (rt == null)            {                p = lt;                return p;            }            else            {                p2 = rt;                p = rt;                while (p.getLeft() != null)                {                    p = p.getLeft();                }                p.setLeft(lt);                return p2;            }        }        if (k < root.getData())        {            n = delete(root.getLeft(), k);            root.setLeft(n);        }        else        {            n = delete(root.getRight(), k);            root.setRight(n);        }        return root;    }
   // Functions to count number of nodes     public int countNodes()    {        return countNodes(root);    }private int countNodes(BSTNode r)    {        if (r == null)            return 0;        else        {            int l = 1;            l += countNodes(r.getLeft());            l += countNodes(r.getRight());            return l;        }    }
   // Functions to search for an element     public boolean search(int val)    {        return search(root, val);    }
   // Function to search for an element recursively     private boolean search(BSTNode r, int val)    {        boolean found = false;        while ((r != null) && !found)        {            int rval = r.getData();            if (val < rval)                r = r.getLeft();            else if (val > rval)                r = r.getRight();            else            {                found = true;                break;            }            found = search(r, val);        }        return found;    }
   // Function for inorder traversal     public void inorder()    {        inorder(root);    }
  
private void inorder(BSTNode r)   {    
    if (r != null)     {      
        inorder(r.getLeft());      
        System.out.print(r.getData() + " ");      
        inorder(r.getRight());    
    }  
} // Function for preorder traversal     public void preorder()    {        preorder(root);    }
  
private void preorder(BSTNode r)   {    
    if (r != null)     {      
        System.out.print(r.getData() + " ");      
        preorder(r.getLeft());      
        preorder(r.getRight());    
    }  
}   // Function for postorder traversal     public void postorder()    {        postorder(root);    }
  
private void postorder(BSTNode r)   {    
    if (r != null)     {      
        postorder(r.getLeft());      
        postorder(r.getRight());      
        System.out.print(r.getData() + " ");    
    }  
}
}
//Class BinarySearchTreeclass BinarySearchTree{    public static void main(String[] args)    {        Scanner scan = new Scanner(System.in);
     // Creating object of BST         BST bst = new BST();
    
System.out.println("Binary Search Tree Test\n");    
char ch;     // Perform tree operationsdo        {            System.out.println("\nBinary Search Tree Operations\n");            System.out.println("1. insert ");            System.out.println("2. delete");            System.out.println("3. search");            System.out.println("4. count nodes");            System.out.println("5. check empty");
      
int choice = scan.nextInt();      
switch (choice)       {        
    case 1:
                  System.out.println("Enter integer element to insert");          
        bst.insert(scan.nextInt());          
        break;        
    case 2:
                  System.out.println("Enter integer element to delete");          
        bst.delete(scan.nextInt());          
        break;        
    case 3:
                  System.out.println("Enter integer element to search");          
        System.out.println("Search result : " + bst.search(scan.nextInt()));          
        break;        
    case 4:
                  System.out.println("Nodes = " + bst.countNodes());          
        break;        
    case 5:
                  System.out.println("Empty status = " + bst.isEmpty());          
        break;        
    default:
                  System.out.println("Wrong Entry \n ");          
        break;      
}       // Display tree               System.out.print("\nPost order : ");            bst.postorder();            System.out.print("\nPre order : ");  bst.preorder();            System.out.print("\nIn order : ");            bst.inorder();
      
System.out.println("\nDo you want to continue (Type y or n) \n");      
ch = scan.next().charAt(0);    
}    
while (ch == 'Y' || ch == 'y');  
}
}




import java.util.Scanner; 
class Node {  
    protected int data;  
    protected Node next, prev;   
    public Node()   {    
        next = null;    
        prev = null;    
        data = 0;  
    }  
    public Node(int d, Node n, Node p)   {    
        data = d;    
        next = n;    
        prev = p;  
    }   // Function to set link to next node    public void setLinkNext(Node n)    {        next = n;    }
       // Function to set link to previous node    public void setLinkPrev(Node p)    {        prev = p;    }    
       // Funtion to get link to next node    public Node getLinkNext()    {        return next;    }
       // Function to get link to previous node    public Node getLinkPrev()    {        return prev;    }
       // Function to set data to node    public void setData(int d)    {        data = d;    }
       // Function to get data from node    public int getData()    {        return data;    }}class linkedList{    protected Node start;    protected Node end ;    public int size;     public linkedList()    {        start = null;        end = null;        size = 0;    }
       // Function to check if list is empty    public boolean isEmpty()    {        return start == null;    }
       // Function to get size of list    public int getSize()    {        return size;    }
       // Function to insert element at begining    public void insertAtStart(int val)    {        Node nptr = new Node(val, null, null);                if(start == null)        {            start = nptr;            end = start;        }        else        {            start.setLinkPrev(nptr);            nptr.setLinkNext(start);            start = nptr;        }        size++;    }
       // Function to insert element at end    public void insertAtEnd(int val)    {        Node nptr = new Node(val, null, null);                if(start == null)        {            start = nptr;            end = start;        }        else        {            nptr.setLinkPrev(end);            end.setLinkNext(nptr);            end = nptr;        }        size++;    }public void insertAtPos(int val , int pos)    {        Node nptr = new Node(val, null, null);            if (pos == 1)        {            insertAtStart(val);            return;        }                    Node ptr = start;        for (int i = 2; i <= size; i++)        {            if (i == pos)            {                Node tmp = ptr.getLinkNext();                ptr.setLinkNext(nptr);                nptr.setLinkPrev(ptr);                nptr.setLinkNext(tmp);                tmp.setLinkPrev(nptr);            }            ptr = ptr.getLinkNext();                    }        size++ ;    }
       // Function to delete node at position    public void deleteAtPos(int pos)    {                if (pos == 1)         {            if (size == 1)            {                start = null;                end = null;                size = 0;                return;             }            start = start.getLinkNext();            start.setLinkPrev(null);            size--;             return ;        }        if (pos == size)        {            end = end.getLinkPrev();            end.setLinkNext(null);            size-- ;        }        Node ptr = start.getLinkNext();        for (int i = 2; i <= size; i++)        {            if (i == pos)            {                Node p = ptr.getLinkPrev();                Node n = ptr.getLinkNext();                 p.setLinkNext(n);                n.setLinkPrev(p);                size-- ;      }        Node ptr = start.getLinkNext();        for (int i = 2; i <= size; i++)        {            if (i == pos)            {                Node p = ptr.getLinkPrev();                Node n = ptr.getLinkNext();                 p.setLinkNext(n);                n.setLinkPrev(p);                size-- ;                return;            }            ptr = ptr.getLinkNext();        }            }    
       // Function to display status of list    public void display()    {        System.out.print("\nDoubly Linked List = ");        if (size == 0)         {            System.out.print("empty\n");            return;        }        if (start.getLinkNext() == null)         {            System.out.println(start.getData() );            return;        }        Node ptr = start;        System.out.print(start.getData()+ " <-> ");        ptr = start.getLinkNext();        while (ptr.getLinkNext() != null)        {            System.out.print(ptr.getData()+ " <-> ");            ptr = ptr.getLinkNext();        }        System.out.print(ptr.getData()+ "\n");    }}public class DoublyLinkedList{        public static void main(String[] args)    {                    Scanner scan = new Scanner(System.in);                // Creating object of linkedList        linkedList list = new linkedList();        System.out.println("Doubly Linked List Test\n");        char ch;
         // Perform list operations        System.out.println("\nDoubly Linked List Operations\n");        System.out.println("1. Insert at begining");        System.out.println("2. Insert at end");        System.out.println("3. Insert at position");        System.out.println("4. Delete at position");        System.out.println("5. Check empty");        System.out.println("6. Get size");        do        {            System.out.print("Enter choice : ");             int choice = scan.nextInt();            switch (choice)            {                case 1 :                    System.out.print("Enter integer element to insert : ");                    list.insertAtStart( scan.nextInt() );                    break;                case 2 :                    System.out.print("Enter integer element to insert : ");                    list.insertAtEnd( scan.nextInt() );                    break;                case 3 :                    System.out.print("Enter integer element to insert : ");                    int num = scan.nextInt() ;                    System.out.print("Enter position : ");                    int pos = scan.nextInt() ;           if (pos < 1 || pos > list.getSize() )                        System.out.println("Invalid position\n");                    else                        list.insertAtPos(num, pos);                    break;                case 4 :                    System.out.print("Enter position : ");                    int p = scan.nextInt() ;                    if (p < 1 || p > list.getSize() )                        System.out.print("Invalid position\n");                    else                        list.deleteAtPos(p);                    break;                 case 5 :                    System.out.print("Empty status = "+ list.isEmpty());                    break;                case 6 :                    System.out.print("Size = "+ list.getSize() +" \n");                    break;                default :                    System.out.print("Wrong Entry \n ");                    break;            }
           // Display List            list.display();            System.out.print("\nDo you want to continue (Type y or n) : ");            ch = scan.next().charAt(0);
        
}
while (ch == 'Y' || ch == 'y');  
}
}



import java.io.*;
class Stack {  
    private char[] a;  
    private int top, m;  
    public Stack(int max)   {    
        m = max;    
        a = new char[m];    
        top = -1;  
    }  
    public void push(char key)   {    
        a[++top] = key;  
    }  
    public char pop()   {    
        return (a[top--]);  
    }  
    public char peek()   {    
        return (a[top]);  
    }  
    public boolean isEmpty()   {    
        return (top == -1);  
    }
}
class Evaluation {  
    private Stack s;  
    private String input;  
    private String output = "";  
    public Evaluation(String str)   {    
        input = str;    
        s = new Stack(str.length());  
    }  
    public String inToPre()   {    
        int i;    
        for (i = (input.length() - 1); i >= 0; i--)     {      
            char ch = input.charAt(i);      
            switch (ch) {        
                case '+':
                            
                case '-':
                              gotOperator(ch, 1, ')');          
                    break;        
                case '*':
                            
                case '/':
                              gotOperator(ch, 2, ')');          
                    break;        
                case ')':
                              s.push(ch);          
                    break;        
                case '(':
                              gotParenthesis(')');          
                    break;        
                default:
                              output = ch + output;      
            }    
        }    
        while (!s.isEmpty())     {      
            output = s.pop() + output;    
        }    
        return output;  
    }  
    public String inToPost()   {    
        for (int i = 0; i < input.length(); i++)     {      
            char ch = input.charAt(i);      
            switch (ch)       {        
                case '+':
                            
                case '-':
                              gotOperator(ch, 1, '(');          
                    break;        
                case '*':
                            
                case '/':
                              gotOperator(ch, 2, '(');          
                    break;        
                case '(':
                              s.push(ch);          
                    break;        
                case ')':
                              gotParenthesis('(');          
                    break;        
                default:
                              output = output + ch;      
            }    
        }
        while (!s.isEmpty())     {      
            output = output + s.pop();    
        }    
        return output;  
    }  
    public String preToPost()   {    
        Stack f = new Stack(input.length());    
        for (int i = 0; i < input.length(); i++)     {      
            char ch = input.charAt(i);      
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/')       {        
                s.push(ch);        
                f.push('0');      
            }      
            else       {        
                output = output + ch;        
                while (f.peek() == '1')         {          
                    output = output + s.pop();          
                    f.pop();          
                    if (f.isEmpty())             break;        
                }        
                if (!f.isEmpty())           f.pop();        
                f.push('1');      
            }    
        }    
        return output;  
    }  
    private void gotOperator(char opThis, int prec1, char x)   {    
        while (!s.isEmpty())     {      
            char opTop = s.pop();      
            if (opTop == x)       {        
                s.push(opTop);
                break;      
            }      
            else       {        
                int prec2;        
                if (opTop == '+' || opTop == '-')           prec2 = 1;        
                else           prec2 = 2;        
                if (prec2 < prec1 && x == '(')         {          
                    s.push(opTop);          
                    break;        
                }        
                else if (prec2 <= prec1 && x == ')')         {          
                    s.push(opTop);          
                    break;        
                }        
                else         {          
                    if (x == ')')             output = opTop + output;          
                    else             output = output + opTop;        
                }      
            }    
        }    
        s.push(opThis);  
    }  
    private void gotParenthesis(char x)   {    
        while (!s.isEmpty())     {      
            char ch = s.pop();      
            if (ch == x)         break;
            else       {        
                if (x == ')')           output = ch + output;        
                else           output = output + ch;      
            }    
        }  
    }
}
class BinaryTreeTraversal {  
    public static void main(String args[]) throws IOException   {    
        String s, check = "y";    
        int n;    
        Evaluation ev;    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        while (check.equals("y"))     {      
            System.out.println("MENU");      
            System.out.println("1. Infix to Prefix");      
            System.out.println("2. Infix to Postfix");      
            System.out.println("3. Prefix to Postfix");      
            System.out.println("Enter your choice");      
            n = Integer.parseInt(br.readLine());      
            switch (n)       {        
                case 1:
                              System.out.println("Enter the infix expression ");          
                    s = br.readLine();          
                    ev = new Evaluation(s);          
                    System.out.println("Prefix expression : " + ev.inToPre());          
                    break;        
                case 2:
                              System.out.println("Enter the infix expression ");          
                    s = br.readLine();          
                    ev = new Evaluation(s);          
                    System.out.println("Postfix expression : " + ev.inToPost());          
                    break;        
                case 3:
                              System.out.println("Enter the Prefix expression ");    
                    s = br.readLine();          
                    ev = new Evaluation(s);          
                    System.out.println("Postfix expression : " + ev.preToPost());          
                    break;        
                default:
                              System.out.println("Invalid input");      
            }      
            System.out.println("Press y to continue");      
            check = br.readLine();    
        }  
    }
}





import java.util.*;
class Node {  
    protected int data;  
    protected Node link;

      
    public Node()   {    
        link = null;    
        data = 0;  
    }  
    public Node(int d, Node n)   {    
        data = d;    
        link = n;  
    }  
    public void setLink(Node n)   {    
        link = n;  
    }   // Function to set data to current Node    public void setData(int d)    {        data = d;    }
       // Function to get link to next node    public Node getLink()    {        return link;    }
       // Function to get data from current Node    public int getData()    {        return data;    }}
    class linkedQueue {  
        protected Node front, rear;  
        public int size;

          
        public linkedQueue()   {    
            front = null;    
            rear = null;    
            size = 0;  
        } // Function to check if queue is empty    public boolean isEmpty()    {        return front == null;    }
           // Function to get the size of the queue    public int getSize()    {        return size;    }
           // Function to insert an element to the queue    public void insert(int data)    {        Node nptr = new Node(data, null);        if (rear == null)        {            front = nptr;            rear = nptr;        }        else        {            rear.setLink(nptr);            rear = rear.getLink();        }        size++;    }
           // Function to remove front element from the queue    public int remove()    {        if (isEmpty())            throw new NoSuchElementException("Underflow Exception");        Node ptr = front;        front = ptr.getLink();        if (front == null)            rear = null;        size--;        return ptr.getData();    }public int peek()    {        if (isEmpty())            throw new NoSuchElementException("Underflow Exception");        return front.getData();    }
           // Function to display the status of the queue    public void display()    {        System.out.print("\nQueue = ");        if (size == 0)        {            System.out.print("Empty\n");            return;        }        Node ptr = front;        while (ptr != rear.getLink())        {            System.out.print(ptr.getData() + " ");            ptr = ptr.getLink();        }        System.out.println();    }}
        class LinkedQueueImplement {  
            public static void main(String[] args)   {    
                Scanner scan = new Scanner(System.in);    
                linkedQueue lq = new linkedQueue();    
                System.out.println("Linked Queue Test\n");    
                char ch;    
                System.out.println("\nQueue Operations");    
                System.out.println("1. Insert");    
                System.out.println("2. Remove");    
                System.out.println("3. Peek");    
                System.out.println("4. Check empty");    
                System.out.println("5. Size");    
                do     {      
                    System.out.print("Enter choice : ");      
                    int choice = scan.nextInt();      
                    switch (choice)       {        
                        case 1:
                            System.out.print("Enter integer element to insert : ");          
                            lq.insert(scan.nextInt());          
                            break;        
                        case 2:
                                      try           {            
                                System.out.println("Removed Element = " + lq.remove());          
                            }          
                            catch (Exception e)           {            
                                System.out.println("Error : " + e.getMessage());          
                            }          
                            break;        
                        case 3:
                                      try           {            
                                System.out.println("Peek Element = " + lq.peek());          
                            }          
                            catch (Exception e)           {            
                                System.out.println("Error : " + e.getMessage());          
                            }          
                            break;        
                        case 4:
                            System.out.println("Empty status = " + lq.isEmpty());          
                            break;        
                        case 5:
                                      System.out.println("Size = " + lq.getSize());          
                            break;        
                        default:
                                      System.out.println("Wrong Entry \n ");          
                            break;      
                    }       // display queue                   lq.display();
                          
                    System.out.print("\nDo you want to continue (Type y or n) : ");      
                    ch = scan.next().charAt(0);    
                }     while (ch == 'Y' || ch == 'y');  
            }
        }
        import java.util.Scanner;
        class Node {  
            protected int data;  
            protected Node link;  
            public Node()   {    
                link = null;    
                data = 0;  
            }  
            public Node(int d, Node n)   {    
                data = d;    
                link = n;  
            }   // Function to set link to next Node     public void setLink(Node n)    {        link = n;    }    // Function to set data to current Node      public void setData(int d)    {        data = d;    }    // Function to get link to next node      public Node getLink()    {        return link;    }    // Function to get data from current Node      public int getData()    {        return data;    }}
            // Class linkedList class linkedList{    protected Node start;    protected Node end;    public int size;public linkedList()    {        start = null;        end = null;        size = 0;    }    // Function to check if list is empty      public boolean isEmpty()    {        return start == null;    }    // Function to get size of list      public int getSize()    {        return size;    }    // Function to insert an element at begining      public void insertAtStart(int val)    {        Node nptr = new Node(val, null);        size++;        if (start == null)        {            start = nptr;            end = start;        }        else        {            nptr.setLink(start);            start = nptr;        }    }    // Function to insert an element at end      public void insertAtEnd(int val)    {        Node nptr = new Node(val, null);        size++;        if (start == null)        {            start = nptr;            end = start;        }        else        {            end.setLink(nptr);            end = nptr;        }    }public void insertAtPos(int val, int pos)    {        Node nptr = new Node(val, null);        Node ptr = start;        pos = pos - 1;        for (int i = 1; i < size; i++)        {            if (i == pos)            {                Node tmp = ptr.getLink();                ptr.setLink(nptr);                nptr.setLink(tmp);                break;            }            ptr = ptr.getLink();        }        size++;    }    // Function to delete an element at position      public void deleteAtPos(int pos)    {        if (pos == 1)        {            start = start.getLink();            size--;            return;        }        if (pos == size)        {            Node s = start;            Node t = start;            while (s != end)            {                t = s;                s = s.getLink();            }            end = t;            end.setLink(null);            size--;            return;        }        Node ptr = start;        pos = pos - 1;        for (int i = 1; i < size - 1; i++)        {            if (i == pos)            {Node tmp = ptr.getLink();                tmp = tmp.getLink();                ptr.setLink(tmp);                break;            }            ptr = ptr.getLink();        }        size--;    }    // Function to display elements      public void display()    {        System.out.print("\nSingly Linked List = ");        if (size == 0)        {            System.out.print("empty\n");            return;        }        if (start.getLink() == null)        {            System.out.println(start.getData());            return;        }        Node ptr = start;        System.out.print(start.getData() + "->");        ptr = start.getLink();        while (ptr.getLink() != null)        {            System.out.print(ptr.getData() + "->");            ptr = ptr.getLink();        }        System.out.print(ptr.getData() + "\n");    }}
             
            class SinglyLinkedList {  
                public static void main(String[] args)   {    
                        Scanner scan = new Scanner(System.in);
                        linkedList list = new linkedList();    
                        char ch;     // Perform list operations          do        {            System.out.println("Singly Linked List Operations\n");            System.out.println("1. insert at begining");            System.out.println("2. insert at end");            System.out.println("3. insert at position");            System.out.println("4. delete at position");            System.out.println("5. check empty");            System.out.println("6. get size");            int choice = scan.nextInt();            switch (choice)            {                case 1:                    System.out.println("Enter integer element to insert");                    list.insertAtStart(scan.nextInt());                    break;                case 2:                    System.out.println("Enter integer element to insert");                    list.insertAtEnd(scan.nextInt());                    break;                case 3:                    System.out.println("Enter integer element to insert");                    int num = scan.nextInt();                    System.out.println("Enter position");                    int pos = scan.nextInt();                    if (pos <= 1 || pos > list.getSize())                        System.out.println("Invalid position\n");                    elselist.insertAtPos(num, pos);                    break;                case 4:                    System.out.println("Enter position");                    int p = scan.nextInt();                    if (p < 1 || p > list.getSize())                        System.out.println("Invalid position\n");                    else                        list.deleteAtPos(p);                    break;                case 5:                    System.out.println("Empty status = " + list.isEmpty());                    break;                case 6:                    System.out.println("Size = " + list.getSize() + " \n");                    break;                default:                    System.out.println("Wrong Entry \n ");                    break;            }            /* Display List */            list.display();            System.out.println("Do you want to continue (Type y or n) \n");            ch = scan.next().charAt(0);        }        while (ch == 'Y' || ch == 'y');    }}

                        import java.io.BufferedReader;
                        import java.io.IOException;
                        import java.io.InputStreamReader;
                        class Stack {  
                            private int top;  
                            private int item[];  
                            Stack(int size)   {    
                                top = -1;    
                                item = new int[size];  
                            }  
                            void pushItem(int data)   {    
                                if (top == item.length - 1)     {      
                                    System.out.println("Stack is Full");    
                                }    
                                else     {      
                                    item[++top] = data;      
                                    System.out.println("Pushed Item :" + item[top]);    
                                }  
                            }  
                            int popItem()   {    
                                if (top < 0)     {      
                                    System.out.println("Stack Underflow");      
                                    return 0;    
                                }    
                                else     {      
                                    System.out.println("Pop Item : " + item[top]);      
                                    return item[top--];    
                                }  
                            }  
                            void displayAll()   {    
                                for (int i = 0; item[i] != 0; i++)     {      
                                    System.out.print(item[i] + "\t");    
                                }    
                                System.out.println("");  
                            }
                        }
                        class StackDemo {
                            public static void main(String[] args) throws IOException   {    
                                Stack stk = new Stack(5);    
                                boolean yes = true;    
                                int choice;    
                                BufferedReader is = new BufferedReader(new InputStreamReader(System.in));    
                                System.out.print("1).Push\n2).Pop\n3).Display\n4).Exit\n");    
                                do     {      
                                    System.out.print("\nEnter Choice : ");      
                                    choice = Integer.parseInt(is.readLine());      
                                    switch (choice)       {        
                                        case 1:
                                                      System.out.print("Enter Push Item :");          
                                            stk.pushItem(Integer.parseInt(is.readLine()));          
                                            break;        
                                        case 2:
                                                      stk.popItem();          
                                            break;        
                                        case 3:
                                                      stk.displayAll();          
                                            break;        
                                        case 4:
                                                      yes = false;          
                                            break;        
                                        default:
                                                      System.out.println("Invalid Choice");      
                                    }    
                                }     while (yes == true);  
                            }
                        }