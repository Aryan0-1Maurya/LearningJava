import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ActionEventExample extends JFrame implements ActionListener
{
    private JList list;
    private DefaultListModel model;

    public ActionEventExample()
    {
        initUI();
    }

    public final void initUI()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        model = new DefaultListModel();
        list = new JList(model);
        list.setBounds(150, 30, 220, 150);

        JButton okButton = new JButton("Ok");
        okButton.setBounds(30, 35, 80, 25);

        okButton.addActionListener(this);

        panel.add(okButton);
        panel.add(list);
        add(panel);

        setTitle("Event Example");
        setSize(420, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        Locale locale = Locale.getDefault();
        Date date = new Date(e.getWhen());
        String s = DateFormat.getTimeInstance(DateFormat.SHORT, locale).format(
                date);
if (!model.isEmpty())
        {
            model.clear();
        }

        if (e.getID() == ActionEvent.ACTION_PERFORMED)
        {
            model.addElement(" Event Id: ACTION_PERFORMED");
        }

        model.addElement(" Time: " + s);

        String source = e.getSource().getClass().getName();
        model.addElement(" Source: " + source);

        int mod = e.getModifiers();

        StringBuffer buffer = new StringBuffer(" Modifiers: ");

        if ((mod & ActionEvent.ALT_MASK) > 0)
        {
            buffer.append("Alt ");
        }

        if ((mod & ActionEvent.SHIFT_MASK) > 0)
        {
            buffer.append("Shift ");
        }

        if ((mod & ActionEvent.META_MASK) > 0)
        {
            buffer.append("Meta ");
        }

        if ((mod & ActionEvent.CTRL_MASK) > 0)
        {
            buffer.append("Ctrl ");
        }

        model.addElement(buffer);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                ActionEventExample ex = new ActionEventExample();
                ex.setVisible(true);
            }
        });
    }
}import java.awt.*;
import javax.swing.JFrame;

class CanvasExample extends Canvas
{
    public void paint(Graphics g)
    {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("bugs.gif");
        g.drawImage(i, 10, 10, this);
    }

    public static void main(String[] args)
    {
        CanvasExample m = new CanvasExample();
        JFrame f = new JFrame("Canvas Example");
        f.add(m);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutDemo extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    CardLayoutDemo()
    {
        c = getContentPane();
        //create CardLayout object with 40 horizontal space and 30 vertical space
        card = new CardLayout(40, 30);

        c.setLayout(card);

        b1 = new JButton("Card 1.");
        b2 = new JButton("Card 2.");
        b3 = new JButton("Card 3.");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }

    public void actionPerformed(ActionEvent e)
    {
        card.next(c);
    }

    public static void main(String args[])
    {
        CardLayoutDemo cl = new CardLayoutDemo();
        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}import java.awt.*;
import javax.swing.JFrame;

public class CanvasExample extends Canvas {

 public void paint(Graphics g) {

  Toolkit t = Toolkit.getDefaultToolkit();
  Image i = t.getImage("bugs.gif");
  g.drawImage(i, 10, 10, this);

 }

 public static void main(String[] args) {
  
  CanvasExample m = new CanvasExample();
  JFrame f = new JFrame("Canvas Example");
  f.add(m);
  f.setSize(300, 300);
  f.setVisible(true);
  
 }

}import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


class ExitButtonExample extends JFrame
{
    public ExitButtonExample()
    {
        initUI();
    }

    private void initUI()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);

        JButton quitButton = new JButton("Exit");
        quitButton.setBounds(90, 60, 80, 30);

        quitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });

        panel.add(quitButton);

        setTitle("Exit Button Example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                ExitButtonExample ex = new ExitButtonExample();
                ex.setVisible(true);
            }
        });
    }
}import java.awt.*;
import javax.swing.*;

class FlowLayoutDemo
{
    FlowLayoutDemo()
    {
        JFrame f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //setting flow layout of right alignment  

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String args[])
    {
        new FlowLayoutDemo();
    }
}import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class GridBaglayoutDemo extends Applet
{
    protected void makeButton(String name, GridBagLayout gridbag, GridBagConstraints gbc)
    {
        Button b = new Button(name);
        gridbag.setConstraints(b, gbc);
        b.setBackground(Color.lightGray);
        add(b);
    }

    public void init()
    {
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setFont(new Font("Elephanta", Font.PLAIN, 20));
        setLayout(gridbag);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0; //first column  
        gbc.gridy = 0; //first row  
        makeButton("Button1", gridbag, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        makeButton("Button2", gridbag, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        makeButton("Button3", gridbag, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 40; //make this component tall  
        gbc.gridwidth = 3; //3 column wide  
        gbc.gridx = 0;
        gbc.gridy = 1; //second row  
        makeButton("Button4", gridbag, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 0; //reset to default  
        gbc.anchor = GridBagConstraints.PAGE_END; //bottom of space  
        gbc.insets = new Insets(20, 0, 0, 0); //top padding  
        gbc.gridx = 1; //aligned with button 2  
  gbc.gridwidth = 2; //2 columns wide  
        gbc.gridy = 2; //third row  
        makeButton("Button5", gridbag, gbc);
    }

    public static void main(String s[])
    {
        Frame f = new Frame("GridBagLayout Demo");
        GridBaglayoutDemo gbl = new GridBaglayoutDemo();

        gbl.init();
        f.add("Center", gbl);
        f.pack();
        f.setSize(f.getPreferredSize());
        f.show();

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}import java.awt.*;
import javax.swing.*;

class MyGridLayoutExample
{
    JFrame f;

    MyGridLayoutExample()
    {
        f = new JFrame("GridLayout Example");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        f.setLayout(new GridLayout(3, 3));
        // setting grid layout of 3 rows and 3 columns

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyGridLayoutExample();
    }
}import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class JButtonExample extends JFrame
{
    JPanel panel = new JPanel();
    JButton button = new JButton("Click Me");

    JButtonExample() // the frame constructor
    {
        super("JButton Example");

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = this.getContentPane(); // inherit main frame
        con.add(panel); // JPanel containers default to FlowLayout

        button.setMnemonic('P'); // associate hotkey to button
        panel.add(button);
        button.requestFocus();

        setVisible(true); // make frame visible
    }

    public static void main(String args[])
    {
        new JButtonExample();
    }
}import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

class AboutDialog extends JDialog
{
    public AboutDialog()
    {

        initUI();
    }

    public final void initUI()
    {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));

        //place the icon in the CLASSPATH
        ImageIcon icon = new ImageIcon("icon.png");
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        add(label);

        add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel name = new JLabel("Java Programs, 2.2.6");
        name.setFont(new Font("Serif", Font.BOLD, 13));
        name.setAlignmentX(0.5f);
        add(name);

        add(Box.createRigidArea(new Dimension(0, 50)));
JButton close = new JButton("Close");
        close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                dispose();
            }
        });

        close.setAlignmentX(0.5f);
        add(close);

        setModalityType(ModalityType.APPLICATION_MODAL);

        setTitle("About Java Programs");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new AboutDialog();
    }
}import javax.swing.*;

class JFrameHelloWorld
{

    private static void createAndShowGUI()
    {
        // Create and set up the window.
        JFrame frame = new JFrame("HelloWorld");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setting the height, width and position
        //of the frame
        frame.setBounds(100, 100, 200, 100);

        // Add the "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Display the window.
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

class JMenuBarExample
{
    private static void createAndShowGUI()
    {
        //Create and set up the window.
        JFrame frame = new JFrame("JMenuBarExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create the menu bar. Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));

        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));
frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}