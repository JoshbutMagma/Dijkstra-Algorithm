
/**
 * Where the programming for the gui of this project will be stored
 *
 * Josh Hunter
 * 16/06/25 -
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
public class gui extends JFrame implements ActionListener
{
    //Stuff on the windows
    JPanel mainPanel;
    JPanel topPanel;
    JLabel nodeQuestion;
    JTextField nodeQuestionBox;
    JButton random;
    JButton submitNodeAnswer;
    JButton createDiagram;
    /**
     * Constructor for the main window and objects in the window
     */
    public gui(){
        //Making the overall window
        setTitle("Dijkstra's Algorithm Animator");
        this.getContentPane().setPreferredSize(new Dimension(1000,800)); //Create window that's 1000 wide by 800 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /**
         * Stuff in the window
         */
        //Panels
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        mainPanel.setBackground(Color.decode("#CCCCCC"));
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        topPanel.setBackground(Color.decode("#777777"));
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(topPanel, BorderLayout.NORTH);
        
        //Objects in the top panel
        nodeQuestion = new JLabel("How many nodes should there be?");
        topPanel.add(nodeQuestion);
        
        nodeQuestionBox = new JTextField(30);
        topPanel.add(nodeQuestionBox);
        
        random = new JButton("Random amount");
        random.addActionListener(this);
        topPanel.add(random);
        
        submitNodeAnswer = new JButton("Submit node amount");
        submitNodeAnswer.addActionListener(this);
        topPanel.add(submitNodeAnswer);
        
        createDiagram = new JButton("Create Diagram!");
        createDiagram.addActionListener(this);
        topPanel.add(createDiagram);
        
        //Make the window appear on the screen
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
    /**
     * Listener
     */
    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand();
        
        switch(cmd){
            
        }
    }
    /**
     * Outcomes from inputs in the gui
     */
}
