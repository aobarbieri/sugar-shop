import javax.swing.JPanel;
import javax.swing.JLabel; 
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

/**
 * This class create a Panel for the project Sugar Shop
 * It contains:
 * - label
 * - Image Icon
 *
 * @author Amanda Barbieri
 * @version May/16/2020
 */
public class ShopPanel extends JPanel{
    // instance variables
    private JLabel welcome;
    private ImageIcon icon1, icon2, logo;

    /**
     * Constructor for objects of class ShopPanel
     */
    public ShopPanel(){
        super();
        setBackground(new Color(255, 203, 226));

        //set the icon
        icon1 = new ImageIcon("icecream.png");
        icon2 = new ImageIcon("drinks.png");
        logo = new ImageIcon("logo.png");
        
        
        //set the label
        welcome = new JLabel();
        add(welcome);

    }
    
    /**
     * Set the welcome label
     */
    public void setWelcomeLable(){
        welcome.setText("Welcome to");
    }
    
    /**
     * It will override the default paintComponent() method from the JPanel class
     * 
     * paintIcon: calls the method from the ImageIcon class and it needs 4 arguments:
     * - this.: identifies the component on which to place the icon(this indicates the ShopPanel)
     * - canvas: identifies the graphics object for this icon
     * - the numbers: are the cordinates of the top left where the icon should start
     */
    public void paintComponent(Graphics canvas){
        super.paintComponent(canvas);
        icon1.paintIcon(this,canvas,30,90);
        icon2.paintIcon(this,canvas,270,90);
        logo.paintIcon(this,canvas,70,10);

    }   
}