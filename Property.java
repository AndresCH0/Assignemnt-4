
public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	
	//Constructors
	//Default 
	public Property() {}
	
	//Copy Constructor
	public Property(Property p){
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = Property(p);
	}
	
	//Pramaterized Property Constructor 
	public Property(String propertyName, String city, double rentAmount, String owner){
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	//Pramaterized Property and Plot Constructor
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth){
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x,y,width,depth);
	}

		
		
	//Sets the property's owner
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	
	
	
	//Sets the property's plot size	
	public Plot setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
		
		return plot;
	}

	
	
	
	//Setter and getter for the property's city
	public void setCity(String city) {
		this.city = city;
		
	}

	public String getCity() {
		return city;
	}
	
	
	
	
	//Setter and Getter for PropertyName
	public void setPropetyName(String propertyName) {
		this.propertyName = propertyName;
		
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	
	
	
	//Setter and getter for rentAmount
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public double getRentAmount() {
		
		return rentAmount;
	}
	
	
	//Prints out all the information about a property (city, name, owner, and the rent amount
	public String toString() {
		return "Property Name: " + propertyName + "\n" +
			   "Located in: " + city + "\n" +
			   "Belonging to: " + owner + "\n" +
			   "Rent Amount: " + rentAmount + " ";
	}
}
