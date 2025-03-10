//packages


//imports for window layout-format
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//main class - "implements" so that tha App class may inheret 
public class App implements ActionListener{

    //set to 0; for click counter memory
    int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    //App constructor; treated just like a method
    public App() {

        //JFrame initialize
        frame = new JFrame();

        //button initialized and text added
        JButton button = new JButton("Click Me!");
        //register each click as a "count"
        button.addActionListener(this);

        //label tag for the GUI - can be edited and changed
        label = new JLabel("Number of clicks: 0"); //default view of it
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(40, 30, 10, 40));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our first GUI");
        frame.pack();
        frame.setVisible(true);

    }

    //main methods
    public static void main(String[] args) throws Exception {
        //App constructor is being initialized
        new App();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //
        count++;
        label.setText("Number of clicks: " + count); //label is used to fill that set area - use setText to display 
    }
}
