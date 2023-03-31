import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Panel extends JPanel implements KeyListener{

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    snake mySnake = new snake();

    Panel(){
        this.addKeyListener(this);
    }

    // paint the snake
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0, 0, 10, 150);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        switch(keyCode){
            // right arrow key
            case KeyEvent.VK_RIGHT:
                snake(10,0);
                break;
            // left arrow key
            case KeyEvent.VK_LEFT:
                snake(10,0);
                break;
            case KeyEvent.VK_UP:
                snake(10,0);
                break;
            case KeyEvent.VK_DOWN:
                snake(10,0);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    


}
