import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame{

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    Frame(){
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBounds((int)(screenSize.getWidth()/3), (int)(screenSize.getHeight()/4), 450, 350);

        Panel myPanel= new Panel();
        this.add(myPanel);
    }
    
}