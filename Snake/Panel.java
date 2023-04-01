import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Panel extends JPanel implements KeyListener{

    int xPos;
    int yPos;
    int xVelocity=10;
    int yVelocity=10;
    String key="";
    snake mySnake;

    Panel(){
        mySnake = new snake(0,0);
        this.setLayout(null);
        this.setBackground(Color.BLACK);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("u pressed a key");

        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                key="U";
                break;

            case KeyEvent.VK_DOWN:
                key="D";
                break;

            case KeyEvent.VK_RIGHT:
                key="R";
                break;

            case KeyEvent.VK_LEFT:
                key="L";
                break;
        }
        repaint();
    }

    // paint the snake
    public void paint(Graphics g){
        mySnake.paint(g, key);
    }

    // when running the program
    public void run(){

    }

}
