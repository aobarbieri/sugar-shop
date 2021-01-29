import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

/**
 * This class create a basic Frame for the project Sugar Shop
 * - An object of the ShopPanel is incorporated.
 *
 * @author Amanda Barbieri
 * @version May/16/2020
 */
public class ShopFrame extends JFrame{
    // instance variables
    private ShopPanel panel;
    private ImageIcon icon;
    private JProgressBar pbar;
    private int initialValue = 0;
    /**
     * Constructor for objects of class ShopFrame
     */
    public ShopFrame(){
        super("Sugar Shop");
        
        //set panel
        panel = new ShopPanel();
        add(panel);
        
        //set the progress bar
        pbar = new JProgressBar(); 
        pbar.setValue (0); //set initial value
        pbar.setStringPainted(true); //determine whether string should be displayed
        panel.add(pbar); // add the bar to the panel

        icon = new ImageIcon("machine.png");
        setIconImage(icon.getImage());
        
        setSize(500, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
        
        setBar();
        
    }
    
    /**
     * It will increase progress in the progress bar
     */
    public void setBar(){      
        while(initialValue <= 100){
            pbar.setValue(initialValue); //fill the menu bar
            
            try{
                Thread.sleep(100); /* delay the thread                
                 * Thread.sleep() method can be used to pause the execution of current thread 
                 * for specified time in milliseconds. The argument value for milliseconds 
                 * can’t be negative, else it throws IllegalArgumentException. 
                 */
            }catch(InterruptedException e){
            }
            initialValue += 2;
        }
        pbar.setVisible(false);
        panel.setWelcomeLable();
        
    }
}
