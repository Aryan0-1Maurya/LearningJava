import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;
class JOptionPaneDemo extends JFrame implements ActionListener {  
    Container contentPane = null;  
    private JButton jbnDialog;  
    String ButtonLabels;  
    private JRadioButton[] dialogTypeButtons;  
    private JRadioButton[] messageTypeButtons;  
    private int[] messageTypes = {
        JOptionPane.PLAIN_MESSAGE,
        JOptionPane.INFORMATION_MESSAGE,
        JOptionPane.QUESTION_MESSAGE,
        JOptionPane.WARNING_MESSAGE,
        JOptionPane.ERROR_MESSAGE
    };  
    private ButtonGroup messageTypeButtonGroup, buttonTypeButtonGroup, dialogTypeButtonGroup;  
    private JRadioButton[] optionTypeButtons;  
    private int[] OptionTypes = {
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.YES_NO_OPTION,
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.OK_CANCEL_OPTION
    };     
    public static void main(String[] args)   {    
        new JOptionPaneDemo();  
    }    
    public JOptionPaneDemo()   {    
        super("JOptionPane Demo");    
        addWindowListener(new WindowListener());    
        contentPane = getContentPane();    
        contentPane.setLayout(new GridLayout(0, 1));    
        JPanel jplButton = new JPanel();    
        jbnDialog = new JButton("Show an Option Pane");    
        jbnDialog.addActionListener(this);    
        jplButton.add(jbnDialog);    
        contentPane.add(jplButton);    
        createRadioButtonGroupings();    
        ButtonLabels = "Button1 Button2 Button3";    
        pack();
        setVisible(true);  
    }  
    public void createRadioButtonGroupings()   {    
        JPanel jplDialogType = new JPanel();    
        dialogTypeButtonGroup = new ButtonGroup();    
        dialogTypeButtons = new JRadioButton[] {
            new JRadioButton("Show Message", true), new JRadioButton("Get Confirmation"), new JRadioButton("Collect Input"), new JRadioButton("Present Options")
        };        
        for (int i = 0; i < dialogTypeButtons.length; i++)     {      
            dialogTypeButtonGroup.add(dialogTypeButtons[i]);      
            jplDialogType.add(dialogTypeButtons[i]);    
        }    
        contentPane.add(jplDialogType);    
        JPanel jplMessageType = new JPanel();    
        messageTypeButtonGroup = new ButtonGroup();    
        messageTypeButtons = new JRadioButton[] {
            new JRadioButton("Plain"), new JRadioButton("Information", true), new JRadioButton("Question"), new JRadioButton("Warning"), new JRadioButton("Error")
        };         
        for (int i = 0; i < messageTypeButtons.length; i++)     {      
            messageTypeButtonGroup.add(messageTypeButtons[i]);
            jplMessageType.add(messageTypeButtons[i]);    
        }    
        contentPane.add(jplMessageType);    
        JPanel jplButtonType = new JPanel();    
        buttonTypeButtonGroup = new ButtonGroup();    
        optionTypeButtons = new JRadioButton[] {
            new JRadioButton("Default", true), new JRadioButton("Yes/No"), new JRadioButton("Yes/No/Cancel"), new JRadioButton("OK/Cancel")
        };    
        for (int i = 0; i < optionTypeButtons.length; i++)     {      
            buttonTypeButtonGroup.add(optionTypeButtons[i]);      
            jplButtonType.add(optionTypeButtons[i]);    
        }    
        contentPane.add(jplButtonType);  
    }   // Windows Listener for Window Closing    public class WindowListener extends WindowAdapter    {
        
    public void windowClosing(WindowEvent event)     {      
        System.exit(0);    
    }  
}  
public void actionPerformed(ActionEvent event)   {    /*       * dialogTypeButtons =       *       * new JRadioButton[] { new JRadioButton("Show Message", true),       *       * new JRadioButton("Get Confirmation"),       *       * new JRadioButton("Collect Input"),       *       * new JRadioButton("Present Options") };       */     
    if (dialogTypeButtons[0].isSelected())     {      
        JOptionPane.showMessageDialog(this, "Show Message", "Simple Dialog", getMessageType());
    }    
    else if (dialogTypeButtons[1].isSelected())     {      
        JOptionPane.showConfirmDialog(this, "Get Confirmation", "Simple Dialog", getButtonType(), getMessageType());    
    }    
    else if (dialogTypeButtons[2].isSelected())     {      
        JOptionPane.showInputDialog(this, "Collect Input", "Simple Dialog", getMessageType(), null, null, null);    
    }    
    else if (dialogTypeButtons[3].isSelected())     {      
        JOptionPane.showOptionDialog(this, "Present Options", "Simple Dialog", getButtonType(), getMessageType(), null, substrings(ButtonLabels), null);    
    }  
}  
private int getAssociatedType(AbstractButton[] buttons, int[] types)   {    
    for (int i = 0; i < buttons.length; i++)     {      
        if (buttons[i].isSelected())       {        
            return (types[i]);      
        }    
    }    
    return (types[0]);  
}  
private int getMessageType()   {    
    return (getAssociatedType(messageTypeButtons, messageTypes));  
}  
private int getButtonType()   {    
    return (getAssociatedType(optionTypeButtons, OptionTypes));  
}  
private String[] substrings(String string)   {    
    StringTokenizer tok = new StringTokenizer(string);    
    String[] substrings = new String[tok.countTokens()];    
    for (int i = 0; i < substrings.length; i++)     {      
        substrings[i] = tok.nextToken();    
    }    
    return (substrings);  
}
}
import javax.swing.JOptionPane;
class JOptionDemo {  
    public static void main(String[] args)   {    
        String fullName = " ";    
        String strAge = " ";    
        int age = 0;    
        fullName = JOptionPane.showInputDialog(null, "Enter your full name: ");    
        JOptionPane.showMessageDialog(null, "Your full name is " + fullName);    
        strAge = JOptionPane.showInputDialog(null, " Enter your age: ");    
        age = Integer.parseInt(strAge);    
        JOptionPane.showConfirmDialog(null, age, "Is this your real age?", JOptionPane.OK_CANCEL_OPTION);    
        JOptionPane.showMessageDialog(null, "Your age is " + age + ".");  
    }
}
import java.awt.*;
import javax.swing.*;
class JScrollPaneDemo extends JApplet {  
    Container c;  
    JPanel panel;  
    public void init()   {    
        c = getContentPane();    
        c.setLayout(new BorderLayout());    
        panel = new JPanel();    
        panel.setLayout(new GridLayout(20, 20));    
        int b = 1;    
        for (int i = 0; i < 20; i++)     {      
            for (int j = 0; j < 20; j++)       {        
                panel.add(new JButton("Button" + b));        
                b++;      
            }    
        }    
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;    
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;    
        JScrollPane jsp = new JScrollPane(panel, v, h);    
        c.add(jsp, "Center");  
    }
}
/*<applet code = "JScrollPaneDemo" width = "250" height = "250"></applet>*/
import javax.swing.*;
class JTableDemo {  
    JFrame f;  
    JTableDemo()   {    
        f = new JFrame();    
        String data[][] = {        
            {
                "101",
                "ABC",
                "10000"
            },
                     {
                "102",
                "DEF",
                "20000"
            },
                     {
                "103",
                "XYZ",
                "30000"
            }
        };    
        String column[] = {
            "ID",
            "NAME",
            "SALARY"
        };    
        JTable jt = new JTable(data, column);    
        jt.setBounds(30, 40, 200, 300);    
        JScrollPane sp = new JScrollPane(jt);    
        f.add(sp);    
        f.setSize(300, 400);    
        f.setVisible(true);  
    }  
    public static void main(String args[])   {    
        new JTableDemo();  
    }
}
import java.awt.Color;
import javax.swing.*;
class TextAreaExample {  
    JTextArea area;  
    JFrame f;  
    TextAreaExample()   {    
        f = new JFrame();    
        area = new JTextArea(300, 300);    
        area.setBounds(10, 30, 300, 300);    
        area.setBackground(Color.black);    
        area.setForeground(Color.white);    
        area.setText("This is a TextArea.");    
        f.add(area);    
        f.setSize(300, 300);    
        f.setLayout(null);    
        f.setVisible(true);  
    }  
    public static void main(String[] args)   {    
        new TextAreaExample();  
    }
}
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
class LoginView {  
    public static void main(String[] args)   {    
        JFrame frame = new JFrame("Demo application");    
        frame.setSize(300, 150);    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        JPanel panel = new JPanel();    
        frame.add(panel);    
        placeComponents(panel);    
        frame.setVisible(true);  
    }  
    private static void placeComponents(JPanel panel)   {    
        panel.setLayout(null);    
        JLabel userLabel = new JLabel("User");    
        userLabel.setBounds(10, 10, 80, 25);    
        panel.add(userLabel);    
        JTextField userText = new JTextField(20);    
        userText.setBounds(100, 10, 160, 25);    
        panel.add(userText);    
        JLabel passwordLabel = new JLabel("Password");    
        passwordLabel.setBounds(10, 40, 80, 25);    
        panel.add(passwordLabel);    
        JPasswordField passwordText = new JPasswordField(20);    
        passwordText.setBounds(100, 40, 160, 25);    
        panel.add(passwordText);    
        JButton loginButton = new JButton("login");    
        loginButton.setBounds(10, 80, 80, 25);    
        panel.add(loginButton);    
        JButton registerButton = new JButton("register");    
        registerButton.setBounds(180, 80, 80, 25);    
        panel.add(registerButton);  
    }
}
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
class MultipleEventSources extends JFrame {  
    JLabel statusbar;  
    public MultipleEventSources()   {    
        initUI();  
    }  
    public final void initUI()   {    
        JPanel panel = new JPanel();    
        statusbar = new JLabel("Click on any button");    
        statusbar.setBorder(BorderFactory                  .createEtchedBorder(EtchedBorder.RAISED));    
        panel.setLayout(null);    
        JButton close = new JButton("Button 1");    
        close.setBounds(40, 30, 90, 25);    
        close.addActionListener(new ButtonListener());    
        JButton open = new JButton("Button 2");    
        open.setBounds(40, 80, 90, 25);    
        open.addActionListener(new ButtonListener());    
        JButton find = new JButton("Button 3");    
        find.setBounds(40, 130, 90, 25);    
        find.addActionListener(new ButtonListener());
        JButton save = new JButton("Button 4");    
        save.setBounds(40, 180, 90, 25);    
        save.addActionListener(new ButtonListener());    
        panel.add(close);    
        panel.add(open);    
        panel.add(find);    
        panel.add(save);    
        add(panel);    
        add(statusbar, BorderLayout.SOUTH);    
        setTitle("Multiple Event Sources");    
        setSize(300, 300);    
        setLocationRelativeTo(null);    
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    class ButtonListener implements ActionListener   {    
        public void actionPerformed(ActionEvent e)     {      
            JButton o = (JButton) e.getSource();      
            String label = o.getText();      
            statusbar.setText(" " + label + " button clicked");    
        }  
    }  
    public static void main(String[] args)   {    
        SwingUtilities.invokeLater(new Runnable()     {      
            public void run()       {        
                MultipleEventSources ms = new MultipleEventSources();        
                ms.setVisible(true);      
            }    
        });  
    }
}
import javax.swing.JFrame;
class SimpleJFrameExample extends JFrame {  
    public SimpleJFrameExample()   {    
        setTitle("Simple JFrame Example");    
        setSize(300, 200);    
        setLocationRelativeTo(null);    
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        setVisible(true);  
    }  
    public static void main(String[] args)   {    
        SimpleJFrameExample ex = new SimpleJFrameExample();  
    }
}
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
public class TooltipExample extends JFrame { 
    public TooltipExample() { 
        initUI(); 
    } 
    private void initUI() { 
        JPanel panel = new JPanel(); 
        getContentPane().add(panel); 
        panel.setLayout(null); 
        panel.setToolTipText("This is panel"); 
        JButton btn = new JButton("Button"); 
        btn.setBounds(100, 60, 100, 30); 
        btn.setToolTipText("This is a button"); 
        panel.add(btn); 
        setTitle("Tooltip"); 
        setSize(300, 300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() {  
            @Override   public void run() {  
                TooltipExample ex = new TooltipExample();  
                ex.setVisible(true);  
            } 
        }); 
    }
}