
/**
 * Where the programming for the gui of this project will be stored
 * 
 * TO DO:
 * Actually have a gui
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
    /**
     * Constructor for the main window and objects in the window
     */
    public gui(){
        //Making the overall window
        setTitle("Dijkstra's Algorithm Animator");
        this.getContentPane().setPreferredSize(new Dimension(800,600)); //Create window that's 800 wide by 600 high
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /**
         * Stuff in the window
         */
        //Panels
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        mainPanel.setBackground(Color.decode("#CCCCCC"));
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        topPanel.setBackground(Color.decode("#777777"));
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(topPanel, BorderLayout.NORTH);
        
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
