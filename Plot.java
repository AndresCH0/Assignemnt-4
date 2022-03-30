
public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
//Constructors 
	//Default Constructor
	public Plot(){
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	//Copy Constructor
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	//Parameterized Constructor 
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
//Methods
	
	//Determines if this plot overlaps the parameter,returns true if the two plots overlap, false otherwise
	public boolean overlaps(Plot plot) {
		
		//Bottom right Coordinates for this.plot
		xBR = (this.plot.getX() + this.plot.getWidth());
		yBR = (this.plot.getY() + this.plot.getLength());
		
		//Bottom Right Coordinates For The Argument Plot
		argBRX = (plot.getX() + plot.getWidth());
		argBRY = (plot.getY() - plot.getLength());
		if(plot.getX() >= (plot.getX() + plot.getWidth()) || this.plot.getX() >= (plot.getX() + plot.getWidth()) || plot.getY >= (this.plot.getY() + this.plot.getLength()) || this.plot.getY >= (plot.getY() + plot.getLength())){
			return false;
		}else{
			return true;
		}
	}
	
	
	//Encompass Method: checks if a given plot is within the current plot
	public  boolean encompasses(Plot plot) {
		boolean inX, inY, inWidth, inDepth;
		inX = plot.x >= x;
		inY = plot.y >= y;
		inWidth = (plot.x + plot.width) <= (x + width);
		inDepth = (plot.y + plot.depth) <= (y + depth);
		return inX && inY && inWidth && inDepth;
	}
	
	
	//Setter and Getter for the x value
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	
	
	//Getter and Setter the y value
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	
	
	//Setter and Getter for the width variable
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	
	
	//Getter and Setter for the depth variable
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	
	
	//prints out the name, city, owner, and rent amount 
	public String toString() {
		return "Upper left: ("+ x + "," + y + ");" + " Width: " + width + " " + "Depth: " + depth;
	}
}
