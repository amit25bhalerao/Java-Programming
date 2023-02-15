package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet
{
	private String URL = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg";
    private	PImage background;
	
	public void setup()
	{
		size(800,800);
		background = loadImage(URL,"jpg");	//Lower the number closer to black, higher the number closer to white.
	}
	
	public void draw()
	{
		int colour[]=getthecolour(second());
		background.resize(width,height);
		image(background,0,0);
		ellipse(height/4,width/5,height/5,width/5);
		fill(colour[0],colour[1],colour[2]);
	}
	
	public int[] getthecolour(float second)
	{
		int rgbcolour[]= new int[3];
		
		float sec = Math.abs(second-35);
		float uplimit = sec/35;
		
		rgbcolour[0]=(int)(255*uplimit);
		rgbcolour[1]=(int)(255*uplimit);
		rgbcolour[2]=0;
		
		return rgbcolour;
	
	}
}

