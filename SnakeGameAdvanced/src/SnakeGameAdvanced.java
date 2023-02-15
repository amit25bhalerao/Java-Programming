import javax.swing.*;
import java.awt.*;

public class SnakeGameAdvanced
{
    public static void main(String[] args)
    {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();

        obj.setBounds(0,0,1500,725);
        obj.setResizable(false);
        obj.setTitle("SNAKE XENZIA");
        obj.setBackground(Color.DARK_GRAY);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        obj.add(gameplay);

    }
}
