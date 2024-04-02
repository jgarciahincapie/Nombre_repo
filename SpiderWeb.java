import java.util.ArrayList;

/**
 * A spider web that contains multiple strands forming a web.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */
public class SpiderWeb {

    private ArrayList<Strand> strands;
    private ArrayList<Spot> spots;
    private ArrayList<Bridge> bridges;
    private int numStrands; 
    private int radio; 
    private int centerX; 
    private int centerY; 
    private boolean visible; 

    /**
     * Constructor for objects of class SpiderWeb.
     */
    public SpiderWeb(int numStrands , int radio) {
        strands = new ArrayList<Strand>();
        centerX = 400; 
        centerY = 400; 
        this.radio = radio ; 
        this.numStrands = numStrands; 
        visible = false; 
        buildSpiderWeb(); 
    }

    /**
     * Build a spider web with lines originating from a center point.
     */
    public void buildSpiderWeb() {
        double angleIncrement = 360.0 / numStrands;
        for (int i = 0; i < numStrands; i++) {
            double angle = Math.toRadians(i * angleIncrement);
            int xEnd = centerX + (int) (Math.cos(angle) * radio);
            int yEnd = centerY + (int) (Math.sin(angle) * radio);
            strands.add(new Strand(centerX, centerY, xEnd, yEnd));
        }
    }
    
    public void addBridge(int firstStrand, String color,int height){
        double angle = Math.toRadians(firstStrand * (360.0 / numStrands));
        int xInitial = centerX + (int) (Math.cos(angle) * height);
        int yInitial = centerY + (int) (Math.sin(angle) * height);
        double angle2 = Math.toRadians((firstStrand+1>numStrands ? 0 : firstStrand+1) * (360.0 / numStrands));
        int xFinal = centerX + (int) (Math.cos(angle2) * height);
        int yFinal = centerY + (int) (Math.sin(angle2) * height);
        Bridge bridge = new Bridge(xInitial, yInitial, xFinal, yFinal, color); 
        bridges.add(bridge); 
        if(visible)bridge.makeVisible(); 
    }

    /**
     * Make this spider web visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        for (Strand strand : strands) {
            strand.makeVisible();
        }
        visible = true; 
    }

    /**
     * Make this spider web invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible() {
        for (Strand strand : strands) {
            strand.makeInvisible();
        }
        visible = false; 
    }
    
    
    public static void main(String... args){
        SpiderWeb spiderWeb = new SpiderWeb(10 , 100);
        spiderWeb.addBridge(0, "red", 50); 
        spiderWeb.addBridge(1, "blue", 50); 
        spiderWeb.addBridge(2, "orange", 50); 
        spiderWeb.addBridge(3, "magenta", 50); 
        spiderWeb.makeVisible();
    }

    
}
