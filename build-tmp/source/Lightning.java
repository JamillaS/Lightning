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

	strokeWeight(1);
	fill(255, 255, 255);
    size(300,300);

}
public void draw()
{
	
	background(0, 0, 0);
	
	while(startX < 300)
	{

		stroke((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
		startX = endX;
		startY = endY;
		endX = startX + (int)(Math.random() * 10);
		endY = startY + (int)(Math.random() * 19 - 9);
		line(startX, startY, endX, endY);
		line(startY, startX, endY, endX);
		//line((int)(Math.random() * 300 + startX), startX, endY, endY);
		stroke(30);
		line(startY+50, startX-20, endX, endY);
		line(startX+50, startY-20, endX, endY);




	}
	noLoop();
	
}
public void mousePressed()

{
	
	
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
		
	redraw();
	

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
