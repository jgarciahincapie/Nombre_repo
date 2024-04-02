import java.awt.*;

/**
 * A strand that contains a line and can be manipulated.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */
public class Strand {

    private Line line;
    private int xStart; 
    private int yStart; 
    private int xEnd; 
    private int yEnd; 
    
    /**
     * Constructor for objects of class Strand.
     * 
     * @param xStart the x coordinate of the starting point of the line
     * @param yStart the y coordinate of the starting point of the line
     * @param xEnd   the x coordinate of the ending point of the line
     * @param yEnd   the y coordinate of the ending point of the line
     * @param color  the color of the line
     */
    public Strand(int xStart, int yStart, int xEnd, int yEnd) {
        this.xStart = xStart; 
        this.yStart = yStart; 
        this.xEnd = xEnd; 
        this.yEnd = yEnd; 
        line = new Line(xStart, yStart, xEnd, yEnd, "black");
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
    
    public int getXStart() {
    return xStart;
}

public int getYStart() {
    return yStart;
}

public int getXEnd() {
    return xEnd;
}

public int getYEnd() {
    return yEnd;
}



}
