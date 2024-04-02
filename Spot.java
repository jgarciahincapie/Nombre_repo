import java.awt.*;

/**
 * A spot with a circle.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */
public class Spot {

    private Circle circle;

    /**
     * Constructor for objects of class Spot.
     * 
     * @param x       the x coordinate of the center of the circle
     * @param y       the y coordinate of the center of the circle
     * @param radius  the radius of the circle
     * @param color   the color of the circle
     */
    public Spot(int x, int y, int radius, String color) {
        circle = new Circle(x, y, radius, color);
    }

    /**
     * Make this spot visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        circle.makeVisible();
    }

    /**
     * Make this spot invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible() {
        circle.makeInvisible();
    }

    /**
     * Move the spot horizontally.
     * 
     * @param distance the distance to move the spot horizontally
     */
    public void moveHorizontal(int distance) {
        circle.moveHorizontal(distance);
    }

    /**
     * Move the spot vertically.
     * 
     * @param distance the distance to move the spot vertically
     */
    public void moveVertical(int distance) {
        circle.moveVertical(distance);
    }

  
}
