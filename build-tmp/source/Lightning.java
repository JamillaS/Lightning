import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;


public void setup()
{

	strokeWeight(5);
    size(300,300);
}
public void draw()
{
	background(0,0,0);
	stroke((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
	line(startX, startY, endX, endY);
	while(mousePressed)
	{

		startX = endX;
		startY = endY;
		endX = startX + (int)(Math.random() * 10);
		endY = startY + (int)(Math.random() * 19 - 9);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;

		




	}
	noLoop();
	
}
public void mousePressed()
{
	redraw();

}
//while(startX < 300)
	//{
	//	startX = (int)(Math.random() * 10);
	//	startX = startX + startX;
	//}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
