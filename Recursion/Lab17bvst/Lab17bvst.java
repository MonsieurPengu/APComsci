// Lab17bvst.java
// The student, starting version of the Lab17b assignment.


import java.awt.*;
import java.applet.*;


public class Lab17bvst extends Applet
{

	public void paint (Graphics g)
	{
		drawSquare1(g,1000,650);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/4;
		int startHeight = maxY/4;
		int tlX = midX - (startWidth/2);
		int tlY = midY - (startHeight/2);
		g.fillRect(tlX,tlY,startWidth,startHeight);
      drawNE(g, tlX, tlY, startWidth, startHeight);  //NW
      drawNW(g, tlX, tlY, startWidth, startHeight);  //NW
      drawSW(g, tlX, tlY, startWidth, startHeight);  //NW
      drawSE(g, tlX, tlY, startWidth, startHeight);  //NW


      
	}
   
   /*public void drawFractal(Graphics g, int x, int y, int width, int height)
   {
   if(width>=1 && height >=1)
   {
   delay(200);
   g.fillRect(x,y,width,height);
   int newW = width/2;
   int newH = height/2;
   drawFractal(g, x-newW, y-newH, newW, newH);  //NW
   drawFractal(g, x+width, y-newH, newW, newH);  //NE
   drawFractal(g, x-newW, y+height, newW, newH);  //SW
   drawFractal(g, x+width, y+height, newW, newH);  //SE
   }
}*/

public void drawNW(Graphics g, int x, int y , int width, int height)
{

if(width>=1 && height>=1)
{
   delay(200);
   g.fillRect(x,y,width,height);
   int newW = width/2;
   int newH = height/2;
   drawNE(g, x+width, y-newH, newW, newH);  //NE
   drawSW(g, x-newW, y+height, newW, newH);  //SW
   
   drawNW(g, x-newW, y-newH, newW, newH);  //NW

}
}

public void drawNE(Graphics g, int x, int y , int width, int height)
{
if(width>=1 && height>=1)
{
   delay(200);
   g.fillRect(x,y,width,height);
   int newW = width/2;
   int newH = height/2;
   drawNW(g, x-newW, y-newH, newW, newH);  //NW
   drawSE(g, x+width, y+height, newW, newH);  //SE
   
   drawNE(g, x+width, y-newH, newW, newH);  //NE

}
}

public void drawSE(Graphics g, int x, int y , int width, int height)
{
if(width>=1 && height>=1)
{
   delay(200);
   g.fillRect(x,y,width,height);
   int newW = width/2;
   int newH = height/2;
   drawNE(g, x+width, y-newH, newW, newH);  //NE
   drawSW(g, x-newW, y+height, newW, newH);  //SW
   
   drawSE(g, x+width, y+height, newW, newH);  //SE


}
}

public void drawSW(Graphics g, int x, int y , int width, int height)
{
if(width>=1 && height>=1)
{
   delay(200);
   g.fillRect(x,y,width,height);
   int newW = width/2;
   int newH = height/2;
   drawNW(g, x-newW, y-newH, newW, newH);  //NW
   drawSE(g, x+width, y+height, newW, newH);  //SE
   
   drawSW(g, x-newW, y+height, newW, newH);  //SW

}

}

  
	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

}


