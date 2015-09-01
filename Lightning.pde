
int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;


void setup()
{

	strokeWeight(5);
    size(300,300);
}
void draw()
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
void mousePressed()
{
	redraw();

}
//while(startX < 300)
	//{
	//	startX = (int)(Math.random() * 10);
	//	startX = startX + startX;
	//}