import java.awt.*;
public class LabelAlign extends Frame { // Declare component Label    Label lbl1,lbl2,lbl3,lbl4;

  public LabelAlign() {
    setLayout(new FlowLayout());
    /* The possible alignment values are  Label.LEFT, Label.RIGHT, and Label.CENTER */

    lbl1 = new Label("Left Label", Label.LEFT);
    lbl2 = new Label("Right Label", Label.RIGHT);
    lbl3 = new Label("Center Label", Label.CENTER);
    lbl4 = new Label("Set Center Alignment"); // "super" Frame adds Label        add(lbl1);        add(lbl2);        add(lbl3);        add(lbl4);

    lbl4.setAlignment(Label.CENTER);
    setTitle("Label Alignment");
    setSize(150, 150);
    setVisible(true);
  }
  public static void main(String[] args) { // allocating an instance        LabelAlign lblalign= new LabelAlign();    }}import java.awt.*;

      class FontTextLabel extends Frame { // Declare component Label    Label lbl1,lbl2;

        public FontTextLabel() {
          setLayout(new FlowLayout()); // construct Label        lbl1 = new Label("Text Font Label");        lbl2 =new Label("Normal Text Label");
          // "super" Frame adds Label        add(lbl1);        add(lbl2);

          Font myFont = new Font("Serif", Font.BOLD, 12);
          lbl1.setFont(myFont);
          setTitle("AWT Elements");
          setSize(200, 200);
          setVisible(true);
        }
        public static void main(String[] args) { // allocating an instance        FontTextLabel fntlbl = new FontTextLabel();

        }
      }
      import java.awt.*;
      public class LabelExample extends Frame { // Declare component Label    Label lblCount;

        public LabelExample() {
          setLayout(new FlowLayout()); // construct Label        lblCount = new Label("Label Example");
          // "super" Frame adds Label        add(lblCount);

          setTitle("AWT Elements");
          setSize(200, 200);
          setVisible(true);
        }
        public static void main(String[] args) { // allocating an instance        LabelExample app = new LabelExample();    }}import java.awt.event.*;import java.awt.*;import javax.swing.*;
            public class JColorChooserDemo extends JFrame implements ActionListener {
              JButton b;
              Container c;
              JColorChooserDemo() {
                c = getContentPane();
                c.setLayout(new FlowLayout());
                b = new JButton("Color Chooser");
                b.addActionListener(this);
                c.add(b);
              }
              public void actionPerformed(ActionEvent e) {
                Color initialcolor = Color.RED;
                Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
                c.setBackground(color);
              }
              public static void main(String[] args) {
                JColorChooserDemo jColorChooser = new JColorChooserDemo();
                jColorChooser.setSize(400, 400);
                jColorChooser.setVisible(true);
                jColorChooser.setDefaultCloseOperation(EXIT_ON_CLOSE);
              }
            }
            import java.awt.*;
            import java.awt.event.*;
            import javax.swing.*;
            import java.util.*;

            public class ComboBoxDemo extends JPanel implements ActionListener {
              JLabel picture;
              public ComboBoxDemo() {
                  super(new BorderLayout());
                  ArrayList < String > listPet = new ArrayList < String > ();
                  listPet.add("Bird");
                  listPet.add("Cat");
                  listPet.add("Dog");
                  listPet.add("Rabbit");
                  listPet.add("Pig"); //Create the combo box, select the item at index 4.        //Indices start at 0, so 4 specifies the pig.        JComboBox petList = new JComboBox(listPet.toArray());        petList.setSelectedIndex(4);        petList.addActionListener(this);
                  //Set up the picture.        picture = new JLabel();        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));        picture.setHorizontalAlignment(JLabel.CENTER);        updateLabel(listPet.get(petList.getSelectedIndex()));        picture.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
                  //The preferred size is hard-coded to be the width of the        //widest image and the height of the tallest image + the border.        //A real program would compute this.        picture.setPreferredSize(new Dimension(177, 122 + 10));
                  //Lay out the demo.        add(petList, BorderLayout.PAGE_START);        add(picture, BorderLayout.PAGE_END);        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));    }public void actionPerformed(ActionEvent e)    {        JComboBox cb = (JComboBox) e.getSource();        String petName = (String) cb.getSelectedItem();        updateLabel(petName);    }

                  protected void updateLabel(String name) {
                    picture.setText(name);
                  }
                  /**     * Create the GUI and show it. For thread safety,     * this method should be invoked from the     * event-dispatching thread.     */

                  private static void createAndShowGUI() { //Create and set up the window.        JFrame frame = new JFrame("ComboBoxDemo");        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                      //Create and set up the content pane.        JComponent newContentPane = new ComboBoxDemo();        newContentPane.setOpaque(true); //content panes must be opaque        frame.setContentPane(newContentPane);
                      //Display the window.        frame.pack();        frame.setVisible(true);    }

                      public static void main(String[] args) { //Schedule a job for the event-dispatching thread:        //creating and showing this application's GUI.        javax.swing.SwingUtilities.invokeLater(new Runnable()        {            public void run()            {                createAndShowGUI();            }        });    }}import java.awt.*;import java.awt.event.*;import javax.swing.*;
                          class JListDemo extends JFrame { // Instance attributes used in this example    private JPanel topPanel;    private JList listbox;
                            // Constructor of main frame    public JListDemo()    {        // Set the frame characteristics        setTitle("JList Demo");        setSize(300, 150);        setBackground(Color.gray);
                            // Create a panel to hold all other components        topPanel = new JPanel();        topPanel.setLayout(new BorderLayout());        getContentPane().add(topPanel);
                            // Create some items to add to the list        String listData[] =                {                        "Java",                        "Python",                        "Polymer",                        "PHP"                };
                            // Create a new listbox control        listbox = new JList(listData);        topPanel.add(listbox, BorderLayout.CENTER);    }
                            // Main entry point for this example    public static void main(String args[])    {        // Create an instance of the test application        JListDemo mainFrame = new JListDemo();        mainFrame.setVisible(true);        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    }}import java.awt.*;import java.awt.event.*;import javax.swing.*;
                            public class JMenuBarExample implements Runnable,
                            ActionListener {
                              private JLabel message;
                              private JFrame frame;
                              private JMenuBar menuBar;
                              private JMenu fileMenu;
                              private JMenu editMenu;
                              private JMenuItem openMenuItem;
                              private JMenuItem cutMenuItem;
                              private JMenuItem copyMenuItem;
                              private JMenuItem pasteMenuItem;
                              public static void main(String[] args) {
                                SwingUtilities.invokeLater(new JMenuBarExample());
                              }
                              public void run() {
                                frame = new JFrame("Java JMenubar Example");
                                menuBar = new JMenuBar();
                                message = new JLabel();
                                message.setHorizontalAlignment(JLabel.CENTER);
                                // build the File menu   
                                fileMenu = new JMenu("File");
                                openMenuItem = new JMenuItem("Open");
                                fileMenu.add(openMenuItem); // build the Edit menu 
                                editMenu = new JMenu("Edit");
                                cutMenuItem = new JMenuItem("Cut");
                                copyMenuItem = new JMenuItem("Copy");
                                pasteMenuItem = new JMenuItem("Paste");
                                editMenu.add(cutMenuItem);
                                editMenu.add(copyMenuItem);
                                editMenu.add(pasteMenuItem);
                                openMenuItem.addActionListener(this);
                                cutMenuItem.addActionListener(this);
                                copyMenuItem.addActionListener(this);
                                pasteMenuItem.addActionListener(this); // add menus to menubar   
                                menuBar.add(fileMenu);
                                menuBar.add(editMenu); // put the menubar on the frame    
                                frame.setJMenuBar(menuBar);
                                frame.add(message, BorderLayout.CENTER);
                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame.setPreferredSize(new Dimension(400, 300));
                                frame.pack();
                                frame.setLocationRelativeTo(null);
                                frame.setVisible(true);
                              } //handles the click event on JMenutem 
                              public void actionPerformed(ActionEvent ev) {
                                String textOnMenu = ((JMenuItem) ev.getSource()).getText();
                                message.setText(textOnMenu + " menu item clicked.");
                              }
                            }