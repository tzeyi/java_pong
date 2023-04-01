import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class snake extends Rectangle{

    // initialize length, and snake x/y positions
    int length=5;
    int unit=10;
    int xPos;
    int yPos;

    snake(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }
    
    // paint the snake
    public void paint(Graphics g, String keyPressed){

        System.out.println(keyPressed);
        for (int i=length; i>=0; i--){
            g.setColor(Color.GREEN);
            if (i==0){
                g.setColor(Color.RED);
            }
            
            // g.fillRect(0, 0, unit, unit);

            switch (keyPressed){
                case "U":
                    System.out.println("print a block");
                    yPos-=unit;
                    g.fillRect(xPos, yPos, unit, unit);
                    break;
                case "D":
                    yPos+=unit;
                    g.fillRect(xPos, yPos, unit, unit);
                    break;
                case "R":
                    xPos+=unit;
                    g.fillRect(xPos, yPos, unit, unit);
                    break;
                case "L":
                    xPos-=unit;
                    g.fillRect(xPos, yPos, unit, unit);
                    break;
            }


        }
    
    }

}
