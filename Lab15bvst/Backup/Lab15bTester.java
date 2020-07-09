/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson
 *
 * 02-27-15 altered by Leon Schram
 * This class is a reduced version of the PictureTester class.
 * The file is reduced to concentrate of the Lab15b Assignment only. 
 */
 
 
 /////////////////////////////////////////////////////////////////////////////
 //
 // This Lab15b testing file is not be altered, except for comments.
 // Students do all their programming in the "Picture.java" file.
 // The file is identical for students and teachers.
 //
 // Three method calls in the main method need to be commented to test one
 // version at a time.
 //
 // Important:  The 100-Point version requires three tests:  80, 90 amd 100
 //             The 90-Point version requires two tests:     80 and 90
 //             The 80-point version requires only one test: 80
 //
 ////////////////////////////////////////////////////////////////////////////
 
 
public class Lab15bTester
{

   public static void main(String[] args)
   {
      test80Points();
      //test90Points();
      //test100Points();
   }


   public static void test80Points()
   {
      Picture pix = new Picture("beach.jpg");
      pix.explore();
      pix.grayScale();
      pix.explore();
      pix.mirror();
      pix.explore();
      pix.upsideDown();
      pix.explore();
   }
   
   public static void test90Points()
   {
      Picture pix1 = new Picture("motorcycle.jpg");
      pix1.explore();
      pix1.mirrorHorizontal();
      pix1.explore(); 
      Picture pix2 = new Picture("motorcycle.jpg");
      pix2.mirrorVertical();
      pix2.explore();
      Picture pix3 = new Picture("motorcycle.jpg");
      pix3.mirrorDiagonal();
      pix3.explore();
   }

   public static void test100Points()
   {
      Picture pix = new Picture("temple.jpg");
      pix.explore(); 
      pix.mirrorTemple();
      pix.explore();
   }
      
}