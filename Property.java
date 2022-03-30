
public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	
	//Constructors
	//Default 
	public Property() {
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0.0;
		plot = new Plot();
	}
	
	//Copy Constructor
	public Property(Property p){
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot(p.plot);
	}


	//Parameterized Property Constructor 
	public Property(String propertyName, String city, double rentAmount, String owner){
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	//Parameterized Property and Plot Constructor
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
	
	
	
	
	//Setter and Getter for the property's plot	
	public Plot setPlot(int x, int y, int width, int depth) {
		return new Plot(x, y, width, depth);
	}

	public Plot getPlot() {
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
