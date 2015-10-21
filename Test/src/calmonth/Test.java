package calmonth;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JWindow;


public class Test {
    //отрисовка главного окна с фоном
    public static class PaintMainFrame extends JFrame  {
    	PaintMainFrame() {
            super("Calendar");
            JLabel backgroundLabel = null;
            try {
                backgroundLabel = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\java apl\\Test\\1\\MainPanel.png"))));
    	    } catch (IOException e) {
    	    } 
            setDefaultCloseOperation(EXIT_ON_CLOSE);           
            
            backgroundLabel.setLayout(null);
                        
            JButton button1 = new JButton();
            button1.setIcon(new ImageIcon("1\\1.png"));
            button1.setSize(200, 100);
            button1.setLocation(230,1110);
            button1.setPressedIcon(new ImageIcon("1\\week1pressed.png"));
            button1.setRolloverIcon(new ImageIcon("1\\week1pressed.png"));
            button1.setBorderPainted(false);
            button1.setFocusPainted(false);
            button1.setContentAreaFilled(false);
            backgroundLabel.add(button1);
            
            JButton button2 = new JButton();
            button2.setIcon(new ImageIcon("1\\2.png"));
            button2.setSize(200, 100);
            button2.setLocation(430,1110);
            button2.setPressedIcon(new ImageIcon("1\\month2pressed.png"));
            button2.setRolloverIcon(new ImageIcon("1\\month2pressed.png"));
            button2.setBorderPainted(false);
            button2.setFocusPainted(false);
            button2.setContentAreaFilled(false);
            backgroundLabel.add(button2);
            
            JButton button3 = new JButton();
            button3.setIcon(new ImageIcon("1\\3.png"));
            button3.setSize(200, 100);
            button3.setLocation(630,1110);
            button3.setPressedIcon(new ImageIcon("1\\year3pressed.png"));
            button3.setRolloverIcon(new ImageIcon("1\\year3pressed.png"));
            button3.setBorderPainted(false);
            button3.setFocusPainted(false);
            button3.setContentAreaFilled(false);
            backgroundLabel.add(button3);
            
            JButton button4 = new JButton();
            button4.setIcon(new ImageIcon("1\\4.png"));
            button4.setSize(200, 100);
            button4.setLocation(830,1110);
            button4.setPressedIcon(new ImageIcon("1\\setting4pressed.png"));
            button4.setRolloverIcon(new ImageIcon("1\\setting4pressed.png"));
            button4.setBorderPainted(false);
            button4.setFocusPainted(false);
            button4.setContentAreaFilled(false);
            backgroundLabel.add(button4);   
            
           

            
            setContentPane(backgroundLabel);           
            pack();            
    	    setVisible(true);
            
            
        }
    }

    public static void main(String[] args) {
        //создание окна с фоном
        PaintMainFrame frame = new PaintMainFrame(); 
        
                
        
        
        
      
        
    }    
}





