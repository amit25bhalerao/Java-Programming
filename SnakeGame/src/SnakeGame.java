import javax.swing.*;
import java.awt.*;

public class SnakeGame
{
    public static void main(String[] args)
    {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();

        obj.setBounds(10,10,905,700);
        obj.setTitle("SNAKE XENZIA");
        obj.setBackground(Color.darkGray);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        obj.add(gameplay);
    }
}
