import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 *
 * 02-27-15 altered by Leon Schram
 * This file is made shorter to focus on the Lab15b assignment.
 *
 */
 
 
 
//////////////////////////////////////////////////////////////////////////
//
// This is the student starting file of the Lab15b assignment.
//
// This is the only file that students use to write their methods.
//
//////////////////////////////////////////////////////////////////////////
 
 
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
      
 ////////////////////////////////////////////////////////////////////////  
   
      // REQUIRED FOR 80-POINTS
      public void grayScale()
      {
         Pixel[][] pixels = this.getPixels2D();
         for(int r = 0; r<480; r++)
            for(int c = 0; c<640;c++)
            {
            int red = pixels[r][c].getRed();
            int green = pixels[r][c].getGreen();
            int blue = pixels[r][c].getBlue();
            int avg = (red + green + blue)/3;
            pixels[r][c].setGreen(avg);
            pixels[r][c].setRed(avg);
            pixels[r][c].setBlue(avg);
            }
            
      }
  
//////////////////////////////////////////////////////////////////////////  

      // REQUIRED FOR 80-POINTS
      public void mirror()
      {  
         Pixel[][] pix = this.getPixels2D();
         for(int r = 0; r<480; r++)
         {
            for(int c = 0; c<320;c++)
            {
            int red = pix[r][c].getRed();
            int green = pix[r][c].getGreen();
            int blue = pix[r][c].getBlue();
            
            pix[r][c].setGreen(pix[r][639-c].getGreen());
            pix[r][c].setRed(pix[r][639-c].getRed());
            pix[r][c].setBlue(pix[r][639-c].getBlue());
            
            pix[r][639-c].setGreen(green);
            pix[r][639-c].setRed(red);
            pix[r][639-c].setBlue(blue);
            }
            }
            

      } 
      
////////////////////////////////////////////////////////////////////////////////////////

      // REQUIRED FOR 80-POINTS
      public void upsideDown()
      {  
      
      Pixel[][] s = this.getPixels2D();
         for(int r = 0; r<240; r++)
         {
            for(int c = 0; c<640;c++)   
            {
            int red = s[r][c].getRed();
            int green = s[r][c].getGreen();
            int blue = s[r][c].getBlue();
            
            s[r][c].setGreen(s[479-r][c].getGreen());
            s[r][c].setRed(s[479-r][c].getRed());
            s[r][c].setBlue(s[479-r][c].getBlue());
            
            s[479-r][c].setGreen(green);
            s[479-r][c].setRed(red);
            s[479-r][c].setBlue(blue);
            }
            }

      
      }    
      
//////////////////////////////////////////////////////////////////////////////////////////

   // REQUIRED FOR 90-POINTS
   public void mirrorVertical()
   { 
   Pixel[][] pix = this.getPixels2D();
         for(int r = 0; r<450; r++)
         {
            for(int c = 0; c<240;c++)
            {
            int red = pix[r][c].getRed();
            int green = pix[r][c].getGreen();
            int blue = pix[r][c].getBlue();
            
            pix[r][479-c].setGreen(green);
            pix[r][479-c].setRed(red);
            pix[r][479-c].setBlue(blue);
            }
            }
   }
   
//////////////////////////////////////////////////////////////////////////////////
   
   // REQUIRED FOR 90-POINTS
   public void mirrorHorizontal()
   { 
   Pixel[][] pix = this.getPixels2D();
         for(int r = 0; r<225; r++)
         {
            for(int c = 0; c<480;c++)
            {
            int red = pix[r][c].getRed();
            int green = pix[r][c].getGreen();
            int blue = pix[r][c].getBlue();
            
            pix[449-r][c].setGreen(green);
            pix[449-r][c].setRed(red);
            pix[449-r][c].setBlue(blue);
            }
            }
   }
      
//////////////////////////////////////////////////////////////////////////////////////////////////      
    
   // REQUIRED FOR 90-POINTS
   public void mirrorDiagonal()
   {
    Pixel[][] pix = this.getPixels2D();
          for(int c = 0; c<450;c++)
           {
            for(int r = 0; r<450; r++)
            {
            int red = pix[r][c].getRed();
            int green = pix[r][c].getGreen();
            int blue = pix[r][c].getBlue();
            
            pix[c][r].setGreen(green);
            pix[c][r].setRed(red);
            pix[c][r].setBlue(blue);
            }
            }

   }
   
/////////////////////////////////////////////////////////////////////////////////////
   
   // REQUIRED FOR 100-POINTS
   public void mirrorTemple()
   { 
   Pixel[][] pix = this.getPixels2D();
         for(int r = 0; r<100; r++)
         {
            for(int c = 30; c<283;c++)
            {
            int red = pix[r][c].getRed();
            int green = pix[r][c].getGreen();
            int blue = pix[r][c].getBlue();
            
            pix[r][566-c].setGreen(green);
            pix[r][566-c].setRed(red);
            pix[r][566-c].setBlue(blue);
            }
            }
   }
   
} 
