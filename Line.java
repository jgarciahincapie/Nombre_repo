import java.awt.*;

/**
 * A line that can be manipulated and that draws itself on a canvas.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */
public class Line {

    private int xStart;
    private int yStart;
    private int xEnd;
    private int yEnd;
    private String color;
    private boolean isVisible;

    /**
     * Constructor for objects of class Line
     * 
     * @param xStart the x coordinate of the starting point
     * @param yStart the y coordinate of the starting point
     * @param xEnd the x coordinate of the ending point
     * @param yEnd the y coordinate of the ending point
     * @param color the color of the line
     */
    public Line(int xStart, int yStart, int xEnd, int yEnd, String color) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.color = color;
        this.isVisible = false;
    }

    /**
     * Make this line visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        isVisible = true;
        draw();
    }

    /**
     * Make this line invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible() {
        erase();
        isVisible = false;
    }

    /*
     * Draw the line with current specifications on screen.
     */
    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new java.awt.geom.Line2D.Double(xStart, yStart, xEnd, yEnd));
        }
    }

    /*
     * Erase the line on screen.
     */
    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    /**
     * Change the color of the line.
     * 
     * @param color the new color of the line
     */
    public void setColor(String color) {
        this.color = color;
        draw();
    }

    /**
     * Move the line horizontally.
     * 
     * @param distance the distance to move the line horizontally
     */
    public void moveHorizontal(int distance) {
        erase();
        xStart += distance;
        xEnd += distance;
        draw();
    }

    /**
     * Move the line vertically.
     * 
     * @param distance the distance to move the line vertically
     */
    public void moveVertical(int distance) {
        erase();
        yStart += distance;
        yEnd += distance;
        draw();
    }

    /**
     * Change the position of the line.
     * 
     * @param xStart the new x coordinate of the starting point
     * @param yStart the new y coordinate of the starting point
     * @param xEnd the new x coordinate of the ending point
     * @param yEnd the new y coordinate of the ending point
     */
    public void setPosition(int xStart, int yStart, int xEnd, int yEnd) {
        erase();
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        draw();
    }
}
