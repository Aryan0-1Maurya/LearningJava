import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;
class AnalogClock extends Applet implements Runnable {  
    int width, height;  
    Thread t = null;  
    boolean threadSuspended;  
    int hours = 0, minutes = 0, seconds = 0;  
    String timeString = "";  
    public void init()   {    
        width = getSize().width;    
        height = getSize().height;    
        setBackground(Color.CYAN);  
    }  
    public void start()   {    
        if (t == null)     {      
            t = new Thread(this);      
            t.setPriority(Thread.MIN_PRIORITY);      
            threadSuspended = false;      
            t.start();    
        }    
        else     {      
            if (threadSuspended)       {        
                threadSuspended = false;        
                synchronized(this)         {          
                    notify();        
                }      
            }    
        }  
    }  
    public void stop()   {    
        threadSuspended = true;  
    }
    public void run()   {    
            try     {      
                while (true)       {        
                    Calendar cal = Calendar.getInstance();        
                    hours = cal.get(Calendar.HOUR_OF_DAY);        
                    if (hours > 12)           hours -= 12;        
                    minutes = cal.get(Calendar.MINUTE);        
                    seconds = cal.get(Calendar.SECOND);        
                    SimpleDateFormat formatter             = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());        
                    Date date = cal.getTime();        
                    timeString = formatter.format(date);         // Now the thread checks to see if it should suspend itself                  if (threadSuspended)                {                    synchronized (this)                    {                        while (threadSuspended)                        {                            wait();                        }                    }                }                repaint();                t.sleep(1000); // interval specified in milliseconds              }        }        catch (Exception e)        {        }    }void drawHand(double angle, int radius, Graphics g)    {        angle -= 0.5 * Math.PI;        int x = (int) (radius * Math.cos(angle));        int y = (int) (radius * Math.sin(angle));        g.drawLine(width / 2, height / 2, width / 2 + x, height / 2 + y);    }
                      
                    void drawWedge(double angle, int radius, Graphics g)   {    
                        angle -= 0.5 * Math.PI;    
                        int x = (int)(radius * Math.cos(angle));    
                        int y = (int)(radius * Math.sin(angle));    
                        angle += 2 * Math.PI / 3;    
                        int x2 = (int)(5 * Math.cos(angle));    
                        int y2 = (int)(5 * Math.sin(angle));    
                        angle += 2 * Math.PI / 3;    
                        int x3 = (int)(5 * Math.cos(angle));    
                        int y3 = (int)(5 * Math.sin(angle));    
                        g.drawLine(width / 2 + x2, height / 2 + y2, width / 2 + x, height / 2 + y);    
                        g.drawLine(width / 2 + x3, height / 2 + y3, width / 2 + x, height / 2 + y);    
                        g.drawLine(width / 2 + x2, height / 2 + y2, width / 2 + x3, height / 2 + y3);  
                    }  
                    public void paint(Graphics g)   {    
                        g.setColor(Color.RED);    
                        drawWedge(2 * Math.PI * hours / 12, width / 5, g);    
                        drawWedge(2 * Math.PI * minutes / 60, width / 3, g);    
                        drawHand(2 * Math.PI * seconds / 60, width / 2, g);    
                        g.setColor(Color.BLACK);    
                        g.drawString(timeString, 10, height - 10);  
                    }
                } /*<html>  <body>  <applet code="AnalogClock.class" width="315" height="300">  </applet>  </body>  </html> */
                import java.applet.*;
                import java.awt.*;
                import java.awt.event.*;
                class Calc extends Applet implements ActionListener {  
                    String cmd[] = {
                        "+",
                        "-",
                        "*",
                        "/",
                        "=",
                        "C"
                    };  
                    int pv = 0;  
                    String op = "";  
                    Button b[] = new Button[16];  
                    TextField t1 = new TextField(10);  
                    public void init()   {    
                        setLayout(new BorderLayout());    
                        add(t1, "North");    
                        t1.setText("0");    
                        Panel p = new Panel();    
                        p.setLayout(new GridLayout(4, 4));    
                        for (int i = 0; i < 16; i++)     {      
                            if (i < 10)         b[i] = new Button(String.valueOf(i));      
                            else         b[i] = new Button(cmd[i % 10]);        
                            b[i].setFont(new Font("Arial", Font.BOLD, 25));        
                            p.add(b[i]);        
                            add(p, "Center");        
                            b[i].addActionListener(this);    
                        }  
                    }
                    public void actionPerformed(ActionEvent ae)   {    
                        int res = 0;    
                        String cap = ae.getActionCommand();    
                        int cv = Integer.parseInt(t1.getText());    
                        if (cap.equals("C"))     {      
                            t1.setText("0");      
                            pv = 0;      
                            cv = 0;      
                            res = 0;      
                            op = "";    
                        }    
                        else if (cap.equals("="))     {      
                            res = 0;      
                            if (op == "+")         res = pv + cv;      
                            else if (op == "-")         res = pv - cv;      
                            else if (op == "*")         res = pv * cv;      
                            else if (op == "/")         res = pv / cv;      
                            t1.setText(String.valueOf(res));    
                        }    
                        else if (cap.equals("+") || cap.equals("-") || cap.equals("*") || cap.equals("/"))     {      
                            pv = cv;      
                            op = cap;      
                            t1.setText("0");    
                        }    
                        else     {      
                            int v = cv * 10 + Integer.parseInt(cap);      
                            t1.setText(String.valueOf(v));    
                        }  
                    }
                }
                /*<applet code="Calc.class" width=401 height=391></applet>*/
                import java.awt.*;
                import java.applet.*;
                class SampleBanner extends Applet
                implements Runnable {  
                    String str = "This is a simple Banner ";  
                    Thread t;  
                    boolean b;  
                    public void init()   {    
                        setBackground(Color.gray);    
                        setForeground(Color.yellow);  
                    }  
                    public void start()   {    
                        t = new Thread(this);    
                        b = false;    
                        t.start();  
                    }  
                    public void run()   {    
                        char ch;    
                        for (;;)     {      
                            try       {        
                                repaint();        
                                Thread.sleep(250);        
                                ch = str.charAt(0);        
                                str = str.substring(1, str.length());        
                                str = str + ch;      
                            }      
                            catch (InterruptedException e)       {      }    
                        }  
                    }  
                    public void paint(Graphics g)   {    
                        g.drawRect(1, 1, 300, 150);    
                        g.setColor(Color.yellow);    
                        g.fillRect(1, 1, 300, 150);    
                        g.setColor(Color.red);    
                        g.drawString(str, 1, 150);  
                    }
                }
                //Now compile the above code and call the generated //class in your HTML code as follows:<!--/*--------------------------<HTML><HEAD></HEAD><BODY><div ><APPLET CODE="SampleBanner.class" WIDTH="600" HEIGHT="400"></APPLET></div></BODY></HTML>---------------------------*/-->import java.awt.*;import java.awt.event.*;
                class FactEvent extends java.applet.Applet implements ActionListener {  
                    TextField t1, t2;  
                    int fact = 1, m;  
                    Button b1, b2, b3;  
                    String msg;  
                    Label l1, l2;  
                    FactEvent e;  
                    public void init()   {    
                        e = this;    
                        t1 = new TextField(3);    
                        t2 = new TextField(10);    
                        b1 = new Button("FIND FACTORIAL");    
                        l1 = new Label("ENTER THE NUMBER");    
                        l2 = new Label("RESULT");    
                        add(l1);    
                        add(t1);    
                        add(l2);    
                        add(t2);    
                        add(b1);    
                        b1.addActionListener(this);  
                    }  
                    public void actionPerformed(ActionEvent ae)   {    
                        String str = t1.getText();    
                        if (str != "")     {      
                            int num = Integer.parseInt(str);      
                            for (int i = num; i > 0; i--)       {        
                                fact = fact * i;      
                            }      
                            msg = "" + fact;      
                            t2.setText(msg);      
                            fact = 1;    
                        }  
                    }
                } /*<applet code=FactEvent width=400 height=400></applet>*/
                import java.applet.*;
                import java.awt.event.*;
                import javax.swing.*;
                import java.awt.*;
                /*    <applet code="BackColor" height=300 width=400></applet>*/
                class BackColor extends Applet implements AdjustmentListener {  
                    Scrollbar js_red, js_green, js_blue;  
                    Label lbl_red, lbl_green, lbl_blue;  
                    Color c;  
                    public void init()   {    
                        js_red = new Scrollbar(Scrollbar.HORIZONTAL, 10, 2, 0, 256);    
                        js_green = new Scrollbar(Scrollbar.HORIZONTAL, 10, 2, 0, 256);    
                        js_blue = new Scrollbar(Scrollbar.HORIZONTAL, 10, 2, 0, 256);    
                        lbl_red = new Label("Red " + " 0");    
                        lbl_green = new Label("Green " + "0");    
                        lbl_blue = new Label("Blue " + "0");    
                        js_red.addAdjustmentListener(this);    
                        js_green.addAdjustmentListener(this);    
                        js_blue.addAdjustmentListener(this);

                            
                        js_red.setBounds(20, 20, 150, 20);    
                        js_green.setBounds(20, 50, 150, 20);    
                        js_blue.setBounds(20, 80, 150, 20);    
                        lbl_red.setBounds(190, 20, 75, 20);    
                        lbl_green.setBounds(190, 50, 75, 20);    
                        lbl_blue.setBounds(190, 80, 75, 20);    
                        Panel jp = new Panel();    
                        jp.setLayout(null);    
                        jp.add(js_red);    
                        jp.add(lbl_red);    
                        jp.add(js_green);    
                        jp.add(lbl_green);    
                        jp.add(js_blue);    
                        jp.add(lbl_blue);    
                        jp.setBounds(20, 20, 250, 120);

                            
                        this.add(jp);  
                    }
                    public void adjustmentValueChanged(AdjustmentEvent ae)   {    
                        c = new Color(js_red.getValue(), js_green.getValue(), js_blue.getValue());    
                        lbl_red.setText("Red " + js_red.getValue());    
                        lbl_green.setText("Green " + js_green.getValue());    
                        lbl_blue.setText("Blue " + js_blue.getValue());    
                        setBackground(c);  
                    }
                }
                import java.applet.*;
                import java.awt.*;
                class ChessBoard extends Applet {  
                    int x, y, dx, dy;  
                    public void paint(Graphics g)   {    
                        x = 1;    
                        y = 1;    
                        dx = 50;    
                        dy = 50;    
                        for (int i = 1; i <= 8; i++)     {      
                            for (int j = 1; j <= 8; j++)       {        
                                if (i % 2 == 1)         {          
                                    if (j % 2 == 0)           {            
                                        g.setColor(Color.WHITE);          
                                    }          
                                    else           {            
                                        g.setColor(Color.BLACK);          
                                    }        
                                }        
                                else         {          
                                    if (j % 2 == 0)           {            
                                        g.setColor(Color.BLACK);          
                                    }          
                                    else           {            
                                        g.setColor(Color.WHITE);          
                                    }        
                                }        
                                g.fillRect(x, y, dx, dy);        
                                x = x + dx;      
                            }      
                            y = y + dy;      
                            x = 1;    
                        }  
                    }
                }
                /*<applet code="ChessBoard.class" width=401 height=391></applet>*/
                import java.applet.Applet;
                import java.awt.Graphics;
                import java.util.Calendar;
                import java.util.GregorianCalendar;
                class ClockApplet extends Applet implements Runnable {  
                    Thread t, t1;  
                    public void start()   {    
                        t = new Thread(this);    
                        t.start();  
                    }  
                    public void run()   {    
                        t1 = Thread.currentThread();    
                        while (t1 == t)     {      
                            repaint();      
                            try       {        
                                t1.sleep(1000);      
                            }      
                            catch (InterruptedException e)       {      }    
                        }  
                    }  
                    public void paint(Graphics g)   {    
                        Calendar cal = new GregorianCalendar();    
                        String hour = String.valueOf(cal.get(Calendar.HOUR));    
                        String minute = String.valueOf(cal.get(Calendar.MINUTE));    
                        String second = String.valueOf(cal.get(Calendar.SECOND));    
                        g.drawString(hour + ":" + minute + ":" + second, 20, 30);  
                    }
                }
                //Now compile the above code and call the generated //class in your HTML code as follows:<!--/*--------------------------<HTML><HEAD></HEAD><BODY><div ><APPLET CODE="ClockApplet.class" WIDTH="600" HEIGHT="400"></APPLET></div></BODY></HTML>---------------------------*/-->import java.applet.*;import java.awt.*;
                class DrawingLines extends Applet {  
                    int width, height;  
                    public void init()   {    
                        width = getSize().width;    
                        height = getSize().height;    
                        setBackground(Color.black);  
                    }  
                    public void paint(Graphics g)   {    
                        g.setColor(Color.green);    
                        for (int i = 0; i < 10; ++i)     {      
                            g.drawLine(width, height, i * width / 10, 0);    
                        }  
                    }
                }
                //Now compile the above code and call the generated //class in your HTML code as follows:<!--/*--------------------------<HTML><HEAD></HEAD><BODY><div ><APPLET CODE="DrawingLines.class" WIDTH="600" HEIGHT="400"></APPLET></div></BODY></HTML>---------------------------*/-->import java.awt.*;import java.awt.event.*;import java.applet.*;
                class FormAppletDemo extends Applet implements ActionListener {  
                    Label entername;  
                    TextField name;  
                    Label enteremail;  
                    TextField email;  
                    Button click;  
                    Label result;  
                    public void init()   {    
                        entername = new Label("Enter your name: ");    
                        name = new TextField(30);    
                        enteremail = new Label("Enter your email: ");    
                        email = new TextField(30);    
                        click = new Button("Click Here");    
                        result = new Label();    
                        add(entername);    
                        add(name);    
                        add(enteremail);    
                        add(email);    
                        add(click);    
                        click.addActionListener(this);    
                        add(result);  
                    }  
                    public void actionPerformed(ActionEvent ae)   {    
                        String s = name.getText();    
                        String e = email.getText();    
                        String n = "";    
                        if (s.equals(n) || e.equals(n))     {      
                            result.setText("Please enter appropriate information...");    
                        }    
                        else     {      
                            result.setText("Welcome to Programming Hub");    
                        }  
                    }
                }    /* <applet code="FormAppletDemo.class" height="250" width="250"> </applet> */
                import java.applet.*;
                import java.awt.*;
                class FaceApplet extends Applet {  
                    public void paint(Graphics g)   {    
                        g.drawOval(50, 50, 200, 200);    
                        g.drawOval(100, 100, 25, 25);    
                        g.fillOval(100, 100, 25, 25);    
                        g.drawOval(180, 100, 25, 25);    
                        g.fillOval(180, 100, 25, 25);    
                        g.drawArc(110, 170, 90, 50, 200, 150);  
                    }
                }
                /*<applet CODE="FaceApplet.class" width=314 height=285></applet>*/
                import java.awt.*;
                import javax.swing.*; 
                public class JRadioButtonDemo extends JFrame  {   
                    public JRadioButtonDemo()   {    
                        super("Swing JRadioButton Demo");     
                        JRadioButton option1 = new JRadioButton("Linux");    
                        JRadioButton option2 = new JRadioButton("Windows");    
                        JRadioButton option3 = new JRadioButton("Macintosh");     
                        ButtonGroup group = new ButtonGroup();    
                        group.add(option1);    
                        group.add(option2);    
                        group.add(option3);     
                        setLayout(new FlowLayout());     
                        add(option1);    
                        add(option2);    
                        add(option3);     
                        pack();  
                    }   
                    public static void main(String args[])  {    
                        SwingUtilities.invokeLater(new Runnable()   {      
                            @Override       public void run()    {        
                                new JRadioButtonDemo().setVisible(true);      
                            }    
                        });  
                    }
                }
                import java.applet.*;
                import java.awt.*;
                class Shapes extends Applet {  
                    int x = 300, y = 100, r = 50;  
                    public void paint(Graphics g)   {    
                        g.drawLine(30, 300, 200, 10);    
                        g.drawOval(x - r, y - r, 100, 100);    
                        g.drawRect(400, 50, 200, 100);  
                    }
                }
                //Now compile the above code and call the generated //class in your HTML code as follows:<!--/*--------------------------<HTML><HEAD></HEAD><BODY><div ><APPLET CODE="Shapes.class" WIDTH="600" HEIGHT="400"></APPLET></div></BODY></HTML>---------------------------*/-->import java.applet.*;import java.awt.*;

                //Following example demonstrates how to create a //basic Applet by extrnding Applet Class.You will//need to embed another HTML code to run this program.
                class SimpleApplet extends Applet {  
                    public void paint(Graphics g)   {    
                        g.drawString("Hello Applet", 50, 30);  
                    }
                }
                //Now compile the above code and call the generated //class in your HTML code as follows:<!--/*--------------------------<HTML><HEAD></HEAD><BODY><div ><APPLET CODE="SimpleApplet.class" WIDTH="600" HEIGHT="400"></APPLET></div></BODY></HTML>---------------------------*/-->