package guimodule;

import processing.core.PApplet;

public class MyDisplay1 extends PApplet
{
	public void setup()
	{
		size(600,600);
		background(200,200,150);
	}
	
	public void draw()
	{
		fill(250,250,0);
		ellipse(width/2,height/2,450,450);
		
		fill(0,0,0);
		ellipse(width/3,height/3+50,90,80);
		
		fill(0,0,0);
		ellipse(2*width/3,height/3+50,90,80);
		
		noFill();
		arc(width/2,375,150,125,0,PI);
		
	}
}
