
int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;


void setup()
{

	strokeWeight(1);
	fill(255, 255, 255);
    size(300,300);
    frameRate(120);
}
void draw()
{
	
	background(0, 0, 0);

	//line(startX, startY, endX, endY);
	while(startX < 300)
	{

		stroke((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
		startX = endX;
		startY = endY;
		endX = startX + (int)(Math.random() * 10);
		endY = startY + (int)(Math.random() * 19 - 9);
		line(startX, startY, endX, endY);
		line(startY, startX, endY, endX);



	}
	noLoop();
	
}
void mousePressed()

{
	
	
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
		
	redraw();
	

}
