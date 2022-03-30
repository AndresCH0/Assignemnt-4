
public class ManagementCompany {
//Constants
	private final int MAX_PROPERTY = 5;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	
//Instance Variables
	private double mgmFeePer;
	private String name;
	private String taxID;
	private Plot plot;
	private int count = 0;
	
//Property Array
	private Property[] properties = new Property[MAX_PROPERTY];

	
//Constructors
	//Default constructor
	public ManagementCompany(){
		properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.name = "";
		this.taxID = "";
		Property property = new Property();
		properties [count] = property;
		count++;
	}

	//Parameterized Constructor for Management object default Plot object
	public ManagementCompany(String name, String taxID, double mgmFee) {
		properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		Property property = new Property();
		properties [count] = property;
		count++;
	}
	
	//Parameterized Constructor for Management object and Plot object
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth){
		properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(x, y, width, depth);
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		Property property = new Property();
		properties [count] = property;
		count++;
	} 
	
	//Copy Constructor
	public ManagementCompany(ManagementCompany otherCompany) {
		properties = new Property[MAX_PROPERTY];
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		Property property;
		for(int i = 0 ; i<
		count++;
	}
	
	
	
	
//Methods
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	
	
	
	
	//Add Property to the array. 
	//argument: Property object
	public int addProperty(Property property) {
		properties[count] = property;
		count++;
		
		int i;
		for(i = 0; i < count; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot()))
				return -4;
		}
		
		if(count == MAX_PROPERTY) {
			return -1;
		}
		
		else if(property.equals(null)) {
			return -2;
		}
		else if(this.plot.encompasses(property.getPlot()) ) {
			return -3;
		}
		else{
			properties[count] = property;
			count++;
			return count;
		}
	}
	
	//creates new property object with the passed parameter values and adds it to the array 
	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner, 0, 0, 1, 1);
		
		properties[count] = property;
		count++;
		System.out.println(count);
		int i;
		for(i = 0; i < count; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot()))

				return -4;
		}
		
		if(count == MAX_PROPERTY) {
			return -1;
		}
		
		else if(property.equals(null)) {
			return -2;
		}
		else if(this.plot.encompasses(property.getPlot()) ) {
			return -3;
		}
		else{
			properties[count] = property;
			System.out.println(count);
			return count;
		}
	}

	
	//Creates new property object and plot with the parameter values
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		//properties[count] = property;
		int i;
		for(i = 0; i < count; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot()))
				
				return -4;
		}
		
		if(count == MAX_PROPERTY) {
			return -1;
		}
		
		else if(property.equals(null)) {
			return -2;
		}
		else if(this.plot.encompasses(property.getPlot()) ) {
			return -3;
		}
		else{
			properties[count] = property;
			
			System.out.println(count);
			return count;
		}
	}

	
	//Adds all the rent values of the properties within the array
	public double totalRent() {
		double totalRent = 0.0;
		for(int i = 0; i < count; i++) {
				totalRent += properties[i].getRentAmount();	
		}
		return totalRent;
	}
	
	
	
	//Finds the property with the highest rent amount and return the rent amount
	public double maxRentProp() {
		double maxRentProp = 0.0;
		maxRentProp = properties[maxRentPropertyIndex()].getRentAmount();
		return maxRentProp;
	}
	
	
	
	//Find the property with the highest rent amount and returns it's array index location
	private int maxRentPropertyIndex() {
		int maxIndex = 0;
		for(int i = 0; i < count; i++) {
			if(properties[i] != null) {
				if(properties[maxIndex].getRentAmount() < properties[i].getRentAmount()) {
					maxIndex = i;
				}
			}
		}
		return maxIndex;
	}
	
	
	//Displays the property info of an element from the properties[] array at a given index
	private String displayPropertyAtIndex(int i) {
		return "Property Name: " + properties[i].getPropertyName() + " Located in: " + properties[i].getCity() + " Belonging to: " + properties[i].getOwner() +
				" Rent Amount: " + properties[i].getRentAmount();
	}
	
	//Returns the plot
	public Plot getPlot() {
		return plot;
	}
	
	public String getName() {
		return name;
	}
}
