
/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {
    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** 
     *  Method to test Mirror temple
     */
    public static void testMirrorTemple() {
      Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal() {
      Picture motorcycle = new Picture("beach.jpg");
        motorcycle.mirrorHorizontal();
        motorcycle.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Method to test keepOnlyBlue
     **/
    public static void testKeepOnlyBlue() {
        Picture temple = new Picture("temple.jpg");
        temple.keepOnlyBlue();
        temple.explore();
    }

    public static void testNegate() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.negate();
        temple.explore();
    }

    public static void testGrayscale() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.grayscale();
        temple.explore();
    }

    public static void testFixUnderwater() {
      Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    public static void testMirrorDiagonal() {
      Picture beach = new Picture("beach.jpg");
      beach.mirrorDiagonal();
      beach.explore();
    }

    public static void testMirrorArms() {
      Picture snowman = new Picture("snowman.jpg");
      snowman.mirrorArms();
      snowman.explore();
    }

    public static void testEncodeAndDecode() {
      Picture msg = new Picture("msg.jpg");
      Picture beach = new Picture("beach.jpg");

      beach.encode(msg);
      beach.explore();

      beach.decode(msg);
      beach.explore();
    }

    public static void testChromakey() {
      Picture greenscreen = new Picture("shia.jpg");
      Picture beach = new Picture("beach.jpg");

      greenscreen.chromakey(beach);
      greenscreen.explore();
    }

    /**
     * Main method for testing.  Every class can have a main
     * method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        // testZeroBlue();
        // testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        // testNegate();
        // testGrayscale();
        // testFixUnderwater();
        // testMirrorVertical();
        // testMirrorHorizontal();
        //testMirrorTemple();
        // testMirrorArms();
        //testMirrorGull();
        // testMirrorDiagonal();
        //testCollage();
        //testCopy();
        // testEdgeDetection();
        //testEdgeDetection2();
        testChromakey();
        // testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
