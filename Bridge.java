import java.awt.*;

/**
 * A strand that contains a line and can be manipulated.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */
public class Bridge {

    private Line line;

    /**
     * Constructor for objects of class Strand.
     * 
     * @param xStart the x coordinate of the starting point of the line
     * @param yStart the y coordinate of the starting point of the line
     * @param xEnd   the x coordinate of the ending point of the line
     * @param yEnd   the y coordinate of the ending point of the line
     * @param color  the color of the line
     */
    public Bridge(int xStart, int yStart, int xEnd, int yEnd, String color) {
        line = new Line(xStart, yStart, xEnd, yEnd, color);
    }

    /**
     * Make this strand visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        line.makeVisible();
    }

    /**
     * Make this strand invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible() {
        line.makeInvisible();
    }


}
