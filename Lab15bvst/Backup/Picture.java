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
      }
  
//////////////////////////////////////////////////////////////////////////  

      // REQUIRED FOR 80-POINTS
      public void mirror()
      {  
      } 
      
////////////////////////////////////////////////////////////////////////////////////////

      // REQUIRED FOR 80-POINTS
      public void upsideDown()
      {  
      }    
      
//////////////////////////////////////////////////////////////////////////////////////////

   // REQUIRED FOR 90-POINTS
   public void mirrorVertical()
   { 
   }
   
//////////////////////////////////////////////////////////////////////////////////
   
   // REQUIRED FOR 90-POINTS
   public void mirrorHorizontal()
   { 
   }
      
//////////////////////////////////////////////////////////////////////////////////////////////////      
    
   // REQUIRED FOR 90-POINTS
   public void mirrorDiagonal()
   { 
   }
   
/////////////////////////////////////////////////////////////////////////////////////
   
   // REQUIRED FOR 100-POINTS
   public void mirrorTemple()
   { 
   }
   
} 
