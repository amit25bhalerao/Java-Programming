import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Gameplay extends JPanel implements KeyListener, ActionListener
{
    private Random random = new Random();
    private Timer timer;

    private int snakexlength[]=new int[1000];
    private int snakeylength[]=new int[1000];
    private int enemyxposition[]={25,50,75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625,650,675,700,725,750,775,800,825,850,875,900,925,950,975,1000,1025,1050,1075,1100,1125,1150,1175,1200,1225,1250,1275,1300,1325,1350,1375,1400,1425,1450};
    private int enemyyposition[]={75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625,650};

    private boolean right = false;
    private boolean left =false;
    private boolean up = false;
    private boolean down = false;

    private int delay=100;
    private int moves=0;
    private int score=0;
    private int lengthofsnake=5;
    private int xpos=random.nextInt(58);
    private int ypos=random.nextInt(23);

    private ImageIcon downmouth;
    private ImageIcon upmouth;
    private ImageIcon leftmouth;
    private ImageIcon rightmouth;
    private ImageIcon snaketitle;
    private ImageIcon snakeimage;
    private ImageIcon enemyicon;
    private ImageIcon border;
    private ImageIcon border1;

    public Gameplay()
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer=new Timer(delay,this);
        timer.start();
    }

    public void paint(Graphics g)
    {
       if(moves==0)
       {
           snakexlength[4]=50;
           snakexlength[3]=75;
           snakexlength[2]=100;
           snakexlength[1]=125;
           snakexlength[0]=150;

           snakeylength[4]=100;
           snakeylength[3]=100;
           snakeylength[2]=100;
           snakeylength[1]=100;
           snakeylength[0]=100;
       }


       //Creating Title Image Border
       g.setColor(Color.black);
       g.drawRect(24,10,1452,54 );

       //Creating Playing Area Border
       g.setColor(Color.black);
       g.drawRect(24,74, 1452,600);

       //Filling Playing Area With A Colour
       g.setColor(Color.DARK_GRAY);
       g.fillRect(24,74,1452,600);

       snaketitle = new ImageIcon("snaketitle.jpg");
       snaketitle.paintIcon(this,g,24,10);

       border = new ImageIcon("border.png");
       border.paintIcon(this,g,25,75);
       border.paintIcon(this,g,25,650);

        border1 = new ImageIcon("border1.png");
        border1.paintIcon(this,g,25,75);
        border1.paintIcon(this,g,1452,75);

        rightmouth = new ImageIcon("rightmouth.png");
        rightmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);

        g.setColor(Color.white);
        g.drawString("SCORES: "+score,1300,30);

        g.setColor(Color.white);
        g.drawString("LENGTH OF SNAKE: "+lengthofsnake,1300,50);

        //Detecting type of image to be created

        for(int a =0; a<lengthofsnake;a++)
        {
            if(a==0 & right)
            {
                rightmouth = new ImageIcon("rightmouth.png");
                rightmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a==0 & left)
            {
                leftmouth = new ImageIcon("leftmouth.png");
                leftmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a==0 & up)
            {
                upmouth = new ImageIcon("upmouth.png");
                upmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a==0 & down)
            {
                downmouth = new ImageIcon("downmouth.png");
                downmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a!=0)
            {
                snakeimage = new ImageIcon("snakeimage.png");
                snakeimage.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }
        }

        if(xpos==0)
            xpos=xpos+1;
        if(xpos==57)
            xpos=xpos-1;
        if(ypos==0)
            ypos=ypos+1;
        if(ypos==23)
            ypos=ypos-1;
        enemyicon = new ImageIcon("enemy.png");
        enemyicon.paintIcon(this,g,enemyxposition[xpos],enemyyposition[ypos]);


        if((enemyxposition[xpos]==snakexlength[0])&&(enemyyposition[ypos]==snakeylength[0]))
        {
            score++;
            lengthofsnake++;
            xpos=random.nextInt(57);
            ypos=random.nextInt(24);
        }

        for(int b=1;b<=lengthofsnake;b++)
        {
            if((snakexlength[b]==snakexlength[0])&&(snakeylength[b]==snakeylength[0])||(snakexlength[b]==enemyxposition[57])||(snakeylength[b]==enemyyposition[23])||(snakexlength[b]==enemyxposition[0])||(snakeylength[b]==enemyyposition[0]))
            {
                right=false;
                left=false;
                up=false;
                down=false;

                g.setColor(Color.white);
                g.setFont(new Font("aerial",Font.BOLD,25));
                g.drawString("GAME OVER!",600,300);

                g.setColor(Color.white);
                g.setFont(new Font("aerial",Font.BOLD,25));
                g.drawString("PRESS SPACE TO RESTART",600,340);
            }
        }



        g.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        timer.start();

        if(right)
        {
            for(int r=lengthofsnake-1;r>=0;r--)     //making body of snake follow the head
            {
                snakeylength[r+1]=snakeylength[r];
            }

            for(int r=lengthofsnake;r>=0;r--)
            {
                if(r==0)
                {
                    snakexlength[r]=snakexlength[r]+25;     // if snake moves to right, increase size
                }
                else
                {
                    snakexlength[r]=snakexlength[r-1];      //if snake moves to left, dont let it turn left but put left face to output
                }

                if(snakexlength[r]>1450)             //if snake crosses the frame by moving towards right , bring it from left
                {
                    snakexlength[r]=25;
                }

                repaint();
            }
        }

        if(left)
        {
            for(int r=lengthofsnake-1;r>=0;r--)     //making body of snake follow the head
            {
                snakeylength[r+1]=snakeylength[r];
            }

            for(int r=lengthofsnake;r>=0;r--)
            {
                if(r==0)
                {
                    snakexlength[r]=snakexlength[r]-25;
                }
                else
                {
                    snakexlength[r]=snakexlength[r-1];
                }

                if(snakexlength[r]<25)
                {
                    snakexlength[r]=1450;
                }

                repaint();
            }
        }

        if(up)
        {
            for (int r = lengthofsnake - 1; r >=0; r--)     //making body of snake follow the head
            {
                snakexlength[r + 1] = snakexlength[r];
            }

            for (int r = lengthofsnake; r >= 0; r--)
            {
                if (r == 0)
                {
                    snakeylength[r] = snakeylength[r] - 25;
                } else
                {
                    snakeylength[r] = snakeylength[r - 1];
                }

                if (snakeylength[r] < 75)
                {
                    snakeylength[r] = 650;

                }

                repaint();
            }
        }

        if (down)
        {
            for (int r = lengthofsnake - 1; r >= 0; r--)     //making body of snake follow the head
            {
                snakexlength[r + 1] = snakexlength[r];
            }

            for (int r = lengthofsnake; r >= 0; r--)
            {
                if (r == 0)
                {
                    snakeylength[r] = snakeylength[r] + 25;
                } else
                {
                    snakeylength[r] = snakeylength[r - 1];
                }

                if (snakeylength[r] > 650)
                {
                    snakeylength[r] = 75;
                }

                repaint();
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_SPACE)
        {
            moves=0;
            score=0;
            lengthofsnake=5;
            repaint();
        }


        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            moves++;
            right=true;

            if(!left)
            {
                right=true;
            }
            else
            {
                left=true;
                right=false;
            }

            up=false;
            down=false;

            repaint();
        }

        if(e.getKeyCode()== KeyEvent.VK_LEFT)
        {
            moves++;
            left=true;

            if(!right)
            {
                left=true;
            }
            else
            {
                right=true;
                left=false;
            }

            up = false;
            down = false;
        }


        if(e.getKeyCode()== KeyEvent.VK_UP)
        {
            moves++;
            up=true;

            if(!down)
            {
                up=true;
            }
            else
            {
                down=true;
                up=false;
            }

            left = false;
            right = false;
        }


        if(e.getKeyCode()== KeyEvent.VK_DOWN)
        {
            moves++;
            down=true;

            if(!up)
            {
                down=true;
            }
            else
            {
                down=false;
                up=true;
            }

            left = false;
            right = false;
        }
    }



    @Override
    public void keyReleased(KeyEvent e) {

    }
}
