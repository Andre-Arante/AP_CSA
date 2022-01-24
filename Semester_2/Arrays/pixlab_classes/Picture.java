 import java.awt.image.BufferedImage;
import java.awt.Color;


/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture() {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     *
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     *
     * @param height the height of the desired picture
     * @param width  the width of the desired picture
     */
    public Picture(int height, int width) {
        // let the parent class handle this width and height
        super(width, height);
    }

    /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     *
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     *
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     *
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString() {
        String output = "Picture, filename " + getFileName() +
                " height " + getHeight()
                + " width " + getWidth();
        return output;

    }

    /**
     * Method that mirrors the picture around a
     * vertical mirror in the center of the picture
     * from left to right
     */
    public void mirrorVertical() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /**
     * Mirror just part of a picture of a temple
     */
    public void mirrorTemple() {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++) {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++) {

                leftPixel = pixels[row][col];
                rightPixel = pixels[row]
                        [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
                count++;
            }
        }
    }

    /**
      * Method to mirror the arms of a snowman
    */
    public void mirrorArms() {
      int mirrorPoint = 191;
      Pixel left, right = null;
      Pixel[][] pixels = this.getPixels2D();
      
      // box 1: (159, 104) to (191, 169)
      for (int row = 159; row < 191; row++) {
        for (int col = 104; col < 169; col++) {
          left = pixels[row][col];
          right = pixels[mirrorPoint - row + mirrorPoint][col];
          right.setColor(left.getColor());
        }
      }

      // box 2: (169, 236) to (194, 294)
      for (int row = 169; row < 194; row++) {
        for (int col = 236; col < 294; col++) {
          left = pixels[row][col];
          right = pixels[mirrorPoint - row + mirrorPoint][col];
          right.setColor(left.getColor());
        }
      }

    }

    /**
     * copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     *
     * @param fromPic  the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,
                     int startRow, int startCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow;
             fromRow < fromPixels.length &&
                     toRow < toPixels.length;
             fromRow++, toRow++) {
            for (int fromCol = 0, toCol = startCol;
                 fromCol < fromPixels[0].length &&
                         toCol < toPixels[0].length;
                 fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * Method to create a collage of several pictures
     */
    public void createCollage() {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1, 0, 0);
        this.copy(flower2, 100, 0);
        this.copy(flower1, 200, 0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue, 300, 0);
        this.copy(flower1, 400, 0);
        this.copy(flower2, 500, 0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

        /**
     * Method to set the blue to 0
     */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setBlue(0);
            }
        }
    }

    /**
     * Method to set none blue values to 0
     */
    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel px : rowArray) {
                px.setRed(0);
                px.setGreen(0);
            }
        }
    }

    /**
     * Method to negate an image
     **/
    public void negate() {
        for (Pixel[] rowArray : this.getPixels2D()) {
            for (Pixel px : rowArray) {
                px.setRed(255 - px.getRed());
                px.setGreen(255 - px.getGreen());
                px.setBlue(255 - px.getBlue());
            }
        }
    }

    /* Method to convert an image to grayscale by setting  RGB values to avg  */
    public void grayscale() {
      for (Pixel[] row : this.getPixels2D()) {
        for (Pixel px : row) {
          // get avg
          int avg = px.getRed() + px.getGreen() + px.getBlue();
          avg /= 3.0;

          // set all pixels to value
          px.setRed(avg);
          px.setGreen(avg);
          px.setBlue(avg);
        }
      }
    }

    // Method to fix underwater visability
    public void fixUnderwater() {
      for (Pixel[] row : this.getPixels2D()) {
        for (Pixel px : row) {
          px.setRed(px.getRed()*4);
        }
      }
    }

    // method to mirror horizontally
    public void mirrorHorizontal() {      
      Pixel[][] pixels = this.getPixels2D();
      Pixel top, bottom;
      top = bottom = null;
      int height = pixels.length;
      
      for (int r = 0; r < height/2; r++) {
        for (int c = 0; c < pixels[0].length; c++) {
          top = pixels[r][c];
          bottom = pixels[height - 1 - r][c];
          bottom.setColor(top.getColor());
        }
      }

    }

    public void mirrorDiagonal() {
      Pixel[][] pixels = this.getPixels2D();
      Pixel px, opp;
      px = opp = null;
      int max = pixels.length;
      if(pixels[0].length < max) {
        max = pixels[0].length;
      }

      for (int r = 0; r < max; r++) {
        for (int c = 0; c < r; c++) {
          // check for diagonal line
          
          px = pixels[c][r];
          opp = pixels[r][c];
          px.setColor(opp.getColor());
        }
      }
    }


    /**
     * /**
     * Method to show large changes in color
     *
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist) {
      Pixel left, right, top, bottom = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor, bottomColor = null;
      Picture s = new Picture("swan.jpg");
    
      
      // iterate left to right
      for(int row = 0; row < pixels.length; row++) {
        for(int col = 0; col < pixels[0].length-1; col++) {
          left = pixels[row][col];
          right = pixels[row][col+1];
          rightColor = right.getColor();
          if (left.colorDistance(rightColor) > edgeDist) {
            left.setColor(Color.BLACK);
          }
          else {
            left.setColor(Color.WHITE);
          }
        }
      }

      // Create a copy
      copy(s, 0, 0);
      pixels = this.getPixels2D();

      // iterate top to bottom
      for(int row = 0; row < pixels.length-1; row++) {
        for(int col = 0; col < pixels[0].length; col++) {
          top = pixels[row][col];
          bottom = pixels[row+1][col];
          bottomColor = bottom.getColor();
          if (top.colorDistance(bottomColor) > edgeDist) {
            top.setColor(Color.BLACK);
          }
          else {
            top.setColor(Color.WHITE);
          }
        }
      }
    }


    /* Main method for testing - each class in Java can have a main
     * method
     */
    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
