
/**
 * Where the programming for the CopyOfCopyOfgui of this project will be stored
 *
 * Josh Hunter
 * 16/06/25 -
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
public class Gui extends JFrame implements ActionListener
{
    //Stuff on the windows
    JPanel mainPanel;
    JPanel bottomPanel;
    JPanel sidePanel;
    JLabel nodeQuestion;
    JTextField nodeQuestionBox;
    JButton random;
    JButton submitNodeAnswer;
    JButton createDiagram;
    /**
     * Constructor for the main window and objects in the window
     */
    public Gui(){
        //Making the overall window
        setTitle("Dijkstra's Algorithm Animator");
        this.getContentPane().setPreferredSize(new Dimension(900,600)); //Create window that's 900 wide by 600 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /**JDialog output = new JDialog(this);
        output.setBounds(300,500,300,500);
        output.setTitle("Output Window");*/
        
        /**
         * Stuff in the window
         */
        //Panels
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        mainPanel.setBackground(Color.decode("#CCCCCC"));
        this.add(mainPanel, BorderLayout.CENTER);
        
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        bottomPanel.setPreferredSize(new Dimension(900,40)); //The bottom panel is the width of the window and is tall enough to see the buttons
        bottomPanel.setBackground(Color.decode("#777777"));
        this.add(bottomPanel, BorderLayout.SOUTH);
        
        sidePanel = new JPanel();
        sidePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        sidePanel.setPreferredSize(new Dimension(250,600)); //The side panel is the height of the window and is wide enough to see the buttons
        sidePanel.setBackground(Color.decode("#777777"));
        this.add(sidePanel, BorderLayout.WEST);
        
        //Objects in the bottom panel
        nodeQuestion = new JLabel("How many nodes should there be?");
        nodeQuestion.setForeground(Color.decode("#000000"));
        sidePanel.add(nodeQuestion);
        
        nodeQuestionBox = new JTextField(20);
        sidePanel.add(nodeQuestionBox);
        
        submitNodeAnswer = new JButton("Submit node amount");
        submitNodeAnswer.addActionListener(this);
        sidePanel.add(submitNodeAnswer);
        
        random = new JButton("Random amount");
        random.addActionListener(this);
        sidePanel.add(random);
        
        createDiagram = new JButton("Create Diagram!");
        createDiagram.addActionListener(this);
        bottomPanel.add(createDiagram);
        
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
            default:
                
        }
    }
    /**
     * Outcomes from inputs in the CopyOfCopyOfgui
     */
}
