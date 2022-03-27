
public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
//Constructors 
	//Default Constructor
	Plot(){
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
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
		//x,y coordinates for the bottom right corner of the plot
		int xr = plot.x + plot.width;
		int ybr = plot.y - plot.depth;
		//y coordinates for the top right corner
		int ytr = plot.y;
		
		//Center coordinates of the parameter plot
		int xcenter = (xr + x)/2;
		int ycenter = (ytr + y)/2;
		
		
		if(this.x < xcenter || this.x > x || this.x > xcenter) {
			
		}
		return false;
	}
}
